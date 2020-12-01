package com.grupo14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import com.grupo14.Entidades.Dominio.Seguros.SeguroOriginal;


public class SeguroOriginalTeste {
    
    @ParameterizedTest
    @CsvSource({

 
        

    

    })

    public void  testaSegOri(){

        

        SeguroOriginal so= new SeguroOriginal();
        


        

        assertEquals(100.0,so.calcular());


    }
}
