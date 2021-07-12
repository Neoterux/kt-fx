@file:JvmName("PaneUtils")
package com.neoterux.jfx.pane

import javafx.scene.Node
import javafx.scene.layout.AnchorPane
import javafx.scene.layout.Pane
import javafx.scene.layout.Region

fun Pane.setAnchors(top:Double = 1.0, right: Double = top, bottom: Double = top, left: Double = top){
    AnchorPane.setTopAnchor(this, top)
    AnchorPane.setRightAnchor(this, right)
    AnchorPane.setBottomAnchor(this, bottom)
    AnchorPane.setLeftAnchor(this, left)
}

/**
 * Add a node to the Pane children hierarchy.
 */
fun Pane.addChild(node: Node) = children.add(node)

/**
 * Add multiple children to the Pane hierarchy.
 */
fun Pane.addChildren(vararg nodes: Node) = children.addAll(nodes)

/**
 * Remove a child from the hierarchy.
 */
fun Pane.removeChild(node: Node) = children.remove(node)

/**
 * Remove multiple children from the hierarchy.
 */
fun Pane.removeChildren(vararg nodes: Node) = children.removeAll(nodes)

/**
 * Sets the widths of the node.
 * @param min minWidth
 * @param max maxWidth
 * @param pref prefered width, by default is [Region.USE_COMPUTED_SIZE]
 */
fun Pane.setWidths(min: Double, max: Double, pref: Double = Region.USE_COMPUTED_SIZE) {
    minWidth = min
    maxWidth = max
    prefWidth = pref
}

/**
 * Set the same values to all widths.
 * @param all the width to set to the node.
 */
fun Pane.setWidths(all: Double) = setWidths(all, all, all)

/**
 * Sets the heights of the node.
 * @param min minHeight
 * @param max maxHeight
 * @param pref prefered height, by default is [Region.USE_COMPUTED_SIZE]
 */
fun Pane.setHeights(min: Double, max: Double, pref: Double = Region.USE_COMPUTED_SIZE) {
    minHeight = min
    maxHeight = max
    prefHeight = pref
}

/**
 * Set the same values to all height.
 * @param all the height to set to the node.
 */
fun Pane.setHeights(all: Double) = setHeights(all, all, all)

