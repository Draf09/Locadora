package com.grupo14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import com.grupo14.Entidades.Dominio.Seguros.SeguroPerigoso;


public class SeguroPerigosoTeste {
    
    @ParameterizedTest
    @CsvSource({

 
        

    

    })

    public void  testaSegPer(){

        

        SeguroPerigoso sp= new SeguroPerigoso();
        


        

        assertEquals(200.0,sp.calcular());


    }
}
