@file: JvmName("AnimUtils")
@file: JvmMultifileClass
package com.neoterux.jfx.animation

import javafx.animation.TranslateTransition

/**
 * Set the step value of the translation in the x coord.
 * @param stepx step value
 */
fun TranslateTransition.byX(stepx: Double) = this.apply { byX = stepx }

/**
 * Set the step value of the translation in the x coord.
 * @param stepx step value
 */
fun TranslateTransition.byX(stepx: Int) = this.byX(stepx.toDouble())

/**
 * Set the step value of the translation in the x coord.
 * @param stepx step value
 */
fun TranslateTransition.byX(stepx: Float) = this.byX(stepx.toDouble())

/**
 * Set the step value of the translation in the x coord.
 * @param stepx step value
 */
fun TranslateTransition.byX(stepx: Long) = this.byX(stepx.toDouble())

/**
 * Set the target x coord where the transition stop.
 * @param x target x Coord.
 */
fun TranslateTransition.toX(x: Double) = this.apply { toX = x }

/**
 * Set the target x coord where the transition stop.
 * @param x target x Coord.
 */
fun TranslateTransition.toX(x: Int) = this.toX(x.toDouble())

/**
 * Set the target x coord where the transition stop.
 * @param x target x Coord.
 */
fun TranslateTransition.toX(x: Float) = this.toX(x.toDouble())

/**
 * Set the target x coord where the transition stop.
 * @param x target x Coord.
 */
fun TranslateTransition.toX(x: Long) = this.toX(x.toDouble())


/**
 * Set the start x coord where the transition start.
 * @param x starting position of the x coord.
 */
fun TranslateTransition.fromX(x: Double) = this.apply { fromX = x }

/**
 * Set the start x coord where the transition start.
 * @param x starting position of the x coord.
 */
fun TranslateTransition.fromX(x: Int) = this.fromX(x.toDouble())

/**
 * Set the start x coord where the transition start.
 * @param x starting position of the x coord.
 */
fun TranslateTransition.fromX(x: Float) = this.fromX(x.toDouble())

/**
 * Set the start x coord where the transition start.
 * @param x starting position of the x coord.
 */
fun TranslateTransition.fromX(x: Long) = this.fromX(x.toDouble())

/**
 * Set the step value of the translation in the y coord.
 * @param stepy step value
 */
fun TranslateTransition.byY(stepy: Double) = this.apply { byY = stepy }

/**
 * Set the step value of the translation in the y coord.
 * @param stepy step value
 */
fun TranslateTransition.byY(stepy: Int) = this.byY(stepy.toDouble())

/**
 * Set the step value of the translation in the y coord.
 * @param stepy step value
 */
fun TranslateTransition.byY(stepy: Float) = this.byY(stepy.toDouble())

/**
 * Set the step value of the translation in the y coord.
 * @param stepy step value
 */
fun TranslateTransition.byY(stepy: Long) = this.byY(stepy.toDouble())

/**
 * Set the target x coord where the transition stop.
 * @param y target x Coord.
 */
fun TranslateTransition.toY(y: Double) = this.apply { toY = y }

/**
 * Set the target x coord where the transition stop.
 * @param y target x Coord.
 */
fun TranslateTransition.toY(y: Int) = this.toY(y.toDouble())

/**
 * Set the target x coord where the transition stop.
 * @param y target x Coord.
 */
fun TranslateTransition.toY(y: Float) = this.toY(y.toDouble())

/**
 * Set the target x coord where the transition stop.
 * @param y target x Coord.
 */
fun TranslateTransition.toY(y: Long) = this.toY(y.toDouble())

/**
 * Set the start y coord where the transition start.
 * @param y starting position of the x coord.
 */
fun TranslateTransition.fromY(y: Double) = this.apply { fromX = y }

/**
 * Set the start y coord where the transition start.
 * @param y starting position of the x coord.
 */
fun TranslateTransition.fromY(y: Int) = this.fromY(y.toDouble())

/**
 * Set the start y coord where the transition start.
 * @param y starting position of the x coord.
 */
fun TranslateTransition.fromY(y: Float) = this.fromY(y.toDouble())

/**
 * Set the start y coord where the transition start.
 * @param y starting position of the x coord.
 */
fun TranslateTransition.fromY(y: Long) = this.fromY(y.toDouble())
