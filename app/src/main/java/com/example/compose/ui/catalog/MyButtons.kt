package com.example.compose.ui.catalog

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun MyButton(){
    var enabled by rememberSaveable { mutableStateOf(true)}
    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        // boton normal
        Button(
            onClick = { enabled = false },
            enabled = enabled,
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Magenta,
                contentColor = Color.Blue
            ),
            border = BorderStroke(4.dp, Color.Green)
        ) {
            Text("Hola")
        }

        // boton transparente
        OutlinedButton(
            onClick = {enabled = false },
            modifier = Modifier.padding(top = 8.dp),
            enabled = enabled)
        {
            Text(text = "Hola")
        }

        // sin borde
        TextButton(
            onClick = {},
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text("Hola")
        }
    }
}

