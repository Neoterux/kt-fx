@file:JvmName("PaneUtils")
package com.neoterux.jfx.pane

import javafx.scene.layout.AnchorPane
import javafx.scene.layout.Pane

fun Pane.setAnchors(top:Double = 1.0, right: Double = top, bottom: Double = top, left: Double = top){
    AnchorPane.setTopAnchor(this, top)
    AnchorPane.setRightAnchor(this, right)
    AnchorPane.setBottomAnchor(this, bottom)
    AnchorPane.setLeftAnchor(this, left)
}