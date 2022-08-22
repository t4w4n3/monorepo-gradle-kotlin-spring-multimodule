plugins {
    id("fr.tawane.kotlin-library-conventions")
    id("fr.tawane.kotlin-springboot-conventions")
}

dependencies {
    implementation(project(":modules:booking:domain"))
    implementation(project(":modules:booking:api-model"))
    implementation(project(":modules:booking:vsa-acl"))
    implementation(project(":modules:shared-libs:tech:id"))
    implementation(project(":modules:shared-libs:tech:tests"))
    implementation(project(":modules:shared-libs:tech:controller"))
    implementation(project(":modules:shared-libs:tech:jackson"))
    implementation(project(":modules:shared-libs:tech:monitoring"))
}
