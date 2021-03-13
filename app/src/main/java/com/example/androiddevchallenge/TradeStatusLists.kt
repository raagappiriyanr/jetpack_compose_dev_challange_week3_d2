package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun TradeStatus(tradeData: TradeData) {
    Divider(color = Color.Black)
    Row(modifier = Modifier
        .fillMaxWidth().padding(bottom = 16.dp)
        .height(40.dp)){
        Box{
            ShowPriceData(tradeData.curPrice, tradeData.changePrice, tradeData.isUp)
        }
        Box(modifier =Modifier.weight(1f).padding(start=16.dp)){
            ShowNameData(tradeData.code, tradeData.name)
        }
        Image(painter = painterResource(tradeData.image), contentDescription = null,
            modifier = Modifier.fillMaxSize().padding(top = 10.dp).weight(1f))
    }
}

@Composable
fun ShowNameData(code: String, name: String) {
    val color = MaterialTheme.colors.onSurface
        Column {
            Text(code, modifier = Modifier.padding(top = 10.dp).height(14.dp), style = MaterialTheme.typography.h3.copy(color = color))
            Text(name, modifier = Modifier.height(16.dp), style = MaterialTheme.typography.body1.copy(color = color))
        }
}

@Composable
fun ShowPriceData(price: String, changePrice: String, isUp: Boolean) {
    val style = MaterialTheme.typography.body1
    val changePriceColor = if(isUp) MaterialTheme.colors.secondary else MaterialTheme.colors.onSecondary
  Column {
      Text(price, modifier = Modifier.padding(top = 10.dp).height(14.dp), style = style.copy(color = MaterialTheme.colors.onSurface))
      Text(changePrice, modifier = Modifier.height(16.dp), style = style.copy(color = changePriceColor))
  }
}
