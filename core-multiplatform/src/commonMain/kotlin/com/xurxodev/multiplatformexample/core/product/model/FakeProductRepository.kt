package com.xurxodev.multiplatformexample.core.product.model

import com.xurxodev.multiplatformexample.core.common.Either
import com.xurxodev.multiplatformexample.core.product.model.boundaries.ProductRepository
import com.xurxodev.multiplatformexample.core.product.model.entities.Currency
import com.xurxodev.multiplatformexample.core.product.model.entities.Money
import com.xurxodev.multiplatformexample.core.product.model.entities.Product
import com.xurxodev.multiplatformexample.core.product.model.error.ProductError
import com.xurxodev.multiplatformexample.core.product.model.error.ProductsError

class FakeProductRepository(): ProductRepository {
    private val products = mutableListOf<Product>()

    init {
        products.add(
            Product(
                id = 1,
                title = "Polar M430 GPS Running Watch",
                price = Money(179.70, Currency.USD),
                photo = "https://images-na.ssl-images-amazon.com/images/I/71P5T7JIc5L._SL1500_.jpg"
            )
        )

        products.add(
            Product(
                id = 2,
                title = "Apple Watch Series 4 (GPS, 40mm) - Space Gray Aluminium Case with Black Sport Band",
                price = Money(384.99, Currency.USD),
                photo = "https://images-na.ssl-images-amazon.com/images/I/51k-vKS4AOL._SL1024_.jpg"
            )
        )

        products.add(
            Product(
                id = 3,
                title = "Fitbit Charge 3 Fitness Activity Tracker, Rose Gold/Blue Grey, One Size",
                price = Money(149.00, Currency.USD),
                photo = "https://images-na.ssl-images-amazon.com/images/I/719DSpWp3LL._SX522_.jpg"
            )
        )

        products.add(
            Product(
                id = 4,
                title = "Suunto 9 GPS Watch",
                price = Money(499.00, Currency.USD),
                photo = "https://images-na.ssl-images-amazon.com/images/I/71LCCVhpwjL._SL1500_.jpg"
            )
        )

        products.add(
            Product(
                id = 5,
                title = "Garmin Forerunner 735XT - Midnight Blue & Frost Blue",
                price = Money(349.99, Currency.USD),
                photo = "https://images-na.ssl-images-amazon.com/images/I/71JbFcge%2BgL._SL1500_.jpg"
            )
        )

        products.add(
            Product(
                id = 6,
                title = "Garmin Forerunner 235 - Reloj con pulsómetro en la muñeca, unisex, color eléctrico Negro y Azul Hielo, talla única",
                price = Money(179.99, Currency.USD),
                photo = "https://images-na.ssl-images-amazon.com/images/I/71qabbxp4wL._SL1260_.jpg"
            )
        )

        products.add(
            Product(
                id = 7,
                title = "Garmin Forerunner 35 GPS Running Watch + Wrist HRM",
                price = Money(152.04, Currency.USD),
                photo = "https://images-na.ssl-images-amazon.com/images/I/61iRtbFOK9L._SL1047_.jpg"
            )
        )

        products.add(
            Product(
                id = 8,
                title = "Ticwatch E most comfortable Smartwatch-Shadow,1.4 inch OLED Display, Android Wear",
                price = Money(129.99, Currency.USD),
                photo = "https://images-na.ssl-images-amazon.com/images/I/61vOelwye-L._SL1000_.jpg"
            )
        )

        products.add(
            Product(
                id = 9,
                title = "Samsung Gear Fit2 Pro Smart Fitness Band ",
                price = Money(155.97, Currency.USD),
                photo = "https://images-na.ssl-images-amazon.com/images/I/51IO9WydC-L._SL1000_.jpg"
            )
        )
    }

    override fun getProductById(id: Int): Either<ProductError, Product> {
        val product = products.firstOrNull { it.id == id }

        return if (product == null){
            Either.Left(ProductError.ProductNotFound)
        } else {
            Either.Right(product)
        }
    }

    override fun getAllProducts(): Either<ProductsError, List<Product>> {
        return Either.Right(products)
    }
}