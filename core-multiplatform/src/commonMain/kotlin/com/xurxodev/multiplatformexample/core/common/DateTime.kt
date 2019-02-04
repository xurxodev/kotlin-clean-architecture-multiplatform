package com.xurxodev.multiplatformexample.core.common

data class DateTime(
    val timestamp: Long
) : Comparable<DateTime> {
    constructor() : this(currentMillis())

    override fun compareTo(other: DateTime): Int = timestamp.compareTo(other.timestamp)
}

internal expect fun currentMillis(): Long
