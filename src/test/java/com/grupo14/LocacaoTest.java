package com.grupo14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Date;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import com.grupo14.Entidades.Dominio.Locacao;
import com.grupo14.Entidades.Dominio.Carro;



public class LocacaoTest {
    
    @ParameterizedTest
    @CsvSource({

        


    })

    public void  testaLocacao(){

        

        Carro ct = new Carro("ABC123", "VW", "M1", false, false, false);
        Date d1= new Date();
        Date d2= new Date();
        Locacao lc= new Locacao(ct,d1,d2);

        


        Date verDev = lc.dataDevolucao();
        



        assertEquals(d2,verDev);



    }
}
