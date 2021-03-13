package com.example.androiddevchallenge

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.green

@Composable
fun ComposeScreen3() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = MaterialTheme.colors.background
            )
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            item {
                Row(
                    modifier = Modifier.padding(top = 64.dp)
                ) {
                    Text(
                        text = "ACCOUNT",
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.button,
                    )
                    Text(
                        text = "WATCHLIST",
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.body1,
                    )
                    Text(
                        text = "PEOPLE",
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.body1,
                    )
                }
            }

            item {
                Text(
                    text = "Balance",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 32.dp),
                    style = MaterialTheme.typography.subtitle1,
                    textAlign = TextAlign.Center
                )
            }

            item {
                Text(
                    text = "$73,589.01",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    style = MaterialTheme.typography.h1,
                    textAlign = TextAlign.Center
                )
            }

            item {
                Text(
                    text = "+412.35 today",
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Center)
                        .padding(top = 16.dp),
                    style = MaterialTheme.typography.subtitle1,
                    color = green,
                    textAlign = TextAlign.Center
                )
            }

            item {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .padding(top = 32.dp)
                        .padding(horizontal = 16.dp)
                        .fillMaxWidth()
                        .height(48.dp),
                    shape = RoundedCornerShape(24.dp),
                ) {
                    Text("TRANSACT")
                }
            }

            item {
                LazyRow(
                    modifier = Modifier.padding(top = 16.dp)
                ) {
                    items(filters) {
                        FilterItem(filter = it)
                    }
                }
            }

            item {
                Image(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .padding(horizontal = 16.dp)
                        .fillMaxWidth(),
                    painter = painterResource(R.drawable.ic_home_illos),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth
                )
            }

            item {
                Text(
                    text = "Positions",
                    modifier = Modifier
                        .padding(top = 32.dp)
                        .fillMaxWidth()
                        .background(
                            color = MaterialTheme.colors.surface
                        )
                        .padding(vertical = 16.dp),
                    style = MaterialTheme.typography.subtitle1,
                    color = MaterialTheme.colors.onSurface,
                    textAlign = TextAlign.Center
                )
            }
            
            items(trades) {
                TradeStatus(tradeData = it)
            }
        }
    }
}

@Composable
fun FilterItem(filter: Filter) {
    Button(
        onClick = {},
        modifier = Modifier
            .height(40.dp)
            .padding(start = 8.dp),
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(
            width = 1.dp,
            color = MaterialTheme.colors.onBackground
        ),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.background,
            contentColor = MaterialTheme.colors.onBackground
        )
    ) {
        Text(
            text = filter.name,
            style = MaterialTheme.typography.body1
        )
    }
}

data class Filter(
    val name: String
)

val filters = listOf(
    Filter("Week"),
    Filter("ETFs"),
    Filter("Stocks"),
    Filter("Funds"),
    Filter("Bonds"),
    Filter("Crypto"),
)