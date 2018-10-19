package com.nghiepnguyen.myapplication.mainActivity;

import android.util.Log;

import com.nghiepnguyen.myapplication.model.RecipeList;
import com.nghiepnguyen.myapplication.myInterface.GetSearchResult;
import com.nghiepnguyen.myapplication.network.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetNoticeIntractorImpl implements MainContract.GetNoticeInteractor {
    @Override
    public void getSearchResult(String query, final onFinishedListener listener) {
        GetSearchResult service = RetrofitInstance.getRetrofitInstance().create(GetSearchResult.class);
        Call<RecipeList> call = service.getSearchResult(query);
        Log.wtf("URL called: ", call.request().url() + "");
        call.enqueue(new Callback<RecipeList>() {
            @Override
            public void onResponse(Call<RecipeList> call, Response<RecipeList> response) {
                listener.onFinished(response.body().getRecipes());
            }

            @Override
            public void onFailure(Call<RecipeList> call, Throwable t) {
                listener.onFailure(t);
            }
        });
    }
}
