package de.juliushetzel.presentation

object DlayContract {

    interface Presenter {
        fun onBPMChanged(bpm: Double)
        fun shutdown()
    }

    interface View
}