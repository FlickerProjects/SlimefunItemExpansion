plugins {
    java
    id("io.izzel.taboolib") version "1.40"
    id("org.jetbrains.kotlin.jvm") version "1.5.10"
}

taboolib {
    description {
        contributors {
            name("ItsFlicker")
        }
        dependencies {
            name("Slimefun")
        }
    }
    install("common", "common-5")
    install("module-configuration")
    install("module-lang")
    install("platform-bukkit")
    classifier = null
    version = "6.0.7-64"
}

repositories {
    maven { url = uri("https://jitpack.io") }
    mavenCentral()
}

dependencies {
    compileOnly("com.github.Slimefun:Slimefun4:RC-31")
    compileOnly("ink.ptms.core:v11802:11802:universal")
    compileOnly("ink.ptms.core:v11802:11802:mapped")
    compileOnly(kotlin("stdlib"))
    compileOnly(fileTree("libs"))
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}