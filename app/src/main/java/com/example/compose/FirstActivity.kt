package com.example.compose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.ui.theme.ComposeTheme

class FirstActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                ViewContainer()
            }
        }
    }
}

@Preview
@Composable
fun ViewContainer() {
    Scaffold(
        topBar = { Toolbar() },
        content = { Content() },
        floatingActionButton = { FAB()},
        floatingActionButtonPosition = FabPosition.End
    )
}

@Composable
fun FAB(){
    val context = LocalContext.current
    FloatingActionButton(onClick = {
        Toast.makeText(context, "Hello world!", Toast.LENGTH_SHORT).show()
    }){
        Text("Call")
    }
}

@Preview
@Composable
fun Toolbar() {
    TopAppBar(
        title = { Text(text = "BurnoDev Profile", color = colorResource(id = R.color.white)) },
        backgroundColor = colorResource(id = R.color.background)
    )
}


@Composable
fun Content() {
    // remember es para que la variable no se pierda al redibujar la vista
    var counter by rememberSaveable { mutableStateOf(0) }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.phoca),
                contentDescription = "background image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .padding(start = 30.dp, top = 30.dp, end = 30.dp)
            )
            Row(
                modifier = Modifier.padding(start = 30.dp, top = 2.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_faborite),
                    contentDescription = "like",
                    modifier = Modifier.clickable { counter++ }
                )
                Text(
                    text = counter.toString(),
                    color = Color.White,
                    modifier = Modifier.padding(start = 4.dp)
                )
            }
            Text(
                text = "Bruno",
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(
                text = "Android Dev",
                color = Color.White,
                modifier = Modifier.padding(start = 10.dp)
            )
            Text(
                text = "3 años exp",
                color = Color.White,
                modifier = Modifier.padding(start = 10.dp)
            )
            Text(
                text = "Stack: C, Kotlin",
                color = Color.White,
                modifier = Modifier.padding(start = 10.dp)
            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun helloApp(){
//    Surface(
//        modifier = Modifier.fillMaxSize(),
//        color = MaterialTheme.colors.background
//    ) {
//        Greeting("Android")
//    }
//}
//
//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
//
//@Preview(showBackground = true)
//@Composable
//fun exampleModifier(){
//    Text(text="Suscribete", modifier = Modifier.padding(horizontal = 16.dp))
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ComposeTheme {
//        Greeting("Bruno")
//    }
//}
//
//@Preview(showBackground = true, name = "Texto prueba")
//@Composable
//fun SecondPreview() {
//    ComposeTheme {
//        Greeting("Bruno")
//    }
//}