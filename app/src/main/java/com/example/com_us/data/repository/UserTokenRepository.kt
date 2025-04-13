package com.example.com_us.data.repository

import com.example.com_us.data.model.auth.LoginResponse
import kotlinx.coroutines.flow.Flow

interface UserTokenRepository {
    suspend fun saveRefreshToken(refreshToken : String)
    suspend fun saveAccessToken(accessToken : String)
    suspend fun getAccessToken() : Flow<String>
    suspend fun getRefreshToken()  :Flow<String>
    val tokenPreferencesFlow : Flow<LoginResponse>
}