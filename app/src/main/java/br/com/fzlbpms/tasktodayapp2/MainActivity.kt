package br.com.fzlbpms.tasktodayapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import br.com.fzlbpms.tasktodayapp2.ui.theme.TaskTodayApp2Theme
import br.com.fzlbpms.tasktodayapp2.ui.viewmodels.MainViewModelForClickCounter
import br.com.fzlbpms.tasktodayapp2.ui.views.MainDefaultScaffold
import br.com.fzlbpms.tasktodayapp2.ui.views.MainView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //ViewModelProvider.of(this).get(MainViewModelForClickCounter::class.java)
            TaskTodayApp2Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MainView()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskTodayApp2Theme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            MainView()
        }
    }
}