package io.github.nsk90.network.client.exchange

import io.github.nsk90.network.client.bybit.BybitApi

interface ExchangeApi {
    suspend fun getServerTime(): Long
}

class BybitExchangeApi(private val api: BybitApi) : ExchangeApi {
    override suspend fun getServerTime(): Long {
        return api.getServerTime().time
    }
}