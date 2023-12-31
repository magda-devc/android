package com.example.stockapplication.ui.theme.pages.products

import android.widget.TableLayout
import android.widget.TableRow
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.stockapplication.data.ProductRepository
import com.example.stockapplication.models.Product
import com.example.stockapplication.navigation.ROUTE_ADD_PRODUCTS
import com.example.stockapplication.navigation.ROUTE_UPDATE_PRODUCTS
import com.example.stockapplication.ui.theme.StockApplicationTheme
import com.google.firebase.auth.FirebaseAuth


@Composable
fun ViewProductsScreen(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        
        var context = LocalContext.current
        var productRepository = ProductRepository(navController, context)


        val emptyProductState = remember { mutableStateOf(Product("","","","","")) }
        var emptyProductsListState = remember { mutableStateListOf<Product>() }

        var products = productRepository.viewProducts(emptyProductState, emptyProductsListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "All products",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color(0xFFFFA200))

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn() {
                items(products){
                    ProductItem(
                        name = it.name,
                        itemtype = it.itemtype,
                        quantity = it.quantity,
                        price = it.price,
                        id = it.id,
                        navController = navController,
                        productRepository = productRepository
                    )
                }
            }
        }
    }
}


@Composable
fun ProductItem(name:String, itemtype:String, quantity:String ,price:String, id:String,
                navController:NavHostController, productRepository:ProductRepository) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = name)
        Text(text = itemtype)
        Text(text = quantity)
        Text(text = price)
        Button(onClick = {
            productRepository.deleteProduct(id)
        }) {
            Text(text = "Delete")
        }
        Button(onClick = {
            navController.navigate(ROUTE_ADD_PRODUCTS)
        }) {
            Text(text = "Update")
        }
    }
}

@Preview
@Composable
fun ViewProductsPreviewScreen() {
    StockApplicationTheme {
        ViewProductsScreen(rememberNavController())
    }
}
