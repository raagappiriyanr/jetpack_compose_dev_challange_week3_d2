package com.example.androiddevchallenge

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate

@Composable
fun ComposeScreen1(navController: NavHostController) {
    Button(onClick = {navController.navigate("ComposeScreen2")}) {
      Text("Log in")
    }
}