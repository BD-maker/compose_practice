package com.example.compose.ui.catalog

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyProgress() {
    var show by rememberSaveable { mutableStateOf(false) }
    Column(
        Modifier
            .padding(24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (show) {
            CircularProgressIndicator(color = Color.Red, strokeWidth = 10.dp)
            LinearProgressIndicator(
                modifier = Modifier.padding(top = 16.dp),
                color = Color.Red,
                backgroundColor = Color.Green
            )
        }

        Button(onClick = { show = !show }) {
            Text("show/hide")
        }
    }
}

@Composable
fun MyProgressBarAdvance() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var progress by rememberSaveable { mutableStateOf(0f) }
        LinearProgressIndicator(progress = progress)

        Row(Modifier.fillMaxWidth()) {
            Button(onClick = {
                if (progress < 1f) progress += 0.1f
            }
            ) {
                Text("Incrementar")
            }
            Button(onClick = {
                if (progress > 0) progress -= 0.1f
            }) {
                Text("Reducir")
            }
        }
    }
}