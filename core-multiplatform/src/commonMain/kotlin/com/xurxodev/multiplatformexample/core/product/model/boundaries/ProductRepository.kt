package com.xurxodev.multiplatformexample.core.product.model.boundaries

import com.xurxodev.multiplatformexample.core.common.Either
import com.xurxodev.multiplatformexample.core.product.model.entities.Product
import com.xurxodev.multiplatformexample.core.product.model.error.ProductError
import com.xurxodev.multiplatformexample.core.product.model.error.ProductsError

interface ProductRepository {
    fun getAllProducts(): Either<ProductsError, List<Product>>
    fun getProductById(id: Int): Either<ProductError, Product>
}