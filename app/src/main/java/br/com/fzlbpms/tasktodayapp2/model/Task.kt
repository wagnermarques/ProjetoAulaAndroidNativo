package br.com.fzlbpms.tasktodayapp2.model

import java.util.Date
//https://kotlinlang.org/docs/data-classes.html
data class Task(
     var title: String,
     var description: String,
     var dueDate: Date,
     var assignedTo: String,
     var tags: List<String>,
     var priority: Int,
     var status: String
) {
//     var title: String = title
//     var description: String = description
//     var dueDate: Date = dueDate
//     var completed: Boolean = false
//     var priority: Int = 0
//     var assignedTo: String = ""
//     var tags: List<String> = emptyList()
//     var status = ""
}