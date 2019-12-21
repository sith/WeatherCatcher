package org.sith.weathercatcher

import tornadofx.App
import tornadofx.launch
import tornadofx.reloadStylesheetsOnFocus


class WeatherCatcherApp : App() {
    init {
        reloadStylesheetsOnFocus()
    }
}

private val logger = logger<Any>()
fun main(args: Array<String>) {
    logger.info("Starting...")

    launch<WeatherCatcherApp>(args)
}