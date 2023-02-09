package ru.clevertec.task;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class ClevertecTask extends DefaultTask {

    @TaskAction
    public void clevertecTask() {
        System.out.println("Hello, Clevertec!");
    }

}
