package com.example.mauricio.simpleDagger2WithMockito;

/**
 * Created by mauricio on 8/30/16.
 */

public class NossaDependencia {

    private String nossaDependencia = "Nossa dependencia";

    public String retornaNossaDependencia(){
        return nossaDependencia;
    }

    public void setNossaDependencia(String value){
        this.nossaDependencia = value;
    }

}
