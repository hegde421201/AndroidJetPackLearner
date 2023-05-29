package com.demo.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.demo.jetpackcompose.ui.theme.LearningAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Modifier.fillMaxSize(0.5f)
            Row(
                modifier = Modifier.width(200.dp).fillMaxHeight().background(Color.LightGray),
                horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.Bottom
            ) {
                Greeting(name = "Ganesh")
                Text("Hegde")
            }
            

        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearningAppTheme {
        Greeting("Compose")
    }
}   