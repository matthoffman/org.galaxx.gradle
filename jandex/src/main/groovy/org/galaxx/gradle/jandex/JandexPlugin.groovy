package org.galaxx.gradle.jandex

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.bundling.Jar
import org.jboss.jandex.Main

class JandexPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.tasks.withType(Jar) {
            it.doLast { task ->
                Main.main '-m', task.archivePath.getAbsolutePath()
            }
        }
    }
}
