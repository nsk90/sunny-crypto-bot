package io.github.nsk90

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "SunnyCryptoBot",
    ) {
        App()
    }
}