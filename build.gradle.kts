plugins {
    alias(libs.plugins.intellij.platform)
}

group = "com.wyrmjin"
version = "2026.1.0527"

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
            <h3>2026.1.0527</h3>
            <ul>
                <li>add dark mode</li>
            </ul>
            <h3>2026.1.0521</h3>
            <ul>
                <li>Animal Island theme</li>
            </ul>
        """.trimIndent()
    }

    signing {
        certificateChainFile.set(file("certificate/chain.crt"))
        privateKeyFile.set(file("certificate/private.pem"))
    }

    publishing {
        token.set(providers.environmentVariable("PUBLISH_TOKEN"))
    }
}

tasks.named("buildSearchableOptions") {
    enabled = false
}
