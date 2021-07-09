@file: JvmMultifileClass
@file: JvmName("AnimDsl")
package com.neoterux.jfx.animation

import javafx.scene.Node

fun Node.parallelTransition() = ParallelTransitionBuilder(this)
