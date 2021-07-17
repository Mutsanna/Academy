package com.mutsanna.academy.data.source.remote

import com.mutsanna.academy.data.source.remote.StatusResponse.SUCCESS
import com.mutsanna.academy.data.source.remote.StatusResponse.EMPTY
import com.mutsanna.academy.data.source.remote.StatusResponse.ERROR

class ApiResponse<T>(val status: StatusResponse, val body: T, val message: String?) {
    companion object {
        fun <T> success(body: T): ApiResponse<T> = ApiResponse(SUCCESS, body, null)

        fun <T> empty(msg: String, body: T): ApiResponse<T> = ApiResponse(EMPTY, body, msg)

        fun <T> error(msg: String, body: T): ApiResponse<T> = ApiResponse(ERROR, body, msg)
    }
}