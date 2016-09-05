package com.example.mauricio.simpleDagger2WithMockito;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by mauricio on 8/30/16.
 */

public class Presenter {

    MarteloMedio marteloMedio;

    @Inject
    public Presenter(MarteloMedio marteloMedio) {
        this.marteloMedio = marteloMedio;
    }

    public void onClickTest(MainViewModel viewModel){
        if (viewModel.text.get() != null && !viewModel.text.get().isEmpty()){
            Log.i("teste", viewModel.text.get());
            marteloMedio.setData(viewModel.text.get());
        }
    }

}
