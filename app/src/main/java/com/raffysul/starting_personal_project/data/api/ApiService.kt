package com.raffysul.starting_personal_project.data.api

import com.raffysul.starting_personal_project.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

}