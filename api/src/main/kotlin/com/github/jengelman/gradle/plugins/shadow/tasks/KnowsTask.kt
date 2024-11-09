package com.github.jengelman.gradle.plugins.shadow.tasks

import com.github.jengelman.gradle.plugins.shadow.internal.requireResourceAsText
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

public class KnowsTask : DefaultTask() {

  @TaskAction
  public fun knows() {
    logger.info("\nNo, The Shadow Knows....")
    logger.info(this::class.java.requireResourceAsText("/shadowBanner.txt"))
  }

  public companion object {
    public const val NAME: String = "knows"
    public const val DESC: String = "Do you know who knows?"
  }
}
