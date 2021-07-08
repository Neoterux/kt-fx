@file: JvmName("AnimUtils")
@file: JvmMultifileClass
package com.neoterux.jfx.animation

import javafx.animation.FadeTransition

/**
 * Set the start value of the opacity to the Fade.
 * @param value start value of the opacity [0.0, 1.0]
 */
fun FadeTransition.fromValue(value: Double) = this.apply { fromValue = value }

/**
 * Set the start value of the opacity to the Fade.
 * @param value start value of the opacity [0.0, 1.0]
 */
fun FadeTransition.fromValue(value: Float) = this.fromValue(value.toDouble())

/**
 * Set the target value of the opacity to the Fade.
 * @param value target value of the opacity [0.0, 1.0]
 */
fun FadeTransition.toValue(value: Double) = this.apply { toValue = value }

/**
 * Set the target value of the opacity to the Fade.
 * @param value target value of the opacity [0.0, 1.0]
 */
fun FadeTransition.toValue(value: Float) = this.toValue(value.toDouble())

/**
 * Set the step value of the opacity to the Fade.
 * @param value step value of the opacity [0.0, 1.0]
 */
fun FadeTransition.byValue (value: Double) = this.apply { byValue = value }

/**
 * Set the step value of the opacity to the Fade.
 * @param value step value of the opacity [0.0, 1.0]
 */
fun FadeTransition.byValue (value: Float) = this.byValue(value.toDouble())


