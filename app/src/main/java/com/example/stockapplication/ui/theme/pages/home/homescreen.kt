package com.example.stockapplication.ui.theme.pages.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.stockapplication.R
import com.example.stockapplication.navigation.ROUTE_ABOUT
import com.example.stockapplication.navigation.ROUTE_ADD_PRODUCTS
import com.example.stockapplication.navigation.ROUTE_LOGIN
import com.example.stockapplication.navigation.ROUTE_NEW_STOCK
import com.example.stockapplication.navigation.ROUTE_SIGNUP
import com.example.stockapplication.navigation.ROUTE_VIEW_PRODUCTS
import com.example.stockapplication.ui.theme.StockApplicationTheme

@Composable
fun HomeScreen(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.background), contentDescription = "background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.icon),contentDescription = "icon",
            Modifier.size(80.dp))
        Spacer(modifier = Modifier.height(3.dp))
        Text(
            text = "Stock App",
            color = Color.Black,
            fontFamily = FontFamily.Monospace,
            fontSize = 20.sp)
        Spacer(modifier = Modifier.height(70.dp))

        Button(onClick = {navController.navigate(ROUTE_VIEW_PRODUCTS)},
            modifier = Modifier.width(350.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray)) {
            Text(text = "View products", fontSize = 20.sp,
                color = Color(0xFFFFA200),
                modifier = Modifier.padding(5.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navController.navigate(ROUTE_ADD_PRODUCTS) },
            modifier = Modifier.width(350.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray)) {
            Text(text = "Add products", fontSize = 20.sp,
                color = Color(0xFFFFA200),
                modifier = Modifier.padding(5.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navController.navigate(ROUTE_NEW_STOCK) },
            modifier = Modifier.width(350.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray)) {
            Text(text = "New Stock", fontSize = 20.sp,
                color = Color(0xFFFFA200),
                modifier = Modifier.padding(5.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navController.navigate(ROUTE_ABOUT) },
            modifier = Modifier.width(350.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray)) {
            Text(text = "About the app", fontSize = 20.sp,
                color = Color(0xFFFFA200),
                modifier = Modifier.padding(5.dp))
        }
        Spacer(modifier = Modifier.height(300.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Have an Account? ",
                color =Color.Black,
                fontFamily = FontFamily.SansSerif,)
            TextButton(onClick = {navController.navigate(ROUTE_LOGIN)}) {
                Text(text = "Login", color = Color.Red) }
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Do you have an Account? ",
                color =Color.Black,
                fontFamily = FontFamily.SansSerif,)
            TextButton(onClick = {navController.navigate(ROUTE_SIGNUP)}) {
                Text(text = "Sign up", color = Color.Red) }
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