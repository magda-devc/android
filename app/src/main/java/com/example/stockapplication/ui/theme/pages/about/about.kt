package com.example.stockapplication.ui.theme.pages.about

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.stockapplication.ui.theme.StockApplicationTheme

@Composable
fun AboutScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome to about screen", color = Color.Magenta, fontSize = 30.sp)
        Spacer(modifier = Modifier.width(50.dp))
        Text(text = "This app was designed to help small retailers and small " +
                "business owners keep track of their stock and know how much profit " +
                "they make after a period of time")
    }
}

@Preview
@Composable
fun AboutScreenPreview() {
    StockApplicationTheme {
        AboutScreen(rememberNavController())
    }
}