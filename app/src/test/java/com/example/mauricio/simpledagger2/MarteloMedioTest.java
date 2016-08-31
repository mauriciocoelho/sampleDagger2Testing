package com.example.mauricio.simpledagger2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.mockito.internal.matchers.Equals;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class MarteloMedioTest {

    private MarteloMedio marteloMedio;

    @Mock
    private NossaDependencia mockNossaDependencia;


    @Before
    public void setup(){
        marteloMedio = new MarteloMedio(mockNossaDependencia);
    }

    @Test
    public void deveRetornarDependencia() throws Exception {
        String expected = "dependencia";

        when(mockNossaDependencia.retornaNossaDependencia()).thenReturn(expected);
        String result =  marteloMedio.getDepencencia();

        assertEquals("dependencia", result);
    }


}