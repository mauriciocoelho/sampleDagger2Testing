package com.example.mauricio.simpleDagger2WithMockito;

/**
 * Created by mauricio on 8/30/16.
 */

public class MarteloMedio {

    public static final String KEY_TESTE = "TESTE";
    private Repository repository;

    public MarteloMedio(Repository repository) {
        this.repository = repository;
    }

    public String getName(){
        return "Martelo Medio";
    }

    public String getDepencencia(){
        return  repository.getData(KEY_TESTE);
    }

    public void setDependencia(String value){
        repository.setData(KEY_TESTE,value);
    }


}
