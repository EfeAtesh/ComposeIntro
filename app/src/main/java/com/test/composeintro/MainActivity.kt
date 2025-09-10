package com.test.composeintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.test.composeintro.ui.theme.ComposeIntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeIntroTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding))
                }
            }
        }

        lambdatest{
            test()
        }
    }

    fun test(){
        println("test")
    }

    fun lambdatest(int: Int = 5, myfunction: () -> Unit){
        myfunction.invoke()

    }

}


@Composable
fun mainScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
    Text( text = "Merhaba Compose", color = Color.Blue, fontWeight = FontWeight.ExtraBold)
        Spacer(modifier = Modifier.padding(40.dp))
    Switch(true,onCheckedChange = null)}
    ÖzelleştirilmişText(text = "Deneme")


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeIntroTheme {
        mainScreen()
    }
}