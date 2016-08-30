package com.example.mauricio.simpledagger2;

import android.app.*;
import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.databinding.DataBindingUtil;

import com.example.mauricio.simpledagger2.databinding.ActivityMainBinding;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    MarteloMedio marteloMedio;
    @Inject
    MainHandlers mainHandlers;
    @Inject
    Echo echo;

    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MyApplication.getCaixaDeFerramentas().inject(this);

        echo.text = marteloMedio.getDepencencia();

        mBinding.setEcho(echo);
        mBinding.setHandlers(mainHandlers);

    }

}