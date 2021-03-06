import java.util.*

plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

val props = Properties().apply {
    file("../gradle.properties").inputStream().use { load(it) }
}

fun version(target: String): String =
    props.getProperty("${target}.version")

dependencies {
    implementation(kotlin("gradle-plugin", version("kotlin")))
    implementation("com.github.node-gradle:gradle-node-plugin:${version("node-plugin")}")
    implementation("org.json:json:${version("json")}")
}
