package ru.clevertec.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import ru.clevertec.task.ClevertecTask;

public class ClevertecPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getTasks().create("clevertecTask", ClevertecTask.class);
    }

}
