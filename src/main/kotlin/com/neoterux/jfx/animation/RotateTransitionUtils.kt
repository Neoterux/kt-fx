@file: JvmName("AnimUtils")
@file: JvmMultifileClass
package com.neoterux.jfx.animation

import com.neoterux.jfx.convertion.millis
import javafx.animation.RotateTransition
import javafx.animation.SequentialTransition
import javafx.scene.Node
import javafx.util.Duration

/**
 * Set the step angle (sexagesimal) that the rotation will use to rotate.
 */
fun RotateTransition.byAngle(angle: Double) = this.apply { byAngle = angle }

/**
 * Set the step angle (sexagesimal) that the rotation will use to rotate
 */
fun RotateTransition.byAngle(angle: Int) = this.byAngle(angle.toDouble())

/**
 * Set the step angle (sexagesimal) that the rotation will use to rotate
 */
fun RotateTransition.byAngle(angle: Float) = this.byAngle(angle.toDouble())

/**
 * Set the step angle (sexagesimal) that the rotation will use to rotate
 */
fun RotateTransition.byAngle(angle: Long) = this.byAngle(angle.toDouble())

/**
 * Creates a new [SequentialTransition] with a [pause duration][pauseDuration] and later this Rotation transition.
 * By default doesn't have pause duration.
 */
fun RotateTransition.sequentialTransition(pauseDuration: Duration = 0.millis()) = this.sequentialTransition(pauseDuration, this.node)


/**
 * Set the target angle of the rotation in sexagesimal.
 */
fun RotateTransition.toAngle(angle: Double) = this.apply { toAngle = angle }

/**
 * Set the target angle of the rotation in sexagesimal.
 */
fun RotateTransition.toAngle(angle: Int) = this.toAngle(angle.toDouble())

/**
 * Set the target angle of the rotation in sexagesimal.
 */
fun RotateTransition.toAngle(angle: Float) = this.toAngle(angle.toDouble())

/**
 * Set the target angle of the rotation in sexagesimal.
 */
fun RotateTransition.toAngle(angle: Long) = this.toAngle(angle.toDouble())


/**
 * Set the start angle of the rotation in sexagesimal.
 */
fun RotateTransition.fromAngle(angle: Double) = this.apply { fromAngle = angle }

/**
 * Set the start angle of the rotation in sexagesimal.
 */
fun RotateTransition.fromAngle(angle: Float) = this.fromAngle(angle.toDouble())

/**
 * Set the start angle of the rotation in sexagesimal.
 */
fun RotateTransition.fromAngle(angle: Int) = this.fromAngle(angle.toDouble())

/**
 * Set the start angle of the rotation in sexagesimal.
 */
fun RotateTransition.fromAngle(angle: Long) = this.fromAngle(angle.toDouble())

/**
 * Configures the Rotate Transitions angles.
 * @param from from angle.
 * @param to to angle.
 * @param by step angle of the transition. By default is 1
 */
fun RotateTransition.angles(from: Double, to: Double, by: Double=1.0) = this
    .apply {
        fromAngle = from
        toAngle = to
        byAngle = by
    }

/**
 * Configures the Rotate Transitions angles.
 * @param from from angle.
 * @param to to angle.
 * @param by step angle of the transition. By default is 1
 */
fun RotateTransition.angles(from: Int, to: Int, by: Int = 1) = this.angles(from.toDouble(), to.toDouble(), by.toDouble())

/**
 * Configures the Rotate Transitions angles.
 * @param from from angle.
 * @param to to angle.
 * @param by step angle of the transition. By default is 1
 */
fun RotateTransition.angles(from: Float, to: Float, by: Float = 1f) = this.angles(from.toDouble(), to.toDouble(), by.toDouble())

/**
 * Creates a new rotate transition with the specified Node
 * @param ms duration of the transition
 * @param node Node that will be applied the transition.
 */
fun RotateTransition(ms: Int, target: Node): RotateTransition = RotateTransition(ms.millis(), target)

fun Node.rotate(ms: Int) = RotateTransition(ms, this)
