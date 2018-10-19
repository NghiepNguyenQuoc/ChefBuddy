package com.nghiepnguyen.myapplication.myInterface;

import com.nghiepnguyen.myapplication.model.RecipeList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetSearchResult {
    @GET("search?key=d542f16fec7caddf064cac4043b486f3/")
    Call<RecipeList> getSearchResult(@Query("q") String q);

}
