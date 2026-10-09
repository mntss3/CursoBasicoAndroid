package com.maria.cursobasicoandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.maria.cursobasicoandroid.composables.ButtonExample
import com.maria.cursobasicoandroid.composables.ImageExample
import com.maria.cursobasicoandroid.composables.TextExample
import com.maria.cursobasicoandroid.ui.theme.CursoBasicoAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CursoBasicoAndroidTheme {
                TextExample(name = "Meri")
                ImageExample()
                ButtonExample()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Example() {
    Text(text = "Hola, es ", fontSize = 40.sp)
}


