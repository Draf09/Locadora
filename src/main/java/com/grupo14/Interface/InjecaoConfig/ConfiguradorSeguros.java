package com.grupo14.Interface.InjecaoConfig;

import com.grupo14.Entidades.Dominio.Seguros.SegurosInterface;
import com.grupo14.Entidades.Dominio.Seguros.SeguroOriginal;
import com.grupo14.Entidades.Dominio.Seguros.SeguroPerigoso;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguradorSeguros{
    @Bean
    @ConditionalOnProperty(name = "regra.seguro", havingValue = "original", matchIfMissing = true)
    public SegurosInterface opcaoRegraClassica() {
        return (SegurosInterface) new SeguroOriginal();
    }
 
    @Bean
    @ConditionalOnProperty(name = "regra.seguro", havingValue = "perigoso")
    public SegurosInterface opcaoRegraComprasGrandes() {
        return (SegurosInterface) new SeguroPerigoso();
    }
}


