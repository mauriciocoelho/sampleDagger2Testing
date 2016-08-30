package com.example.mauricio.simpledagger2;


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

    @Provides MainHandlers provideMainHandlers(){
        return new MainHandlers(providesMarteloMedio());
    }

    @Provides Echo provideEcho(){
        return new Echo();
    }

    @Provides NossaDependencia providesNossaDependencia(){
        return new NossaDependencia();
    }

}
