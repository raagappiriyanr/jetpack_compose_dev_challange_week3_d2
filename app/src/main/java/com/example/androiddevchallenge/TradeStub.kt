package com.example.androiddevchallenge

import androidx.annotation.DrawableRes

data class TradeData(
    val code:String,
    val name: String,
    val curPrice:String,
    val changePrice:String,
    @DrawableRes
    val image:Int,
    val isUp:Boolean
)

val trades = listOf<TradeData>(
    TradeData("ALK","Alaska Air Group, Inc.","$7,918","-0.54%",R.drawable.ic_home_alk, false),
    TradeData("BA","Boeing Co.","$1,293","+4.18%",R.drawable.ic_home_ba, true),
    TradeData("DAL","Delta Airlines Inc.","$893.50","-0.54%",R.drawable.ic_home_dal, true),
    TradeData("EXPE","Expedia Group Inc.","$12,301","+2.51%",R.drawable.ic_home_exp, true),
    TradeData("EADSY","Airbus SE","$12,301","+1.38%",R.drawable.ic_home_eadsy, true),
    TradeData("JBLU","Jetblue Airway Corp.","$8,521","+1.56%",R.drawable.ic_home_jblu, true),
    TradeData("MAR","Marriott International Inc.","$521","+2.75%",R.drawable.ic_home_mar, true),
    TradeData("CCL","Carnival Corp","$5,481","+0.14%",R.drawable.ic_home_ccl, true),
    TradeData("RCL","Royal Caribbean Cruises.","$9,184","+1.69%",R.drawable.ic_home_rcl, true),
    TradeData("TRVL","Travelocity Inc.","$654","+3.23%",R.drawable.ic_home_trvl, true)
)
