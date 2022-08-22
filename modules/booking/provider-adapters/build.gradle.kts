plugins {
    id("fr.tawane.kotlin-library-conventions")
    id("fr.tawane.kotlin-springboot-conventions")
}

dependencies {
    implementation(project(":modules:booking:domain"))
    implementation(project(":modules:shared-libs:tech:id"))
    implementation(project(":modules:shared-libs:tech:aws:propertysource"))
}
