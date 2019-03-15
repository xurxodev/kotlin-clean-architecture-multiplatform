package com.xurxodev.multiplatformexample.core.product.model

import com.xurxodev.multiplatformexample.core.common.Either
import com.xurxodev.multiplatformexample.core.product.model.boundaries.ProductRepository
import com.xurxodev.multiplatformexample.core.product.model.entities.Product
import com.xurxodev.multiplatformexample.core.product.model.error.ProductError

class GetProductUseCase(private val productRepository: ProductRepository) {
    fun execute(id: Int): Either<ProductError, Product> {
        return productRepository.getProductById(id)
    }
}