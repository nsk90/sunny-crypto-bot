package io.github.nsk90.network.client.bybit

import io.github.nsk90.network.client.dto.ServerTimeResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*

class BybitApi(private val client: HttpClient) {
    private val baseUrl = "https://api.bybit.com"

    suspend fun getServerTime(): ServerTimeResponse {
        return client.get("$baseUrl/v2/public/time") {
            contentType(ContentType.Application.Json)
        }.body()
    }
}