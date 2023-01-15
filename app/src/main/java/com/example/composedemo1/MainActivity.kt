package com.example.composedemo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo1.components.TopBar
import com.example.composedemo1.screens.LoginScreen
import com.example.composedemo1.ui.theme.ComposeDemo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            var counter = remember {
//                mutableStateOf(0)
//            }
//            ComposeDemo1Theme {
//                Scaffold(
//                    topBar = {
//                        TopBar(title = "Demo", counter = counter)
//                    },
//                    content = {
//                        Column(
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                            verticalArrangement = Arrangement.Center,
//                            modifier = Modifier.fillMaxSize(1f),
//                            content = {
//                                Text(text = "${counter.value}",
//                                    fontSize = 64.sp
//                                )
//                                Spacer(modifier = Modifier.height(20.dp))
//                                OutlinedButton(
//                                    onClick = { counter.value ++; },
//                                ) {
//                                    Text(text = "Increment", fontSize = 18.sp)
//                                }
//                            }
//                        )
//                    }
//                )
//            }
            ComposeDemo1Theme {
                LoginScreen()
            }
        }
    }
}


@Preview
@Composable
fun Preview() {
//    var counter = remember {
//        mutableStateOf(0)
//    }
//    ComposeDemo1Theme {
//        Scaffold(
//            topBar = {
//                TopBar(title = "Demo", counter = counter)
//            },
//            content = {
//                Column(
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    verticalArrangement = Arrangement.Center,
//                    modifier = Modifier.fillMaxSize(1f),
//                    content = {
//                        Text(text = "${counter.value}",
//                            fontSize = 64.sp
//                        )
//                        Spacer(modifier = Modifier.height(20.dp))
//                        OutlinedButton(
//                            onClick = { counter.value++; },
//                        ) {
//                            Text(text = "Increment", fontSize = 18.sp)
//                        }
//                    }
//                )
//            }
//        )
//    }

    ComposeDemo1Theme {
        LoginScreen()
    }
}