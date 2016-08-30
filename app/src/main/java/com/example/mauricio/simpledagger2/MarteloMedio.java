package com.example.mauricio.simpledagger2;

/**
 * Created by mauricio on 8/30/16.
 */

public class MarteloMedio {

    NossaDependencia nossaDependencia;

    public MarteloMedio(NossaDependencia nossaDependencia) {
        this.nossaDependencia = nossaDependencia;
    }

    public String getName(){
        return "Martelo Medio";
    }

    public String getDepencencia(){
        return  nossaDependencia.retornaNossaDependencia();
    }

}
