package com.example.stockapplication.models

class Product {
    var name:String = ""
    var itemtype:String = ""
    var quantity:String = ""
    var price:String = ""
    var id:String = ""

    constructor(name: String, itemtype: String, quantity: String, price: String, id: String) {
        this.name = name
        this.itemtype = itemtype
        this.quantity = quantity
        this.price = price
        this.id = id
    }
    constructor()
}