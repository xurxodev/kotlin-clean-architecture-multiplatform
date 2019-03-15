package com.xurxodev.multiplatformexample.core.product.presentation

import com.xurxodev.multiplatformexample.core.common.fold
import com.xurxodev.multiplatformexample.core.product.model.GetProductUseCase
import com.xurxodev.multiplatformexample.core.product.model.entities.Product
import com.xurxodev.multiplatformexample.core.product.model.error.ProductError

class ProductPresenter(
    private val productId: Int,
    private val view: View,
    private val getProductUseCase: GetProductUseCase
) {

    fun onCreate() {
        loadProducts()
    }

    private fun loadProducts() {
        val productsResponse = getProductUseCase.execute(productId)

        productsResponse.fold(
            { left -> handleError(left) },
            { right ->
                showProduct(right)
            })
    }

    private fun showProduct(product: Product) {
        view.showProduct(product)
    }

    private fun handleError(error: ProductError) = when (error) {
        is ProductError.NetworkConnection -> view.showConnectionError()
        is ProductError.ProductNotFound -> view.showProductNotfoundError()
    }

    interface View {
        fun showProduct(products: Product)
        fun showProductNotfoundError()
        fun showConnectionError()
    }
}