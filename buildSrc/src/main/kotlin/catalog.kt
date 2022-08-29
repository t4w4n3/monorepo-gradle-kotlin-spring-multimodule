import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

fun Project.lib(lib: String) =
    this.extensions.getByType(VersionCatalogsExtension::class).named("libs").findLibrary(lib).get()

fun Project.buildSrcLib(lib: String) =
    this.extensions.getByType(VersionCatalogsExtension::class).named("buildSrcLibs").findLibrary(lib).get()