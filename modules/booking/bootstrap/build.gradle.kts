plugins {
    id("fr.tawane.kotlin-application-conventions")
    id("fr.tawane.kotlin-springboot-conventions")
}

dependencies {
    api(project(":modules:booking:api-adapters"))
    api(project(":modules:booking:vsa-acl"))
    api(project(":modules:booking:persistence-adapters"))
    api(project(":modules:booking:provider-adapters"))
}
