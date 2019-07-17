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
        Product("Devslopes Graphic Beanie", "$18", "hat01"),
        Product("Devslopes Hat Black", "$18", "hat02"),
        Product("Devslopes Hat White", "$18", "hat03"),
        Product("Devslopes Hat Snapback", "$18", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$18", "hoodie01"),
        Product("Devslopes Hoodie Red", "$18", "hoodie02"),
        Product("Devslopes Hoodie Yellow", "$18", "hoodie03"),
        Product("Devslopes Hoodie Black", "$18", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Gray", "$18", "shirt01"),
        Product("Devslopes Shirt Red", "$18", "shirt02"),
        Product("Devslopes Shirt Yellow", "$18", "shirt03"),
        Product("Devslopes Shirt Black", "$18", "shirt04"),
        Product("Kickflip Studios", "$18", "shirt05")
    )

}