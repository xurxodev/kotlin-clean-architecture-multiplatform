package com.xurxodev.multiplatformexample.core.product.model.error

sealed class ProductsError {
    object NetworkConnection : ProductsError()
}