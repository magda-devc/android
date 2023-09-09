package com.example.stockapplication.ui.theme.pages.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.stockapplication.navigation.ROUTE_ADD_PRODUCTS
import com.example.stockapplication.navigation.ROUTE_LOGIN
import com.example.stockapplication.navigation.ROUTE_NEW_STOCK
import com.example.stockapplication.navigation.ROUTE_OLD_STOCK
import com.example.stockapplication.navigation.ROUTE_UPDATE_PRODUCTS
import com.example.stockapplication.ui.theme.StockApplicationTheme

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = Modifier.fillMaxSize()) {

        }
        Text(
            text = "Welcome to Home Screen", color = Color.Green,
            fontFamily = FontFamily.Monospace, fontSize = 25.sp)
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navController.navigate(ROUTE_LOGIN) }) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navController.navigate(ROUTE_ADD_PRODUCTS) }) {
            Text(text = "Add products")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navController.navigate(ROUTE_NEW_STOCK) }) {
            Text(text = "New Stock")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navController.navigate(ROUTE_OLD_STOCK) }) {
            Text(text = "Old Stock")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navController.navigate(ROUTE_UPDATE_PRODUCTS) }) {
            Text(text = "Update Products")
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    StockApplicationTheme {
        HomeScreen(rememberNavController())
    }
}