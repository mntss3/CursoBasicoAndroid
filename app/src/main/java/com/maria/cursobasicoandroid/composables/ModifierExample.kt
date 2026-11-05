package com.maria.cursobasicoandroid.composables

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maria.cursobasicoandroid.R

@Preview(showBackground = true)
@Composable
fun ProfileScreen(){
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize())
    Row(
        modifier = Modifier
            .padding(horizontal = 22.dp, vertical = 40.dp) //márgenes aplicados al texto
            .fillMaxWidth()
            .background(color= Color.Blue),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Image(
            modifier = Modifier.size(75.dp),
            painter = painterResource(id = R.drawable.strawberry),
            contentDescription = null
        )
        Column (modifier = Modifier) {
            Text("Pepa", color = Color.White)
            Text("Mobile Developers", color = Color.White)
        }
        Button(onClick = {}) {
            Text("Follow")

        }
    }
}
