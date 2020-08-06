package com.example.data.entities


import com.google.gson.annotations.SerializedName

data class ResponseCharacters(
    @SerializedName("results")
    val characters: List<Character>? = null,
    @SerializedName("info")
    val info: Info? = null
)