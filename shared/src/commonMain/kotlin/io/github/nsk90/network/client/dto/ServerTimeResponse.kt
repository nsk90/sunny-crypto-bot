package io.github.nsk90.network.client.dto

import kotlinx.serialization.Serializable

@Serializable
data class ServerTimeResponse(
    val ret_code: Int,
    val ret_msg: String,
    val time: Long
)