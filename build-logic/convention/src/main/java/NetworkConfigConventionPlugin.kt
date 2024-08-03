import com.kaaneneskpc.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class NetworkConfigConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {
        dependencies {
            add("implementation", libs.findLibrary("okhttp").get())
            add("implementation", libs.findLibrary("okhttp-loggingInterceptor").get())
            add("implementation", libs.findLibrary("retrofit2").get())
            add("implementation", libs.findLibrary("gson").get())
        }
    }

}