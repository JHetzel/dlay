package de.juliushetzel.presentation.components

import de.juliushetzel.presentation.DlayView
import de.juliushetzel.util.toDoubleOrZero
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.layout.Pane
import tornadofx.*

fun DlayView.toolbarComponent(): Pane = borderpane {
    paddingAll = 8.0
    center = anchorpane {
        fitToParentWidth()
        add(textfield {
            alignment = Pos.CENTER_RIGHT
            filterInput { it.controlNewText.isInt() || it.controlNewText.isDouble() && it.controlNewText.length < 10 }
            textProperty().onChange {
                bpmProperty.set(it.toDoubleOrZero())
            }
        })

        add(label("BPM:") {
            padding = Insets(
                    4.0,
                    0.0,
                    4.0,
                    8.0
            )
        })
    }
}