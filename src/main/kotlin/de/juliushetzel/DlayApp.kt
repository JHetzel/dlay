package de.juliushetzel

import de.juliushetzel.presentation.DlayView
import javafx.scene.paint.Color
import javafx.stage.Stage
import javafx.stage.StageStyle
import tornadofx.*

class DlayApp : App(DlayView::class) {

    override fun start(stage: Stage) {
        stage.icons.clear()
        stage.icons.addAll(Resources.Images.logo)
        stage.initStyle(StageStyle.TRANSPARENT)
        super.start(stage)
        stage.scene.fill = Color.TRANSPARENT // Fill our scene with nothing
    }
}

fun main(args: Array<String>) {
    launch<DlayApp>(args)
}