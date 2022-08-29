plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}
dependencies {
    implementation(buildSrcLibs.kotlinGradlePlugin)
    implementation(buildSrcLibs.springBootGradlePlugin)
    implementation(buildSrcLibs.kotlinAllOpen)
}
