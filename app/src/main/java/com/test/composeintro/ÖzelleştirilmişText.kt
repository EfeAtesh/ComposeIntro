package com.test.composeintro

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.isImeVisible
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ÖzelleştirilmişText(text: String){
    Text("Baska yerden cekilmiş text", modifier = Modifier.clickable{
    }.fillMaxWidth().padding(10.dp))
    Text(text = text,
        color = Color.Yellow
        )
}

@Preview(showBackground = true)
@Composable
fun OzelPreview(){
    ÖzelleştirilmişText(text="User Asssigned text")
}