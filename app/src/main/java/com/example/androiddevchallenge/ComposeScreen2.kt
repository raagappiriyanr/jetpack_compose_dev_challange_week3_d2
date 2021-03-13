package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Password
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate

@Composable
fun ComposeScreen2(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Box(modifier = Modifier
            .fillMaxSize()
            .weight(1f)){
            Image(painterResource(id = R.drawable.ic_login_bg), null,
                modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillBounds)
            Text("Welcome Back",
                style = MaterialTheme.typography.h2.copy(color = MaterialTheme.colors.onBackground),
                modifier = Modifier
                    .height(152.dp)
                    .padding(horizontal = 40.dp)
                    .align(Alignment.Center),
                textAlign = TextAlign.Center
            )
        }
        Box(modifier = Modifier
            .fillMaxSize()
            .weight(1f)){
            Column(horizontalAlignment = Alignment.CenterHorizontally){
                val emailAddress = rememberSaveable{ mutableStateOf("")}
                val password = rememberSaveable{ mutableStateOf("")}
                OutlinedTextField(value =emailAddress.value ,
                    onValueChange = { emailAddress.value = it},
                    label = {Text("Email Address",
                        style = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.onSurface))},
                    leadingIcon = {Icon(Icons.Outlined.MailOutline, null, modifier = Modifier.size(24.dp))},
                    modifier = Modifier.padding(top =40.dp, start = 16.dp, end =16.dp).fillMaxWidth().height(56.dp)
                )
                OutlinedTextField(value =password.value ,
                    onValueChange = {password.value = it },
                    visualTransformation = PasswordVisualTransformation(),
                    label = {Text("Password",
                        style = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.onSurface))},
                    leadingIcon = {Icon(Icons.Outlined.Password, null, modifier = Modifier.size(24.dp))},
                    modifier = Modifier.padding(top =8.dp, start = 16.dp, end =16.dp).fillMaxWidth().height(56.dp)
                )
                Button(onClick = {navController.navigate("ComposeScreen3")}, modifier = Modifier
                    .padding(top = 16.dp, end = 16.dp, start = 16.dp)
                    .fillMaxWidth()
                    .height(48.dp)
                    , shape = RoundedCornerShape(24.dp) ) {
                    Text("LOG IN", style = MaterialTheme.typography.button.copy(color = MaterialTheme.colors.onPrimary))
                }
            }
        }
    }
}