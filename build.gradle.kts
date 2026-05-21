plugins {
    id("org.jetbrains.intellij.platform") version "2.16.0"
}

group = "com.wyrmjin"
version = "2026.1.0521"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        intellijIdea("2026.1")
    }
}

intellijPlatform {
    pluginConfiguration {
        name = "Animal Island Theme"
        ideaVersion {
            sinceBuild = "251"
        }
        changeNotes = """
            <h3>2026.1.0521</h3>
            <ul>
                <li>Animal Island theme</li>
            </ul>
        """.trimIndent()
    }
}

tasks.named("buildSearchableOptions") {
    enabled = false
}
