package com.demo.jetpackcompose.ui.theme.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

class StateActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
           // ColorBox(Modifier.fillMaxSize())

            Column(
                Modifier.fillMaxSize()) {
                val color = remember {
                    mutableStateOf(Color.Cyan)
                }
                ColorBox2(
                    Modifier
                        .fillMaxSize()
                        .weight(1f)){
                    color.value = it
                }
                Box(modifier = Modifier
                    .background(
                    color.value
                    )
                    .weight(1f)
                    .fillMaxSize())
            }
        }

    }
}

@Composable
fun ColorBox(modifier: Modifier = Modifier){

    val color =  remember {
        mutableStateOf(Color.Magenta)
    }

    Box(modifier = modifier
        .background(color.value)
        .clickable {
            color.value = Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
            )
        })
}

@Composable
fun ColorBox2(modifier: Modifier = Modifier,updateColor:(Color)-> Unit){

    Box(modifier = modifier
        .background(Color.Red)
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )
        })
}