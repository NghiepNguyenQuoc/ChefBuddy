package com.nghiepnguyen.myapplication.mainActivity;

import com.nghiepnguyen.myapplication.model.Recipe;

import java.util.List;

public class MainPresenterImpl implements MainContract.presenter, MainContract.GetNoticeInteractor.onFinishedListener {
    private MainContract.MainView mainView;
    private MainContract.GetNoticeInteractor getNoticeIntractor;

    public MainPresenterImpl(MainContract.MainView mainView, MainContract.GetNoticeInteractor getNoticeInteractor) {
        this.mainView = mainView;
        this.getNoticeIntractor = getNoticeInteractor;
    }

    @Override
    public void onFinished(List<Recipe> recipeList) {
        if (mainView != null) {
            mainView.setDataToRecylerView(recipeList);
            mainView.hidProgress();
        }
    }

    @Override
    public void onFailure(Throwable t) {
        if (mainView != null) {
            mainView.responseFailure(t);
            mainView.hidProgress();
        }
    }

    @Override
    public void requestDataFromServer(String query) {
        getNoticeIntractor.getSearchResult(query, this);
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }

}
