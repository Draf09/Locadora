package com.grupo14.Interface.Persistencia.CarregaCarros;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.grupo14.Entidades.Dominio.Carro;
import com.grupo14.Entidades.Repositorio.CarroRepositorio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarrosH2BD_IMPL implements CarroRepositorio {
    private CarrosH2DB_ITF carrosBD;

    @Autowired
    public CarrosH2BD_IMPL(CarrosH2DB_ITF carrosBD) {
        this.carrosBD = carrosBD;
    }

    @Override
    public void carrega() {
        // Não faz mais sentido !!
    }

    @Override
    public void persiste() {
        // Não faz mais sentido
    }

   
    public void cadastra(Carro carro) {
        carrosBD.save(carro);
    }

   
    public Carro recupera(String chave) {
        //return produtosBD.findById(chave).orElse(null);
        return carrosBD.findByCodigo(chave).get(0);
    }

   
    public Collection<Carro> todos() {
        return carrosBD.findAll();
    }


    public boolean existente(String chave) {
        return carrosBD.existsById(chave);
    }

    public boolean existePlaca(String placa) {
        return carrosBD.existsById(placa);
    }

 
    public Collection<Carro> pesquisa(Predicate<Carro> pred) {
        return carrosBD.findAll()
                         .stream()
                         .filter(pred)
                         .collect(Collectors.toList());
    }

    @Override
    public void atualiza(Carro carro) {
        carrosBD.save(carro);
    }

    @Override
    public void remove(String chave) {
        carrosBD.deleteById(chave);
    }
}
