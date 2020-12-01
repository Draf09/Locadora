package com.grupo14.Entidades.Servicos;

import java.util.Collection;
import java.util.List;

import com.grupo14.Interface.Persistencia.CarregaCarros.CarrosH2BD_IMPL;
import com.grupo14.Entidades.Dominio.Locacao;
import com.grupo14.Entidades.Dominio.Seguros.SegurosInterface;
import com.grupo14.Entidades.Dominio.Carro;
import java.util.stream.Collectors;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoDeLocacao {
    private SegurosInterface regraImposto;
    private Locacao locacao;
    private CarrosH2BD_IMPL garagem;
    //private FactoryValidacao factoryValidacao;

    @Autowired
    public ServicoDeLocacao(CarrosH2BD_IMPL garagem, SegurosInterface regraImposto) {
        this.garagem = garagem;
        this.regraImposto = regraImposto;
    }

    public boolean valida(String plCarro) {
        return garagem.existePlaca(plCarro);
    }

    public Collection<Carro> todos() {
        return garagem.todos();
    }

    public void addCarro(Carro carro){
        garagem.cadastra(carro);
    }
    public void removeCarro(String plCarro){
        garagem.remove(plCarro);
    }
    
    // public Integer calculaSubtotal(List<ItemVenda> itens) {
    //     return (int) (itens.stream().mapToDouble(it -> it.getValorVendido()).sum());
    // }

    // public Integer calculaImpostos(List<ItemVenda> itens) {
    //     return (int) regraImposto.calcular(itens);
    // }

    // public Integer calculaPrecoFinal(List<ItemVenda> itens) {
    //     return calculaSubtotal(itens) + calculaImpostos(itens);
    // }

    // public Integer[] todosValores(List<ItemVenda> itens) {
    //     Integer[] valores = new Integer[3];
    //     valores[0] = calculaSubtotal(itens);
    //     valores[1] = calculaImpostos(itens);
    //     valores[2] = calculaPrecoFinal(itens);
    //     return valores;
}


// package com.grupo14.Entidades.Dominio;


// public class CatalogoController {

// 	public ArrayList<Carro> carrosDisponiveis(int FiltroDTO filtro) {
// 		return null;
// 	}

// 	public ArrayList<Marca> listaMarcas() {
// 		return null;
// 	}

// 	public ArrayList<Modelos> listaModelos(int Marca marca) {
// 		return null;
// 	}

// }
