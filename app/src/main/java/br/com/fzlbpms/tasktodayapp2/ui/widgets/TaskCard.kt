package br.com.fzlbpms.tasktodayapp2.ui.widgets

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import br.com.fzlbpms.tasktodayapp2.model.Task
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@Composable
fun TaskCard(task: Task) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        TaskCardContent(task)
    }
}

@Composable
fun TaskCardContent(task: Task) {
    var obsText = remember {
        mutableStateOf("")
    }
    var diasParaTerminar = rememberSaveable {
        mutableStateOf("")
    }

    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Yellow)
        ) {
            Column() {
                Text(text = task.title)
                Text(text = task.description)
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            //Obs
            TextField( modifier = Modifier
                .border(width = 2.dp, color = Color.Blue),
                value = obsText.value,
                onValueChange = {
                    Log.i("TaskCard", "onValueChange: $it")
                    obsText.value = it
                }
            )
            //Dias para terminar
            TextField(modifier = Modifier
                .border(width = 2.dp, color = Color.Red),
                value = diasParaTerminar.value,
                onValueChange = {
                    Log.i("TaskCard", "onValueChange: $it")
                    diasParaTerminar.value = it
                })
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 3.dp)
            .background(color = Color.Green),
            verticalAlignment = Alignment.CenterVertically) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Editar")
            }
            Button(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Close, contentDescription = "sdf")
            }
            Button(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Close, contentDescription = "sdf")
            }
            Button(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Close, contentDescription = "sdf")
            }
        }
    }
}
