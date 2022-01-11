package com.raffysul.starting_personal_project.data.repository

import com.raffysul.starting_personal_project.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}