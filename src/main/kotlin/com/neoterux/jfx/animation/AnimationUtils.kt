@file: JvmName("AnimUtils")
package com.neoterux.jfx.animation

import javafx.animation.*
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.Node
import javafx.util.Duration

/**
 * Contains method to handle Animations more easily
 */

/**
 * Add an [Interpolator] to the animation.
 */
fun <T: Transition> T.interpolator(interpolator: Interpolator): T = this.apply { this.interpolator = interpolator }

/**
 * Add the cycle count of the repetitions.
 */
fun <T: Transition> T.cycleCount(count: Int) = this.apply { cycleCount = count }

/**
 * Apply only one cycle to the transition.
 */
fun <T: Transition> T.singleCount() = this.cycleCount(1)

/**
 * Add a delay of specific [Duration] to the animation at start.
 */
fun <T: Transition> T.delay(time: Duration) = this.apply { delay = time }

//fun <T: Transition> T.delay(time: Int) = this.apply { delay = time. }

/**
 * Creates a new [SequentialTransition] with a [pause duration][pauseDuration] and this Animation, this will be applied to
 * the specified [node].
 */
fun <T: Transition> T.sequentialTransition(pauseDuration: Duration, node: Node) = SequentialTransition(node, PauseTransition(pauseDuration), this)

fun <T: Animation> T.onFinished(action: EventHandler<ActionEvent>) = this.apply { onFinished = action }
