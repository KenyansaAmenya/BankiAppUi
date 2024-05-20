package com.example.bankiappui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.CurrencyLira
import androidx.compose.material.icons.rounded.CurrencyPound
import androidx.compose.material.icons.rounded.CurrencyRuble
import androidx.compose.material.icons.rounded.CurrencyRupee
import androidx.compose.material.icons.rounded.CurrencyYen
import androidx.compose.material.icons.rounded.CurrencyYuan
import androidx.compose.material.icons.rounded.Euro
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.bankiappui.data.Currency

val currencies = listOf(
    Currency(
        name = "USD",
        buy = 135.50f,
        sell = 125.25f,
        icon = Icons.Rounded.AttachMoney
    ),

    Currency(
        name = "EUR",
        buy = 140.50f,
        sell = 135.25f,
        icon = Icons.Rounded.Euro
    ),

    Currency(
        name = "YEN",
        buy = 100.50f,
        sell = 95.25f,
        icon = Icons.Rounded.CurrencyYen
    ),

    Currency(
        name = "YUAN",
        buy = 110.50f,
        sell = 109.25f,
        icon = Icons.Rounded.CurrencyYuan
    ),
    Currency(
        name = "POUND",
        buy = 150.50f,
        sell = 149.25f,
        icon = Icons.Rounded.CurrencyPound
    ),

    Currency(
        name = "RUBLE",
        buy = 95.50f,
        sell = 94.25f,
        icon = Icons.Rounded.CurrencyRuble
    ),

    Currency(
        name = "RUPEE",
        buy = 50.50f,
        sell = 48.25f,
        icon = Icons.Rounded.CurrencyRupee
    ),

    Currency(
        name = "LIRA",
        buy = 80.50f,
        sell = 78.25f,
        icon = Icons.Rounded.CurrencyLira
    ),

)


@Preview
@Composable
fun CurrenciesSection() {
    var isVisible by remember {
        mutableStateOf(false)
    }
    var iconState by remember {
        mutableStateOf(Icons.Rounded.KeyboardArrowUp)
    }



}