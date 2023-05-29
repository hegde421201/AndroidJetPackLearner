package com.demo.jetpackcompose.ui.theme.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


class ModifierActivity : ComponentActivity(){

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
       Column(
           modifier = Modifier
               .background(Color.Green)
               .fillMaxHeight(0.5f)
               .width(300.dp)
               .padding(top = 16.dp, start = 100.dp)
       ) {
            Text(text = "Aishwary", modifier = Modifier.offset(0.dp,20.dp))
           Spacer(modifier = Modifier.height(50.dp))
           Text(text = "Bhasme")
       }
    }
}
}
