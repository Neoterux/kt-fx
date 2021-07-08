@file:JvmName("PropUtils")
package com.neoterux.jfx.extras

import javafx.beans.Observable
import javafx.beans.property.ReadOnlyBooleanProperty

fun ReadOnlyBooleanProperty.addChangeListener(listener: (Observable, Boolean, Boolean) -> Unit) {
    this.addListener { observable, oldValue, newValue -> listener(observable, oldValue, newValue)}
}