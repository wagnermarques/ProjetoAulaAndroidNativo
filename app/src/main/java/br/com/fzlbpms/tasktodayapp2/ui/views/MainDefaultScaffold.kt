package br.com.fzlbpms.tasktodayapp2.ui.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import br.com.fzlbpms.tasktodayapp2.R
import br.com.fzlbpms.tasktodayapp2.model.Task
import br.com.fzlbpms.tasktodayapp2.ui.widgets.TaskCard

//https://developer.android.com/develop/ui/compose/components/scaffold?hl=pt-br
//https://www.jetpackcompose.net/scaffold
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainDefaultScaffold() {
    var presses by remember {
        mutableIntStateOf(0)
    }

    Scaffold(
        topBar = {
            TopBarDefault()
        },
        bottomBar = {
            ButtonBarDefault()
        },
        floatingActionButton = {
            FloatingActionButtonsDefault(presses)
        }
    ) { innerPadding ->
            ScafoldContentDefault(innerPadding)
     }
}

@Composable
private fun FloatingActionButtonsDefault(presses: Int) {
    var presses1 = presses
    FloatingActionButton(onClick = { presses1++ }) {
        Icon(imageVector = Icons.Default.Add, contentDescription = "Adicionar")
    }
}

@Composable
private fun ScafoldContentDefault(innerPadding: PaddingValues) {
    var taskInstance1 = Task(
        "TaskTitle1",
        "TaskDescription1",
        java.util.Date(),
        "AssignedTo1",
        listOf("Tag1", "Tag2"),
        1,
        "Status1"
    )

    Column(
        modifier = Modifier.padding(innerPadding),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        TaskCard(taskInstance1)
        TaskCard(taskInstance1)
        TaskCard(taskInstance1)
    }
}

@Composable
private fun ButtonBarDefault() {
    BottomAppBar(
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.primary,
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = "Bottom app bar",
            onTextLayout = {}
        )
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun TopBarDefault() {
    TopAppBar(
        colors = topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        title = {
            Text( stringResource(id = R.string.app_name) , onTextLayout = {})
        }
    )
}