package de.juliushetzel.presentation.components

import de.juliushetzel.Resources
import de.juliushetzel.presentation.DlayStyles.Companion.buttonClose
import de.juliushetzel.presentation.DlayView
import javafx.geometry.Insets
import javafx.scene.layout.Pane
import tornadofx.*

fun DlayView.windowBarComponent(): Pane = borderpane {
    padding = Insets(8.0, 8.0, 8.0, 8.0)
    left = imageview(Resources.Images.icon) {
        fitHeight = 16.0
    }
    right = button {
        addClass(buttonClose)
        setOnAction { System.exit(0) }
    }
}