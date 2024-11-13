package com.example.applesson1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
//import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.applesson1.ui.theme.AppLesson1Theme
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class DashBoardActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppLesson1Theme {
              DashBoard()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashBoard() {
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.robot),
            contentDescription ="Company logo background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){
        TopAppBar(title = {Text(text = "Instagram")},
            navigationIcon = {
                IconButton(onClick ={} ) {
                    Icon(imageVector = Icons.Filled.Home,
                        contentDescription = "Home")
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.White,
                titleContentColor = Color.Blue,
                navigationIconContentColor = Color.Blue
            ),
            actions = {
                IconButton(onClick ={} ) {
                    Icon(imageVector = Icons.Filled.Search ,contentDescription ="My profile")
                }
                IconButton(onClick ={} ) {
                    Icon(imageVector = Icons.Filled.Menu ,contentDescription ="My profile")
                }
                IconButton(onClick ={} ) {
                    Icon(imageVector = Icons.Filled.Person ,contentDescription ="My profile")
                }
            }
        )
        Card (modifier = Modifier.padding(10.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = CardDefaults.cardElevation(10.dp)
        ){
            Box(modifier = Modifier.height(250.dp).fillMaxWidth()) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.robot),
                        contentDescription = "Profile Image",
                        modifier = Modifier
                            .size(200.dp)
                            .padding(end = 10.dp)
                    )
                    Text(
                        text = "el-Robot",
                        color = Color.Blue,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }
            }
       }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DashBoardPreview() {
    AppLesson1Theme {
        DashBoard()
    }
}