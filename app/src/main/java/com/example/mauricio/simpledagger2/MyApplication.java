package com.example.mauricio.simpledagger2;

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

    }

    public static NossaCaixaDeFerramentas getCaixaDeFerramentas(){
        return  caixaDeFerramentas;
    }
}
