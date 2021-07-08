@file: JvmName("ConvUtils")
@file: JvmMultifileClass
package com.neoterux.jfx.convertion

import javafx.geometry.Insets
import javafx.scene.layout.Background
import javafx.scene.layout.BackgroundFill
import javafx.scene.layout.CornerRadii
import javafx.scene.paint.Paint


/**
 * Create a new Paint of specific color with a string in css format.
 */
fun paintOf(representation: String) = Paint.valueOf(representation)

/**
 * Create a new Paint of specific color by name.
 */
fun colorOf(color: String) = Paint.valueOf(color)

/**
 * Create a new Paint of specific color in hex. Only need hex value the character '#' is
 * inserted by default.
 */
fun hexColor(hex: String) = Paint.valueOf("#$hex")

/**
 * Create a new Color with rgb color code.
 */
fun rgb(r: Int, g: Int, b: Int) = Paint.valueOf("rgb($r, $g, $b)")

/**
 * Create a new Color with alpha and rgb color code.
 */
fun rgba(r: Int, g: Int, b: Int, a: Double) = Paint.valueOf("rgba($r, $g, $b, $a)")

/**
 * Create a new Color with css string format
 */
fun String.toPaint() = paintOf(this)

/**
 * Create a new background for a node with the paint
 */
fun Paint.toBackground() = Background(BackgroundFill(this, CornerRadii.EMPTY, Insets.EMPTY))

/**
 * Wrapper of [toBackground] and [toPaint].
 * Create  a new background for a node with the paint generated from css format string.
 */
fun String.toBackground() = toPaint().toBackground()


