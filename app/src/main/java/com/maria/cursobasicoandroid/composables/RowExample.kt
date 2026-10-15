package com.maria.cursobasicoandroid.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun RowExample() {
    Row() {
        Text("Hola 1")
        Column() {
            Text("Hola 6")
            Text("Hola 7")
        }
    }
}