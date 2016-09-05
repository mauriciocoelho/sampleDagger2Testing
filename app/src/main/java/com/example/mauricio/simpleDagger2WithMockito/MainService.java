package com.example.mauricio.simpleDagger2WithMockito;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;

import javax.inject.Inject;


public class MainService extends IntentService {

    @Inject MarteloMedio marteloMedio;

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        public void run() {
            afficher();
        }
    };

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
        runnable.run();
    }

    public void afficher()
    {
        Log.i("teste", marteloMedio.getDepencencia());
        handler.postDelayed(runnable, 1000);
    }


}
