package com.raffysul.starting_personal_project.data.api


class ApiHelper(private val apiService: ApiService) {

    suspend fun getUsers() = apiService.getUsers()
}