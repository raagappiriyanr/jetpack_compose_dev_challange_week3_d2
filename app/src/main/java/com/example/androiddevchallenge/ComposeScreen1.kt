package com.example.androiddevchallenge

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate

@Composable
fun ComposeScreen1(navController: NavHostController) {
    Column(Modifier.fillMaxSize()) {
        Button(
            onClick = { navController.navigate("ComposeScreen2") },
            modifier = Modifier.align(Alignment.CenterHorizontally).height(100.dp)
        ) {
            Text("Log in")
        }
    }
}