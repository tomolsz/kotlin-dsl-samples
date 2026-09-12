import org.jetbrains.kotlin.gradle.dsl.Coroutines

plugins {
    application
    kotlin("jvm") version "1.9.25"
}

application {
    mainClassName = "samples.HelloCoroutinesKt"
}

dependencies {
    compile(kotlin("stdlib"))
}

repositories {
    jcenter()
}
