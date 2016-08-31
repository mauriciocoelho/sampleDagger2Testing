package com.example.mauricio.simpledagger2;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;


public class MainService extends IntentService {

    public MainService() {
        super(MainService.class.getSimpleName());
    }

    @Override
    public void onCreate() {
        super.onCreate();
        MyApplication.getCaixaDeFerramentas().inject(this);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i("teste", "MainService iniciado com sucesso");
        doSomething();
    }

    private void doSomething() {
        Log.i("teste", "RODAAANDO CARALHO");

        while (true){
            Log.i("teste", "RODAAANDO CARALHO");
        }
    }


}
