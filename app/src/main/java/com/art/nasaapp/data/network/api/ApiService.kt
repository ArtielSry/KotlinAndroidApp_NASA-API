package com.art.nasaapp.data.network.api
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("apod?")
    suspend fun getNasaData(@Query("api_key") key: String): Response<NasaResponse>
}

data class NasaResponse(
    @SerializedName("date") val date: String,
    @SerializedName("title") val title: String,
    @SerializedName("explanation") val expedition: String,
)