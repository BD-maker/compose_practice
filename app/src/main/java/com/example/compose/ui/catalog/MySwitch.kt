package com.example.compose.ui.catalog

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp

@Composable
fun MySwitch() {
    var state by rememberSaveable { mutableStateOf(false) }
    Switch(
        checked = state,
        onCheckedChange = { state = !state },
        enabled = false,
        colors= SwitchDefaults.colors(
            uncheckedThumbColor = Color.Red,
            uncheckedTrackColor = Color.Magenta,
            checkedThumbColor = Color.Green,
            checkedTrackColor = Color.Cyan,
            uncheckedTrackAlpha = 0.5f,
            checkedTrackAlpha = 0.3f,
            disabledUncheckedThumbColor = Color.Black,
            disabledCheckedThumbColor = Color.Yellow
        )

    )
}

@Composable
fun MyCheckbox(){
    var state by rememberSaveable { mutableStateOf(false) }
    Checkbox(checked = state,
        onCheckedChange = { state = !state },
        enabled = true,
        colors = CheckboxDefaults.colors(
            checkedColor = Color.Black,
            uncheckedColor = Color.Gray,
            checkmarkColor = Color.Red
        )
    )
}

@Composable
fun MyCheckboxWithText() {
    var state by rememberSaveable { mutableStateOf(false) }
    Column() {
        Row(Modifier.padding(8.dp)) {
            Checkbox(checked = state,
                onCheckedChange = { state = !state }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Checkbox 1")
        }
    }
}

@Composable
fun MyCheckboxWithTextCompleted(checkInfo: CheckInfo) {

    Row(Modifier.padding(8.dp)) {
        Checkbox(checked = checkInfo.selected,
            onCheckedChange = { checkInfo.onCheckedChange(!checkInfo.selected) }
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(checkInfo.title)
    }

}

@Composable
fun getOptions(titles:List<String>):List<CheckInfo>{
    return titles.map{
        var status by rememberSaveable { mutableStateOf(false) }
        CheckInfo(
            title = it,
            selected = status,
            onCheckedChange = { myNewStatus -> status = myNewStatus}
        )
    }
}

@Composable
fun MyTriStatusCheckBox(){
    var status by rememberSaveable { mutableStateOf(ToggleableState.Off)}
    TriStateCheckbox(state = status, onClick = {
        status = when(status){
            ToggleableState.On -> ToggleableState.Off
            ToggleableState.Off -> ToggleableState.Indeterminate
            ToggleableState.Indeterminate -> ToggleableState.On
        }
    })
}

@Composable
fun MyRadioButton(){
    Row(Modifier.fillMaxWidth()){
        RadioButton(selected = true, enabled = true, onClick = {  }, colors = RadioButtonDefaults.colors(
            selectedColor = Color.Red,
            unselectedColor = Color.Yellow,
            disabledColor = Color.Green
        ))
        Text(text = "Ejemplo 1")
    }
}

@Composable
fun MyRadioButtonList(name : String, onItemSelected:(String)-> Unit){

    Column(Modifier.fillMaxWidth()) {
        Row(){
            RadioButton(selected = name == "Ejemplo 1", onClick = { onItemSelected("Ejemplo 1") })
            Text(text = "Ejemplo 1")
        }
        Row(){
            RadioButton(selected = name == "Ejemplo 2", onClick = { onItemSelected("Ejemplo 2") })
            Text(text = "Ejemplo 2")
        }
        Row(){
            RadioButton(selected = name == "Ejemplo 3", onClick = { onItemSelected("Ejemplo 3") })
            Text(text = "Ejemplo 3")
        }
        Row(){
            RadioButton(selected = name == "Ejemplo 4", onClick = { onItemSelected("Ejemplo 4")})
            Text(text = "Ejemplo 4")
        }
        Row(){
            RadioButton(selected = name == "Ejemplo 5", onClick = { onItemSelected("Ejemplo 5") })
            Text(text = "Ejemplo 5")
        }
    }
}

@Composable
fun MyCard(){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        elevation = 12.dp,
        shape = MaterialTheme.shapes.small,
        backgroundColor = Color.Green,
        border = BorderStroke(5.dp, Color.Black)
    ){
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text= "Ejemplo 1")
            Text(text= "Ejemplo 2")
            Text(text= "Ejemplo 3")
        }
    }
}