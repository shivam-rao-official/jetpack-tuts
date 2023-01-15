package com.example.composedemo1.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {
    var username by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Scaffold(

    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.dp)
        ) {
            Text("Hello Again!\nWelcome\nBack", fontSize = 20.sp)
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(
                label = {
                    Text("Username")
                },
                placeholder = {
                    Text(text = "Enter username here")
                },
                value = "$username", onValueChange = {
                    username = it
                },
            )
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(
                label = {
                    Text("Password")
                },
                placeholder = {
                    Text(text = "Enter password here")
                },
                value = "$password", onValueChange = {
                    password = it
                },
            )
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = { /*TODO*/ }) {
                Text(text = "LOGIN")
            }
            Text(text = "Username: $username\nPassword: $password")
        }
    }
}


@Preview
@Composable
fun Preview() {
    LoginScreen()
}