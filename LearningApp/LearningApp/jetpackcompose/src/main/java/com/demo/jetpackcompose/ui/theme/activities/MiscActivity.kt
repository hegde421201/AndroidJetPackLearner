package com.demo.jetpackcompose.ui.theme.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

class MiscActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val scaffoldState = rememberScaffoldState()
            var textFieldState by remember{
                mutableStateOf("")
            }
            val scope = rememberCoroutineScope()
           Scaffold(modifier = Modifier.fillMaxSize(), scaffoldState = scaffoldState)
            { _ -> Column(horizontalAlignment = Alignment.CenterHorizontally,
                   verticalArrangement = Arrangement.Center,
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(horizontal = 30.dp)
               )
               {
                   TextField(value = textFieldState, label = {Text("Enter your name")}, onValueChange = {
                       textFieldState = it
                   },
                       singleLine = true,
                       modifier = Modifier.fillMaxWidth()
                   )
                   Spacer(modifier = Modifier.height(16.dp))
                   Button(onClick = {
                       scope.launch {
                           scaffoldState.snackbarHostState.showSnackbar("Hello $textFieldState")
                       }

                   }){
                       Text("Please say Hello")
                   }
               }
           }//scaffold

        }

    }
}