package com.example.latihan_2010035.app

import com.example.latihan_2010035.model.BarangModel
import com.example.latihan_2010035.model.ResponModel
import retrofit2.http.Body
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @FormUrlEncoded
    @POST("tblproduk/save")
    fun savebarang(
        @Body data: BarangModel,
    ) :Call<ResponModel>

    @GET("barang")
    fun getBarang() :Call<ResponModel>
}