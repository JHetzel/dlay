package de.juliushetzel.presentation

import javafx.scene.paint.Color
import tornadofx.*

class DlayStyles : Stylesheet() {

    companion object {
        val content by cssclass()
        val labelNote by cssclass()
        val buttonClose by cssclass()
    }

    init {
        content {
            backgroundColor += Color.valueOf("#212121")
            backgroundRadius += box(12.px)
            padding = box(8.px)

            label {
                textFill = Color.valueOf("#9E9E9E")
            }

            buttonClose {
                backgroundColor += Color.valueOf("#424242")
                backgroundRadius += box(16.px)
                prefWidth = 16.px
                prefHeight = 16.px
                maxHeight = 16.px
                maxWidth = 16.px
                padding = box(0.px)
                borderWidth += box(0.px)
                backgroundInsets += box(0.px)

                and(hover) {
                    backgroundColor += Color.valueOf("#FF3D00")
                }
            }

            labelNote {
                textFill = Color.valueOf("#757575")
                fontSize = 10.px
            }

            textField {
                padding = box(
                        horizontal = 12.px,
                        vertical = 4.px
                )
                prefHeight = 24.px
                backgroundRadius += box(12.px)
                borderRadius += box(12.px)
                borderWidth += box(0.px)
                backgroundColor += Color.valueOf("#424242")
                textFill = Color.valueOf("#BDBDBD")

                and(hover) {
                    textFill = Color.valueOf("#E0E0E0")
                    backgroundColor += Color.valueOf("#616161")
                }

                and(focused) {
                    textFill = Color.valueOf("#E0E0E0")
                    backgroundColor += Color.valueOf("#616161")
                }
            }
        }
    }
}