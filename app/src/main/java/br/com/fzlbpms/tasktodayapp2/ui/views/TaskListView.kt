package br.com.fzlbpms.tasktodayapp2.ui.views

import androidx.compose.runtime.Composable
import br.com.fzlbpms.tasktodayapp2.model.Task
import br.com.fzlbpms.tasktodayapp2.ui.widgets.TaskCard

@Composable
fun TaskListView(taskList : List<Task>) {
    for (task in taskList) {
        TaskCard(task)
    }
}