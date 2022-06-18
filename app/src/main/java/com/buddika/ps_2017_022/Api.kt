package com.buddika.ps_2017_022

import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("/posts")
    fun getPosts(): Call<MutableList<Post>>
}
