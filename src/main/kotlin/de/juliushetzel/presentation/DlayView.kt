package de.juliushetzel.presentation

import de.juliushetzel.presentation.components.resultViewComponent
import de.juliushetzel.presentation.components.toolbarComponent
import de.juliushetzel.presentation.components.windowBarComponent
import javafx.beans.property.DoubleProperty
import javafx.beans.property.SimpleDoubleProperty
import javafx.event.EventHandler
import javafx.scene.effect.BlurType
import javafx.scene.effect.DropShadow
import javafx.scene.effect.Effect
import javafx.scene.input.MouseEvent
import javafx.scene.layout.Background
import javafx.scene.layout.BorderPane
import javafx.scene.layout.Pane
import javafx.scene.paint.Color
import tornadofx.*

class DlayView : View(), DlayContract.View {
    private val dragMouseDragListener = DragMouseDragListener()
    private val dragMousePressListener = DragMousePressListener()
    private var lastPositionX = 0.0
    private var lastPositionY = 0.0
    private var windowOffsetX: Double = 0.toDouble()
    private var windowOffsetY: Double = 0.toDouble()

    init {
        importStylesheet<DlayStyles>()
    }

    val bpmProperty: DoubleProperty = SimpleDoubleProperty()

    override val root: BorderPane = borderpane {
        paddingAll = 16.0
        background = Background.EMPTY
        center = borderpane {
            setupForDraggingWindow(this)
            addClass(DlayStyles.content)
            effect = DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 0, 0, 0.4), 10.0, 0.5, 0.0, 0.0)
            top = windowBarComponent()
            center = borderpane {
                top = toolbarComponent()
                center = resultViewComponent()
            }
        }
    }

    private fun setupForDraggingWindow(pane: Pane) {
        pane.onMousePressed = dragMousePressListener
        pane.onMouseDragged = dragMouseDragListener
    }

    private inner class DragMousePressListener : EventHandler<MouseEvent> {
        override fun handle(event: MouseEvent) {
            windowOffsetX = primaryStage.x - event.screenX
            windowOffsetY = primaryStage.y - event.screenY
        }
    }

    private inner class DragMouseDragListener : EventHandler<MouseEvent> {

        override fun handle(event: MouseEvent) {
            lastPositionX = event.screenX + windowOffsetX
            lastPositionY = event.screenY + windowOffsetY
            primaryStage.x = lastPositionX
            primaryStage.y = lastPositionY
        }
    }
}