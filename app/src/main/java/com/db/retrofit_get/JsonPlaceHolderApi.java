package com.db.retrofit_get;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<Posts>> getPosts();

    @GET("posts/{id}/comments")
    Call<List<Comments>> getComments(@Path("id") int postId);
}
