package de.juliushetzel

import javafx.scene.image.Image

object Resources {

    object Images {
        val icon: Image = Image(DlayApp::class.java.classLoader.getResourceAsStream("images/app-icon.png"))
        val logo_16: Image = Image(DlayApp::class.java.classLoader.getResourceAsStream("images/app-logo_16.png"))
        val logo_32: Image = Image(DlayApp::class.java.classLoader.getResourceAsStream("images/app-logo_32.png"))
        val logo_64: Image = Image(DlayApp::class.java.classLoader.getResourceAsStream("images/app-logo_64.png"))
        val logo_128: Image = Image(DlayApp::class.java.classLoader.getResourceAsStream("images/app-logo_128.png"))
        val logo_256: Image = Image(DlayApp::class.java.classLoader.getResourceAsStream("images/app-logo_256.png"))
        val logo_512: Image = Image(DlayApp::class.java.classLoader.getResourceAsStream("images/app-logo_512.png"))
        val logo: Array<Image> = arrayOf(
                logo_16,
                logo_32,
                logo_64,
                logo_128,
                logo_256,
                logo_512
        )
    }
}