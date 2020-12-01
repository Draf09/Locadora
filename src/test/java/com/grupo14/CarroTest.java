package com.grupo14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import com.grupo14.Entidades.Dominio.Carro;


public class CarroTest {
    
    @ParameterizedTest
    @CsvSource({

        "ABC123, VW, M1, false, false, false",

        

        

    

    })

    public void  testaCarro(String placa, String marca, String modelo, boolean arcondicionado, boolean direcao, boolean cambioautomatico){

        

        Carro ct = new Carro(placa,marca,modelo,arcondicionado,direcao,cambioautomatico);

        


        String verPlaca = ct.getPlaca();
        String verMarca = ct.getMarca();
        String verModelo = ct.getModelo();
        boolean verAr = ct.isArcondicionado();
        boolean verDir = ct.isDirecao();
        boolean verCamb = ct.isCambioautomatico();



        assertEquals("ABC123",verPlaca);

        assertEquals("VW",verMarca);

        assertEquals("M1",verModelo);

        assertEquals(false,verDir);

        assertEquals(false,verAr);

        assertEquals(false,verCamb);


    }
}
