package com.example

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class ExampleProviderPlugin: Plugin() {
    override fun load(context: Context) {
        // Ahora registramos nuestro nuevo proveedor de Cuevana
        registerMainAPI(CuevanaProvider())
    }
}
