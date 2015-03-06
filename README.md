# Jandex Plugin
A Gradle plugin that provides [Jandex][1] indexing for jars.

Currently the plugin adds post processing step to every jar task that indexes the jar's classes and includes the index in the jar.

## Requirements
* Gradle 2.x (the plugin is tested against 2.2 and 2.3)

## Using the plugin
The plugin is [available from Gradle's plugin portal][2]. The latest release is `1.0.0`.

With Gradle 2.1 or later, you can use it as follows:

```groovy
plugins {
    id "org.galaxx.gradle.jandex" version "1.0.0"
}

```

Alternatively, on earlier versions of Gradle:

```groovy
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath "org.galaxx.gradle:jandex:1.0.0"
    }
}

apply plugin: "org.galaxx.gradle.jandex"
```

With this basic configuration in place, each time you generate a jar it will contain Jandex index.

[1]: https://github.com/wildfly/jandex
[2]: http://plugins.gradle.org/plugin/io.spring.dependency-management
