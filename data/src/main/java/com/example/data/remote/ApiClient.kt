package com.example.data.remote

import javax.inject.Inject

class ApiClient @Inject constructor(
    private val apiService: ApiService
) {
}