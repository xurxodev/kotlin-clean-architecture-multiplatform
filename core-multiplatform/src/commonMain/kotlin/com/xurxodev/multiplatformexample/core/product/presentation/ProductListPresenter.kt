package com.xurxodev.multiplatformexample.core.product.presentation

import com.xurxodev.multiplatformexample.core.common.fold
import com.xurxodev.multiplatformexample.core.product.model.GetProductsUseCase
import com.xurxodev.multiplatformexample.core.product.model.entities.Product
import com.xurxodev.multiplatformexample.core.product.model.error.ProductsError

class ProductListPresenter(
    private val view: View,
    private val getProductsUseCase: GetProductsUseCase
) {

    fun onCreate() {
        loadProducts()
    }

    private fun loadProducts() {
        val productsResponse = getProductsUseCase.execute()

        productsResponse.fold(
            { left -> handleError(left) },
            { right ->
                showProducts(right)
            })
    }

    private fun showProducts(products: List<Product>) {
        view.showProducts(products)
    }

    private fun handleError(error: ProductsError) {
        view.showConnectionError()
    }

    interface View {
        fun showProducts(products: List<Product>)
        fun showConnectionError()
    }
}