package com.xurxodev.multiplatformexample.core.product.model

import com.xurxodev.multiplatformexample.core.common.Either
import com.xurxodev.multiplatformexample.core.product.model.boundaries.ProductRepository
import com.xurxodev.multiplatformexample.core.product.model.entities.Product
import com.xurxodev.multiplatformexample.core.product.model.error.ProductsError

class GetProductsUseCase(private val productRepository: ProductRepository) {
    fun execute(): Either<ProductsError, List<Product>> {
        return productRepository.getAllProducts()
    }
}