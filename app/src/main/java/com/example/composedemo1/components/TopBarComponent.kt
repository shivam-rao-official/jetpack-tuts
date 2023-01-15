package com.example.composedemo1.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopBar(title: String, counter: MutableState<Int>) {
    TopAppBar(
        title = {
            Text(text = title)
        },
        actions = {
            Row(
                content = {
                    Icon(Icons.Filled.Refresh,
                        contentDescription = "reset",
                        modifier = Modifier.padding(end = 10.dp).clickable { counter.value = 0 }
                    )
                }
            )
        }
    )
}


@Preview
@Composable
fun Preview() {
//    TopBar(title = "Hello", 0)
}