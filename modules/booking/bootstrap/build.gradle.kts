plugins {
    id("fr.tawane.kotlin-springboot-application-conventions")
    id("org.springframework.boot")
    java
    application
}

dependencies {
    api(project(":modules:booking:api-adapters"))
    api(project(":modules:booking:vsa-acl"))
    api(project(":modules:booking:persistence-adapters"))
    api(project(":modules:booking:provider-adapters"))
    implementation(libs.springBootGradlePlugin)
}

bootJar {
    mainClassName = "com.baeldung.Application"
}
