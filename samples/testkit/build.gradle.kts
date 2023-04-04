plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("greet") {
            id = "greet"
            implementationClass = "samples.GreetPlugin"
        }
    }
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}

repositories {
    gradlePluginPortal()
}
