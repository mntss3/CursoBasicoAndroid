package com.maria.cursobasicoandroid.composables

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.maria.cursobasicoandroid.R

@Preview
@Composable
fun ImageExample(){
    Image(painter = painterResource( id = R.drawable.strawberry),
        "User avatar"
    )
}