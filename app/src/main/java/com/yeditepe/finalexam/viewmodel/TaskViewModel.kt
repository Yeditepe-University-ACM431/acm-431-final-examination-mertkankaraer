package com.yeditepe.finalexam.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.yeditepe.finalexam.model.Task
class TaskViewModel : ViewModel() {

    val tasks = mutableStateListOf(
        Task(1, "odevi yap", false),
        Task(2, "chapteri oku", true)
    )
 fun toggleTask(taskId: Int) {
 val index = tasks.indexOfFirst { it.id == taskId }
        if (index >= 0) {
            val t = tasks[index]
            tasks[index] = t.copy(completed = !t.completed)
        }  }
