package com.example.mauricio.simpledagger2;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class Martelos {

    @Provides
    public MarteloPequeno providesMarteloPequeno() {
        return new MarteloPequeno();
    }

    @Provides
    public MarteloMedio providesMarteloMedio() {
        return new MarteloMedio(providesNossaDependencia());
    }

    @Provides
    public MarteloGrande providesMarteloGrande() {
        return new MarteloGrande();
    }

    @Provides NossaDependencia providesNossaDependencia(){
        return new NossaDependencia();
    }

    @Provides Presenter providesPresenter(){
        return new Presenter();
    }



}
