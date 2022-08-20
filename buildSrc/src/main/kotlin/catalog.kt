import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

fun Project.libs(lib: String) =
    this.extensions.getByType(VersionCatalogsExtension::class).named("libs").findLibrary(lib).get()