package de.juliushetzel.util

import java.awt.Toolkit
import java.awt.datatransfer.StringSelection


fun String?.toDoubleOrZero() = this?.let {
    if(this.isNotEmpty()) toDouble() else 0.0
} ?: 0.0

fun Double?.toStringOrZero(): String = this?.let {
    if(isInfinite()) "0.0" else "$it"
} ?: "0.0"

fun Double.format(pattern: String): Double = pattern.format(this).replace(",", ".").toDouble()

fun String.copyToClipboard() {
    val stringSelection = StringSelection(this)
    Toolkit.getDefaultToolkit().systemClipboard.setContents(stringSelection, null)
}