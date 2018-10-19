package com.nghiepnguyen.myapplication.mainActivity;

import com.nghiepnguyen.myapplication.model.Recipe;

import java.util.List;

public interface MainContract {
    interface presenter {
        void onDestroy();

        void requestDataFromServer(String query);
    }

    interface MainView {
        void showProgress();

        void hidProgress();

        void setDataToRecylerView(List<Recipe> recipeList);

        void responseFailure(Throwable t);
    }

    interface GetNoticeInteractor {
        interface onFinishedListener {
            void onFinished(List<Recipe> recipeList);

            void onFailure(Throwable t);
        }

        void getSearchResult(String query, onFinishedListener listener);
    }
}
