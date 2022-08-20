plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation(buildSrcLibs.kotlinGradlePlugin)
}
