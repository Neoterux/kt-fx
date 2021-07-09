package com.neoterux.jfx.animation

import javafx.animation.Animation
import javafx.animation.ParallelTransition
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.Node
import java.util.*


/**
 * ## ParallelTransitionBuilder class
 * Handler for building Parallel transitions.
 *
 * @param node the target node that the parallel transition would be applied.
 */
class ParallelTransitionBuilder(private val node: Node) {

    /**
     * Contains all the animations that will be applied to [node]
     */
    private val animationStack = Stack<Animation>()

    /**
     * Contains the listener when all the animations ends.
     */
    private var finishListener: EventHandler<ActionEvent>? = null

    /**
     * Add an [javafx.animation.Animation] to the stack of animations that will be played.
     */
    fun addTransition(transition: Animation): ParallelTransitionBuilder {
        animationStack.push(transition)
        return this
    }

    /**
     * Set the listener when the parallel Transition end all the animations in the stack.
     */
    fun onFinishListener(listener: EventHandler<ActionEvent>): ParallelTransitionBuilder{
        this.finishListener = listener
        return this
    }

    /**
     * Create a new [ParallelTransition] with the parameters added in the builder.
     * @return [ParallelTransition]
     */
    fun build(): ParallelTransition = ParallelTransition(node, *animationStack.toTypedArray())
                                        .apply { onFinished = finishListener }
}