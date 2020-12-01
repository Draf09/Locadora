package com.grupo14.Interface.Persistencia.CarregaCarros;
import java.util.List;

import com.grupo14.Entidades.Dominio.Carro;

import org.springframework.data.repository.CrudRepository;

public interface CarrosH2DB_ITF extends CrudRepository<Carro,String> {
    List<Carro> findByCodigo(String codProd);
    List<Carro> findAll();
}



