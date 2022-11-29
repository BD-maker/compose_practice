package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.compose.ui.catalog.*
import com.example.compose.ui.login.presentation.LoginScreen
import com.example.compose.ui.login.presentation.LoginViewModel
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    //LoginScreen(LoginViewModel())
                    //MyBox(name = "Prueba!")
                    //MyColumn()
                    //myComplexLayout()
                    //StateExample()
                    //Mytext()
                    //MyTextFieldAdvance()
                    //MyTextFieldOutlined()
                    //--
                    //var myText by rememberSaveable{ mutableStateOf("") }
                    //MyTextField2( myText) { myText = it }
                    //--
                    //MyButton()
                    //MyProgress()
                    //MyProgressBarAdvance()
                    //MySwitch()
                    val myOptions = getOptions(listOf("Aris","Ejemplo", "Pikachu"))
//                    Column() {
////                        MyTriStatusCheckBox()
////                        myOptions.forEach{
////                            MyCheckboxWithTextCompleted(it)
////                        }
//                        //MyRadioButton()
//                        var selected by remember{
//                            mutableStateOf("Ejemplo 1")
//                        }
//                        MyRadioButtonList(selected) { selected = it }
//                    }

                }
//                MyCard()
//                MyBadgeBox()
                Column() {
                    MyDivider()
                    MyDropDownMenu()
                    AdvancedSlider()
                }
            }
        }
    }
}





