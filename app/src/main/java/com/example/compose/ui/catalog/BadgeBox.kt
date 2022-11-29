package com.example.compose.ui.catalog

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Badge
import androidx.compose.material.BadgedBox
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyBadgeBox(){
    BadgedBox(
        modifier = Modifier.padding(16.dp),
        badge = {Badge(
            content = {
                Text(modifier = Modifier.padding(2.dp),text = "1")
            },
            backgroundColor = Color.Red,
            contentColor = Color.White,
            modifier = Modifier.padding(2.dp)
        )}
    ) {
        Icon(imageVector = Icons.Default.Star, contentDescription = "")
    }
}