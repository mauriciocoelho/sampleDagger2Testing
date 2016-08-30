package com.example.mauricio.simpledagger2;

import dagger.Component;

/**
 * Created by mauricio on 8/30/16.
 */

@Component(modules = Martelos.class)
public interface NossaCaixaDeFerramentas {

    void inject(MainActivity mainActivity);

}
