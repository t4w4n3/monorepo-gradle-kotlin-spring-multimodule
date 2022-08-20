@file:Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    versionCatalogs {
        create("buildSrcLibs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}
