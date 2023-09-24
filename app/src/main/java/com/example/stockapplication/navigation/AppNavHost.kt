package com.example.stockapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.midmorningnavigationapp.ui.theme.pages.products.AddProductsScreen
import com.example.stockapplication.ui.theme.pages.about.AboutScreen
import com.example.stockapplication.ui.theme.pages.home.HomeScreen
import com.example.stockapplication.ui.theme.pages.login.LoginScreen
import com.example.stockapplication.ui.theme.pages.products.NewStockScreen
import com.example.stockapplication.ui.theme.pages.products.UpdateProductsScreen
import com.example.stockapplication.ui.theme.pages.products.ViewProductsScreen
import com.example.stockapplication.ui.theme.pages.signup.SignupScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination:String = ROUTE_HOME) {
    NavHost(navController = navController,
        modifier = modifier, startDestination = startDestination
    ) {
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCTS){
            AddProductsScreen(navController)
        }
        composable(ROUTE_NEW_STOCK){
            NewStockScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCTS +"/id"){ passedData->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_SIGNUP){
            SignupScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCTS){
            ViewProductsScreen(navController)
        }
    }
}