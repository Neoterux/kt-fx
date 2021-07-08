/**
 * This class provide methods to the convertion of Numeric values to
 * a specific Duration, for more see [Duration][javafx.util.Duration]
 */
@file: JvmName("ConvUtils")
package com.neoterux.jfx.convertion

import javafx.util.Duration

//## Integer
/**
 * Converts the int value to a [Duration] of milliseconds.
 */
fun Int.millis() = this.toDouble().millis()

/**
 * Converts the int value to a [Duration] of seconds.
 */
fun Int.secs() = this.toDouble().secs()

/**
 * Converts the int value to a [Duration] of minutes.
 */
fun Int.mins() = this.toDouble().mins()

/**
 * Converts the int value to a [Duration] of hours.
 */
fun Int.hours() = this.toDouble().hours()

//## Float

/**
 * Converts the value in float to a [Duration] of milliseconds.
 */
fun Float.millis() = this.toDouble().millis()

/**
 * Converts the int value to a [Duration] of seconds.
 */
fun Float.secs() = this.toDouble().secs()

/**
 * Converts the float value to a [Duration] of minutes.
 */
fun Float.mins() = this.toDouble().mins()

/**
 * Converts the float value to a [Duration] of hours.
 */
fun Float.hours() = this.toDouble().hours()

//## Long

/**
 * Converts the value in long to a [Duration] of milliseconds.
 */
fun Long.millis() = this.toDouble().millis()

/**
 * Converts the long value to a [Duration] of seconds.
 */
fun Long.secs() = this.toDouble().secs()

/**
 * Converts the long value to a [Duration] of minutes.
 */
fun Long.mins() = this.toDouble().mins()

/**
 * Converts the long value to a [Duration] of hours.
 */
fun Long.hours() = this.toDouble().hours()

//## Double

/**
 * Converts the double value to a [Duration] of milliseconds.
 */
fun Double.millis() = Duration.millis(this)

/**
 * Converts the double value to a [Duration] of hours.
 */
fun Double.hours() = Duration.hours(this)

/**
 * Converts the double value to a [Duration] of minutes.
 */
fun Double.mins() = Duration.minutes(this)

/**
 * Converts the double value to a [Duration] of seconds.
 */
fun Double.secs() = Duration.seconds(this)


// ## Maths
/**
 * Convert the Number value of degrees to radians.
 */
val Number.rad: Double
    get() = Math.toRadians(toDouble())


