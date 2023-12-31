package com.example.birthdayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdayapp.ui.theme.BirthdayAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage("Happy Birthday Sam!", "From Emma")
                }
            }
        }
    }
}


@Composable fun GreetingText(modifier: Modifier=Modifier,message: String,from:String){
    Column(verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
        ) {
    Text(text = message ,
        fontSize =80 .sp,
        lineHeight = 80 .sp,
        textAlign = TextAlign.Center,
        modifier=Modifier
//            .align(alignment = Alignment.End)



    )
    Text(text = from ,
        fontSize = 26 .sp,
        modifier= Modifier
            .padding(16.dp)
            .align(alignment = Alignment.End)
//        lineHeight = 76 .sp
    )
    }

}



@Composable
fun GreetingImage(message: String,from: String){
    val image= painterResource(id = R.drawable.androidparty)
    Box {
    Image(painter = image, contentDescription =null )
        GreetingText(message = message, from =from ,
            modifier = Modifier.fillMaxSize()
                .padding(8 .dp)
        
        )
    }

}

@Preview(showBackground = true,
    showSystemUi = true,
    name="My Preview"

)
@Composable
fun GreetingPreview() {
    BirthdayAppTheme {
        GreetingImage("Happy Birthday Sam!", "From Emma")
    }
}
