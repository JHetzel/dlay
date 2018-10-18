package de.juliushetzel.presentation.components

import de.juliushetzel.presentation.DlayStyles
import de.juliushetzel.presentation.DlayView
import de.juliushetzel.util.copyToClipboard
import de.juliushetzel.util.format
import de.juliushetzel.util.toStringOrZero
import javafx.scene.layout.Pane
import tornadofx.*

fun DlayView.resultViewComponent(): Pane = vbox {
    spacing = 8.0
    paddingAll = 8.0
    add(createRowForNote(1, 2))
    add(createRowForNote(1, 3))
    add(createRowForNote(1, 4))
    add(createRowForNote(1, 6))
    add(createRowForNote(1, 8))
    add(createRowForNote(1, 12))
    add(createRowForNote(1, 16))
    add(createRowForNote(1, 24))
    add(createRowForNote(1, 32))
    add(createRowForNote(1, 48))
    add(createRowForNote(1, 64))
    add(createRowForNote(1, 96))
    add(createRowForNote(1, 128))
}

internal fun DlayView.createRowForNote(counter: Int, denominator: Int): Pane = borderpane {
    top = label("$counter/$denominator") { addClass(DlayStyles.labelNote) }
    left = label {
        text = "0.0ms"
        var time = 0.0

        setOnMouseClicked {
            time.toString().copyToClipboard()
        }

        bpmProperty.onChange {
            time = ((240.0 * counter / denominator) / it).format("%.4f")
            text = time.toStringOrZero() + "ms"
        }
    }
    right = label {
        text = "0.0Hz"
        var time = 0.0

        setOnMouseClicked {
            time.toString().copyToClipboard()
        }

        bpmProperty.onChange {
            time = (it / (240.0 * counter / denominator)).format("%.2f")
            text = time.toStringOrZero() + "Hz"
        }
    }
}