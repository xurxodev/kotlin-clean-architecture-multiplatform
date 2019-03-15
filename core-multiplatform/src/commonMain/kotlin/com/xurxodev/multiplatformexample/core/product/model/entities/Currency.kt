package com.xurxodev.multiplatformexample.core.product.model.entities

data class Currency(val isoCode: String, val generalName: String, val symbol: String) {
    companion object {
        val USD = Currency(
            "USD",
            "US dollar",
            "$"
        )
        val EURO =
            Currency("EUR", "Euro", "€")
    }
}