package com.himashi.android.realstate.data

import java.io.Serializable

data class Home(
    val id: Int,
    val image: String,
    val price: Double,
    val bedrooms: Int,
    val bathrooms: Int,
    val size: Int,
    val description: String,
    val zip: String,
    val city: String,
    val latitude: Double,
    val longitude: Double,
    val createdDate: String,
    val distance: String?
) : Serializable