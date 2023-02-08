package com.example.mapagoogle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mapagoogle.ui.theme.MapaGoogleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MapaGoogleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    RunMaps()
                }
            }
        }
    }
}

@Composable
fun RunMaps() {
    Column(Modifier.background(Color.DarkGray)) {
        //Top
        Box(
            Modifier
                .fillMaxWidth()
                .height(60.dp)
//                .padding(0.dp)
                .background(Color.DarkGray),
        ) {
            Row() {
                //Icon
                Box(
                    modifier = Modifier
                        .width(45.dp)
                        .height(60.dp)
                        .background(Color.DarkGray),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_success),
                        modifier = Modifier.size(40.dp).padding(start = 10.dp), tint = Color.Unspecified,
                        contentDescription = ""
                    )
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Box(
                    modifier = Modifier
                        .width(300.dp)
                        .height(60.dp)
                        .background(Color.DarkGray)
                ) {
                    Column() {
                        Spacer(modifier = Modifier.padding(top = 14.dp))
                        Text(text = "Signature", fontSize = 14.sp, color = Color.Gray)
                        Spacer(modifier = Modifier.height(3.dp))
                        Row() {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_url),
                                contentDescription = "Close",
                                tint = Color.White, modifier = Modifier.padding(start = 3.dp, top = 3.dp)
                            )
                            Spacer(modifier = Modifier.width(5.dp))
                            Text(
                                text = "Cornette 2022 ",
                                fontSize = 14.sp,
                                color = Color.White,
                                textDecoration = TextDecoration.Underline
                            )
                        }
                    }
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_exit),
                        contentDescription = "Close",
                        tint = Color.Gray, modifier = Modifier.padding(end = 2.dp)
                    )
                }
            }
        }
        Text(
            text = "TIMESTAMP",
            color = Color.Gray,
            fontSize = 10.sp,
            modifier = Modifier.padding(start = 10.dp, top = 6.dp)
        )
        Row() {
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                painter = painterResource(android.R.drawable.ic_menu_month),
                modifier = Modifier
                    .size(20.dp)
                    .padding(top = 5.dp), tint = Color.Unspecified,
                contentDescription = ""
            )
            Text(
                text = "2022.03.09",
                color = Color.White,
                modifier = Modifier.padding(start = 5.dp)
            )
            Spacer(modifier = Modifier.width(30.dp))
            Icon(
                painter = painterResource(android.R.drawable.ic_menu_recent_history),
                modifier = Modifier
                    .size(20.dp)
                    .padding(top = 5.dp), tint = Color.Unspecified,
                contentDescription = ""
            )

            Text(text = "14.30.21", color = Color.White, modifier = Modifier.padding(start = 5.dp))
        }
        Spacer(modifier = Modifier.height(1.dp))
        //Mapa
        Box(
            Modifier
                .fillMaxWidth()
                .height(360.dp)
                .padding(1.dp)
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "TUTAJ MAPA GOOGLE", textAlign = TextAlign.Center)
//            GoogleMap()

        }
        //Data koncowa
        Box(
            Modifier
                .width(100.dp)
                .height(50.dp)
                .padding(0.dp)
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "09.August")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MapaGoogleTheme {
        RunMaps()
    }
}