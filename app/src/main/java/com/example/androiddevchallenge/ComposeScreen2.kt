package com.example.androiddevchallenge

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate

@Composable
fun ComposeScreen2(navController: NavHostController) {
    Button(onClick = {navController.navigate("ComposeScreen3")}) {
        Text("Log in Page")
    }
}