rootProject.name = "kotlin-User"
include("user-be-common")
include("user-mp-transport-models")

pluginManagement{
    plugins{
        val kotlinVersion: String by settings

        kotlin("multiplatform") version kotlinVersion apply false
        kotlin("jvm") version kotlinVersion apply false
    }
}

