package ru.netology.coroutines.dto

import kotlinx.coroutines.Deferred

data class PostWithAll(
    val author: Author,
    val po
    val comments: List<Comment>,
)
