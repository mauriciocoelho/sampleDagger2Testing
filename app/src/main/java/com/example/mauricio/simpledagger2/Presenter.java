package com.example.mauricio.simpledagger2;

import android.util.Log;
import android.view.View;

/**
 * Created by mauricio on 8/30/16.
 */

public class Presenter {

    public void onClickTest(MainViewModel viewModel){
        if (viewModel.text.get() != null && !viewModel.text.get().isEmpty()){
            Log.i("teste", viewModel.text.get());
        }
    }

}
