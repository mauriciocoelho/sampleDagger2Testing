package com.example.mauricio.simpledagger2;

import android.util.Log;
import android.view.View;


/**
 * Created by mauricio on 8/30/16.
 */

public class MainHandlers {

    MarteloMedio marteloMedio;

    public MainHandlers(MarteloMedio marteloMedio) {
        this.marteloMedio = marteloMedio;
    }

    public void onClickTest(View view){
        Log.i(MainHandlers.class.getSimpleName(), marteloMedio.getName());
    }

}
