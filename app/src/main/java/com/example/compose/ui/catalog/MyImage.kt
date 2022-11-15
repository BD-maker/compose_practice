package com.example.compose.ui.catalog

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.R

//@Preview
@Composable
fun MyImage(){
    Image(painter = painterResource(id = R.drawable.phoca),
        contentDescription = "",
        alpha = 0.5f
    )
}


@Composable
fun MyImageAdvance(){
    Image(
        painter = painterResource(id = R.drawable.phoca),
        contentDescription = "",
        modifier = Modifier.clip(CircleShape).border(5.dp, Color.Black, CircleShape)
    )
}

@Preview(showBackground = true)
@Composable
fun myIcon(){
    Icon(
        imageVector = Icons.Rounded.Star,
        contentDescription = "Icono",
        tint = Color.Magenta
    )
}