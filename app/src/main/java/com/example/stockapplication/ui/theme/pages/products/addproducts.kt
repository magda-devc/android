package com.example.stockapplication.ui.theme.pages.products

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.stockapplication.ui.theme.StockApplicationTheme
import com.example.stockapplication.ui.theme.pages.about.AboutScreen

@Composable
fun AddProductsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome to add products screen", color = Color.Magenta, fontSize = 30.sp)
    }
}
@Preview
@Composable
fun AddProductsScreenPreview() {
    StockApplicationTheme {
        AddProductsScreen(rememberNavController())
    }
}