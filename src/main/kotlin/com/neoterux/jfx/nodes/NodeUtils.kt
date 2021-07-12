@file:JvmName("NodeUtils")
package com.neoterux.jfx.nodes

import javafx.scene.Node
import javafx.scene.layout.Region

/**
 * Add a new CSS StyleSheet from a specific location.
 */
fun Node.addStyleSheet(loc: String) {
    this.scene.stylesheets.add(loc)
}

/**
 * Sets the widths of the node.
 * @param min minWidth
 * @param max maxWidth
 * @param pref prefered width, by default is [Region.USE_COMPUTED_SIZE]
 */
fun Node.setWidths(min: Double, max: Double, pref: Double = Region.USE_COMPUTED_SIZE) {
    minWidth(min)
    maxWidth(max)
    prefWidth(pref)
}

/**
 * Set the same values to all widths.
 * @param all the width to set to the node.
 */
fun Node.setWidths(all: Double) = setWidths(all, all, all)

/**
 * Sets the heights of the node.
 * @param min minHeight
 * @param max maxHeight
 * @param pref prefered height, by default is [Region.USE_COMPUTED_SIZE]
 */
fun Node.setHeights(min: Double, max: Double, pref: Double = Region.USE_COMPUTED_SIZE) {
    minHeight(min)
    maxHeight(max)
    prefHeight(pref)
}

/**
 * Set the same values to all height.
 * @param all the height to set to the node.
 */
fun Node.setHeights(all: Double) = setHeights(all, all, all)

/**
 * Add css style hard-coded string
 */
fun Node.style(vararg cssLines: String)  { this.style = cssLines.joinToString(separator = "\n") }
