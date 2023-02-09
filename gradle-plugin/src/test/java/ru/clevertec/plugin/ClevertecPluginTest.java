package ru.clevertec.plugin;

import org.gradle.api.Project;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClevertecPluginTest {

    @Test
    void pluginCreateTaskTest() {
        Project project = ProjectBuilder.builder().build();
        project.getPlugins().apply("ru.clevertec.clevertec-plugin");

        assertNotNull(project.getTasks().findByName("clevertecTask"));
    }

}
