package com.example.mauricio.simpledagger2;

import android.content.Intent;
import android.util.Log;

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

        startSevices();
    }

    private void startSevices() {
        startService(new Intent(this, MainService.class));
    }

    public static NossaCaixaDeFerramentas getCaixaDeFerramentas(){
        return  caixaDeFerramentas;
    }
}
