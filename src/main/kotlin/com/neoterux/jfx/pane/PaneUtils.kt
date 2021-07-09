@file:JvmName("PaneUtils")
package com.neoterux.jfx.pane

import javafx.scene.Node
import javafx.scene.layout.AnchorPane
import javafx.scene.layout.Pane

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
