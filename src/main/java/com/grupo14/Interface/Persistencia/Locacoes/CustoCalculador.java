package com.grupo14.Interface.Persistencia.Locacoes;
import java.util.Date;


import com.grupo14.Entidades.Dominio.Carro;

public interface CustoCalculador {

	public abstract float calcula(Carro carro, Date inicio, Date fim);
		
}
