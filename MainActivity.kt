package com.example.p2basiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p2basiccompose.ui.theme.P2BasicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P2BasicComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicLayout(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BasicLayout(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Login",
            style = TextStyle(fontSize = 50.sp,
            fontWeight = FontWeight.Bold)
        )
        Text(text = "Ini adalah halaman login")
        Image(painter = painterResource(
            id = R.drawable.umy
        ),
            contentDescription = null ,
            modifier = Modifier.padding(top = 40.dp).size(250.dp)
        )

        Text(text = "nama",
            modifier = Modifier.padding(top=20.dp)
        )
        Text(text = "Inayah Ummu Ardillah", color = Color.Red,
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )
        Text(text = "20220140143",
            style = TextStyle(fontSize = 30.sp, fontWeight =
            FontWeight.Bold),
            modifier = Modifier.padding(top = 20.dp)
        )
        Image(painter = painterResource(id = R.drawable.me), contentDescription = null,
            modifier = Modifier.padding(top = 40.dp).size(250.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    P2BasicComposeTheme {
        BasicLayout()
    }
}