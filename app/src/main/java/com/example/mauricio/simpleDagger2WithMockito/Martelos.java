package com.example.mauricio.simpleDagger2WithMockito;


import dagger.Module;
import dagger.Provides;

@Module
public class Martelos {


    @Provides
    public MarteloPequeno providesMarteloPequeno() {
        return new MarteloPequeno();
    }

    @Provides
    public MarteloGrande providesMarteloGrande() {
        return new MarteloGrande();
    }

    @Provides Repository providesRepository(){
        return new RepositoryImpl();
    }

    @Provides
    public MarteloMedio providesMarteloMedio(Repository repository) {
        return new MarteloMedio(repository);
    }

    @Provides Presenter providesPresenter(MarteloMedio marteloMedio){
        return new Presenter(marteloMedio);
    }

}
