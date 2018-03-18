package com.thedeveloperworldisyours.horselin.util

import java.util.concurrent.Executor
import java.util.concurrent.Executors

/**
 * Created by javiergonzalezcabezas on 18/3/18.
 */
/**
 * Executor that runs a task on a new background thread.
 */
class DiskIOThreadExecutor : Executor {

    private val diskIO = Executors.newSingleThreadExecutor()

    override fun execute(command: Runnable) { diskIO.execute(command) }
}