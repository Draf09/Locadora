// package com.grupo14.CasosDeUso;

// import java.util.Collection;
// import java.util.List;
// import Repositorios.Seguros;

// import com.grupo14.Entidades.Dominio.Seguros.SegurosInterface;
// import com.grupo14.Entidades.Repositorio.LocacaoRepositorio;

// import Entidades.Repositorios.LocacaoRepositorio;
// import Entidades.Servicos.ServicosDeVenda;
// import Interface.DTO.DevolucaoSubtotalDTO;
// import Interface.DTO.DevolucaoConfirmacaoDTO;


// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;


// public class LocacaoController{

// 	@Component
// 	public class ControleDeVendas {
//   	private Produtos produtos;
//   	private ServicoDeEstoque servicoEstoque;
//   	private ServicoDeVendas servicoVendas;
//   	private Vendas vendas;



// 	public LocacaoConfirmacaoDTO registrarLocacao(int LocacaoDTO locacao) {
// 		return null;
// 	}

// 	public DevolucaoSubtotalDTO devolucaoSubtotal(int DevolucaoDTO dev) {
// 		return null;
// 	}

// 	public DevolucaoConfirmacaoDTO registratDevolucao(int DevolucaoDTO dev) {
// 		return null;
// 	}

// }






 

//   public Collection<Produto> listaProdutos() {
//     return produtos.todos();
//   }

//   public boolean podeVender(final Integer codProd,
//                             final Integer qtdade) {
//     ItemEstoque itemEstoque = servicoEstoque.recupera((long)codProd);
//     if (itemEstoque == null){
//       return false;
//     }else{
//       return itemEstoque.disponivel(qtdade);
//     }
//   }

//   public boolean confirmaVenda(final List<ItemVenda> itensVenda) {
//     // Verifica se todos os itens são válidos
//     servicoVendas.valida(itensVenda);
//     // Cria a venda
//     Venda venda = new Venda();
//     venda.addItens(itensVenda);
//     // Dá baixa no estoque
//     servicoEstoque.saida(itensVenda);    
//     // Fecha a venda e armazena
//     venda.fechaVenda(servicoVendas.calculaSubtotal(itensVenda),
//                      servicoVendas.calculaImpostos(itensVenda),
//                      servicoVendas.calculaPrecoFinal(itensVenda));
//     vendas.cadastra(venda);
//     return true;
//   }

//   public Collection<Venda> vendasEfetuadas() {
//     return vendas.todos();
//   }

//   public Integer[] calculaSubtotal(final List<ItemVenda> itensVenda) {
//     // Verifica se todos os itens são válidos
//     servicoVendas.valida(itensVenda);
//     // Calcula os valores e retorna
//     return servicoVendas.todosValores(itensVenda);
//   }
// }