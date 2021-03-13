package com.example.androiddevchallenge

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate

@Composable
fun ComposeScreen1(navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(R.drawable.ic_welcome_bg),
            contentScale = ContentScale.FillBounds,
            contentDescription = null
        )

        Image(
            modifier = Modifier.align(Alignment.Center),
            painter = painterResource(R.drawable.ic_logo),
            contentDescription = null
        )

        Row(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 16.dp, bottom = 32.dp, end = 16.dp)
        ) {
            Button(
                onClick = { /* Do Nothing */ },
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp)
                    .padding(end = 4.dp),
                shape = RoundedCornerShape(24.dp),
            ) {
                Text("GET STARTED")
            }

            Button(
                onClick = { navController.navigate("ComposeScreen2") },
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp)
                    .padding(start = 4.dp),
                shape = RoundedCornerShape(24.dp),
                border = BorderStroke(
                    width = 1.dp,
                    color = MaterialTheme.colors.primary
                ),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Transparent,
                    contentColor = MaterialTheme.colors.primary
                )
            ) {
                Text("LOG IN")
            }
        }
    }
}