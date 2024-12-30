package io.github.nsk90.network.client.bybit

import io.github.nsk90.network.client.NetworkClient
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.comparables.shouldBeGreaterThan
import io.kotest.matchers.shouldBe

class BybitApiTest : StringSpec({
    val client = NetworkClient.httpClient
    val api = BybitApi(client)

    "should fetch server time" {
        val response = api.getServerTime()
        response.ret_code shouldBe 0
        response.time shouldBeGreaterThan 0
    }
})