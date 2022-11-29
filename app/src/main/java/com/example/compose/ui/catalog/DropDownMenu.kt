package com.example.compose.ui.catalog

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyDropDownMenu(){
    var selectedText by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false)    }
    val desserts = listOf("Helado", "Chocolate", "Cafe", "Fruta", "Medialunas")

    Column(Modifier.padding(20.dp)) {
        OutlinedTextField(value = selectedText,
            onValueChange = {selectedText = it},
            enabled = false,
            readOnly = true,
            modifier = Modifier
                .clickable { expanded = true }
                .fillMaxWidth()
        )
        DropdownMenu(expanded = expanded,
            onDismissRequest = { expanded=false },
            modifier = Modifier.fillMaxWidth())
        {
            desserts.forEach{ dessert ->
                DropdownMenuItem(onClick = {
                    expanded=false
                    selectedText = dessert
                }) {
                    Text(text = dessert)
                }

            }
        }
    }
}