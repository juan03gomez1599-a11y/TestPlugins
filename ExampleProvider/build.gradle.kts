dependencies {
    // Librerías necesarias para que CloudStream funcione
    implementation("org.jsoup:jsoup:1.18.3")
    implementation("com.github.Blatzar:NiceHttp:0.4.11")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.1")
}

// Versión de tu extensión. Súbelo a 2, 3, etc., cuando hagas cambios importantes.
version = 1

cloudstream {
    // Configuración que aparecerá en la app de CloudStream
    description = "Extensión de Cuevana para ver películas y series en español."
    authors = listOf("Adriel") // ¡Tu nombre como desarrollador!

    status = 1 // 1 significa que el sitio está funcionando bien

    // Tipos de contenido que soporta tu extensión
    tvTypes = listOf("Movie", "TvSeries")

    requiresResources = true
    language = "es" // Idioma español

    // Logo de Cuevana (puedes cambiar este link por cualquier imagen .png luego)
    iconUrl = "https://cuevana.biz/favicon.ico"
}

android {
    namespace = "com.example" // Debe coincidir con tu paquete

    buildFeatures {
        buildConfig = true
        viewBinding = true
    }
}