package com.spacemagical.spacemagical.models

data class User(
    val id: Int,
    val name: String,
    val iconUrl: String,
    val jobType: JobType
)
