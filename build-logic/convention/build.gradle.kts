plugins {
    `kotlin-dsl`
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("networkConfig") {
            id = "kaaneneskpc.network.config"
            implementationClass = "NetworkConfigConventionPlugin"
        }
    }
}