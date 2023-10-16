package com.app.notes.notes_features.domain.utils

sealed class OrderType{
    object Ascending: OrderType()
    object Descending: OrderType()
}
