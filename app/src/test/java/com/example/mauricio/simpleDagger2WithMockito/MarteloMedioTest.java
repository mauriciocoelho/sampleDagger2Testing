package com.example.mauricio.simpleDagger2WithMockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class MarteloMedioTest {

    private MarteloMedio marteloMedio;

    @Mock
    private Repository mockRepository;


    @Before
    public void setup(){
        marteloMedio = new MarteloMedio(mockRepository);
    }

    @Test
    public void deveRetornarDependencia() throws Exception {
        String expected = "dependencia";

        when(mockRepository.getData("TESTE")).thenReturn(expected);
        String result =  marteloMedio.getData();

        assertEquals("dependencia", result);
    }

    @Test
    public void deveRetornarDependenciaDiferente() throws Exception {
        String expected = "dependenciadiferente";

        when(mockRepository.getData("TESTE")).thenReturn(expected);
        String result =  marteloMedio.getData();

        assertNotEquals("dependencia", result);
    }


}