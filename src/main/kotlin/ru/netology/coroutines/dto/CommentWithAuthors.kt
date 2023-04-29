package ru.netology.coroutines.dto

data class CommentWithAuthors(
    val commentAuthor: Author,
    val comment: Comment,
)
