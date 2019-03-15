package com.xurxodev.multiplatformexample.core.product.model.error

sealed class ProductError {
    object NetworkConnection : ProductError()
    object ProductNotFound: ProductError()
}
