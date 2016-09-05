package com.example.mauricio.simpleDagger2WithMockito;

import android.content.Intent;

import io.paperdb.Paper;

/**
 * Created by mauricio on 8/30/16.
 */

public class MyApplication extends android.app.Application {

    private static NossaCaixaDeFerramentas caixaDeFerramentas;

    @Override
    public void onCreate() {
        super.onCreate();

        caixaDeFerramentas = DaggerNossaCaixaDeFerramentas.builder()
                .martelos(new Martelos())
                .build();

        Paper.init(this);

        startSevices();
    }

    private void startSevices() {
        startService(new Intent(this, MainService.class));
    }

    public static NossaCaixaDeFerramentas getCaixaDeFerramentas(){
        return  caixaDeFerramentas;
    }
}
