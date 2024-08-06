package com.example.bigbite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.bigbite.ui.theme.BigBiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BigBiteTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.bigbite),
            contentDescription = stringResource(id = R.string.big_bite_logo_image_description)
        )
        TextField(value = "",
            onValueChange = {},
            label = { Text(text = "Email")}
        )
        TextField(value = "",
            onValueChange = {},
            label = { Text(text = "Password")}
        )
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color(0xFF0F0000))
        ) {
            Text(text = "Login",
                color = Color(0xFFF4FFFF))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    BigBiteTheme {
        LoginScreen()
    }
}