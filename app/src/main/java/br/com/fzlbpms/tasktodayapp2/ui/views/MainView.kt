package br.com.fzlbpms.tasktodayapp2.ui.views

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.viewModelFactory

//https://www.jetpackcompose.net/
//https://fonts.google.com/icons
//https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary.html
//https://developer.android.com/reference/kotlin/androidx/compose/material/icons/package-summary
//androidx.compose.material:material-icons-extended
//androidx.compose.material:material-icons-extended

//https://stackmobile.com.br/curso-de-jetpack-compose/
//https://stackmobile.com.br/curso-de-jetpack-compose/

//https://developer.android.com/develop/ui/compose/state-hoisting
//https://www.youtube.com/watch?v=hWwZ_AuSGfo


//manage state
//https://developer.android.com/develop/ui/compose/state
//https://medium.com/@rowaido.game/managing-ui-states-in-jetpack-compose-7eb15e4f6931
//https://prashantandev.medium.com/understanding-state-management-in-jetpack-compose-concepts-best-practices-and-examples-d338ba1b0d15


/*
remember
The remember function retains state across recompositions but doesn’t survive configuration changes or process death.

rememberSavable
The rememberSavable function retains state across recompositions and survives configuration changes and process death by saving state in a Bundle.

https://medium.com/@hunterfreas/understanding-state-maintenance-with-mutablestateflow-a40509693b00
 */
@Composable
fun MainView(){
    MainDefaultScaffold()
}