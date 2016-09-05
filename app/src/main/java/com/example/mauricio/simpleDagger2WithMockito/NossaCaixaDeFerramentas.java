package com.example.mauricio.simpleDagger2WithMockito;

import dagger.Component;

/**
 * Created by mauricio on 8/30/16.
 */

@Component(modules = Martelos.class)
public interface NossaCaixaDeFerramentas {

    void inject(MainActivity mainActivity);

    void inject(MainService mainService);

}
