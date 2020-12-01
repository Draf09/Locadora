package com.grupo14.Interface;

import java.util.Collection;
import java.util.List;

import com.grupo14.Entidades.Dominio.Carro;
import com.grupo14.Entidades.Dominio.Locacao;
import com.grupo14.Entidades.Servicos.ServicoDeLocacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/locacoes")
public class SvFachadaRemota {
  private ServicoDeLocacao ctrlVendas;


  @Autowired
  public SvFachadaRemota(ServicoDeLocacao ctrlVendas) {
    this.ctrlVendas = ctrlVendas;
  }

  @GetMapping("/carros")
  @CrossOrigin(origins = "*")
  public Collection<Carro> listaProdutos() {
    return ctrlVendas.todos();
  }
  

  @GetMapping("/autorizacao")
  @CrossOrigin(origins = "*")
  public boolean podeAlugar(@RequestParam final String plCarro) {
      return ctrlVendas.valida(plCarro);
  }

//   @PostMapping("/confirmacao")
//   @CrossOrigin(origins = "*")
//   public boolean confirmaVenda(@RequestBody final ItemCarrinhoDTO[] itens) {
//     List<ItemVenda> itensVenda = mapeadorIC.ItemCarrinhoToItemvenda(itens);
//     return ctrlVendas.confirmaVenda(itensVenda);
//   }

//   @GetMapping("/historico")
//   @CrossOrigin(origins = "*")
//   public Collection<Locacao> locacoesEfetuadas() {
//     return ctrlVendas.   locacoesEfetuadas();
//   }

//   @PostMapping("/subtotal")
//   @CrossOrigin(origins = "*")
//   public Integer[] calculaSubtotal(@RequestBody final ItemCarrinhoDTO[] itens) {
//     List<ItemVenda> itensVenda = mapeadorIC.ItemCarrinhoToItemvenda(itens);
//     return ctrlVendas.calculaSubtotal(itensVenda);
//   }

  @PostMapping("/adicionar")
  @CrossOrigin(origins = "*")
  public void adicionaCarro(@RequestParam final Carro carro) {
    ctrlVendas.addCarro(carro);
  }

  @PostMapping("/remover")
  @CrossOrigin(origins = "*")
  public void removeCarro(@RequestParam final String plCarro) {
    ctrlVendas.removeCarro(plCarro); 
  }
}