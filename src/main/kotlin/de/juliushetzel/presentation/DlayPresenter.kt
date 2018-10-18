package de.juliushetzel.presentation

class DlayPresenter(
        val view: DlayContract.View
) : DlayContract.Presenter {

    override fun onBPMChanged(bpm: Double) {
        println(bpm)
    }

    override fun shutdown() {
        System.exit(0)
    }

}