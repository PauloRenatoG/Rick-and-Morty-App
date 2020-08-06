package com.example.rickandmorty.di

import com.example.data.BuildConfig
import com.example.data.remote.ApiClient
import com.example.data.remote.ApiService
import com.example.rickandmorty.utils.API_ENDPOINT
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object ApiProviderModule {

    @Singleton
    @Provides
    fun providesApiEndPoint(): String {
        return BuildConfig.API_ENDPOINT
    }

    @Singleton
    @Provides
    fun providesRetrofit(
        @Named(API_ENDPOINT) apiEndPoint: String
    ): Retrofit {
        return Retrofit
            .Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(apiEndPoint)
            .build()
    }

    @Singleton
    @Provides
    fun providesApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Singleton
    @Provides
    fun providesApiClient(apiService: ApiService): ApiClient {
        return ApiClient(apiService)
    }
}