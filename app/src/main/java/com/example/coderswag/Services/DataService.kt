package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")

    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$18", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$18", "hat4"),
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$18", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$18", "hat4"),
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$18", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$18", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$18", "hoodie1"),
        Product("Devslopes Hoodie Red", "$18", "hoodie2"),
        Product("Devslopes Hoodie Yellow", "$18", "hoodie3"),
        Product("Devslopes Hoodie Black", "$18", "hoodie4"),
        Product("Devslopes Hoodie Gray", "$18", "hoodie1"),
        Product("Devslopes Hoodie Red", "$18", "hoodie2"),
        Product("Devslopes Hoodie Yellow", "$18", "hoodie3"),
        Product("Devslopes Hoodie Black", "$18", "hoodie4"),
        Product("Devslopes Hoodie Gray", "$18", "hoodie1"),
        Product("Devslopes Hoodie Red", "$18", "hoodie2"),
        Product("Devslopes Hoodie Yellow", "$18", "hoodie3"),
        Product("Devslopes Hoodie Black", "$18", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Gray", "$18", "shirt1"),
        Product("Devslopes Shirt Red", "$18", "shirt2"),
        Product("Devslopes Shirt Yellow", "$18", "shirt3"),
        Product("Devslopes Shirt Black", "$18", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5"),
        Product("Devslopes Shirt Gray", "$18", "shirt1"),
        Product("Devslopes Shirt Red", "$18", "shirt2"),
        Product("Devslopes Shirt Yellow", "$18", "shirt3"),
        Product("Devslopes Shirt Black", "$18", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5"),
        Product("Devslopes Shirt Gray", "$18", "shirt1"),
        Product("Devslopes Shirt Red", "$18", "shirt2"),
        Product("Devslopes Shirt Yellow", "$18", "shirt3"),
        Product("Devslopes Shirt Black", "$18", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category : String) : List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }

    }

}