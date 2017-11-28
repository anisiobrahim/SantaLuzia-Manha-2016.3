package aplicativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import entidade.Compra;
import entidade.Empregada;
import entidade.Produto;

public class Aplicativo {
	public static void main(String[] args) {

		//gerador de números aleatórios
		Random gerador = new Random();
		//array de objetos
		List<Compra> compras = new ArrayList<Compra>();
		
		//Instacia o objeto de compra na primeira posição do array
		compras.add(new Compra());
		compras.get(0).setId(new Long(gerador.nextInt(100)*100));
		
		//Definindo a empregada
		compras.get(0).setEmpregada(new Empregada());
		compras.get(0).getEmpregada().setId(new Long(gerador.nextInt(100)*100));
		compras.get(0).getEmpregada().setNome("Lucicleia");
		
		
		//Definindo a lista de produtos
		compras.get(0).setListaDeProdutos(new ArrayList<Produto>());
		
		//produto 01
		compras.get(0).getListaDeProdutos().add(new Produto());
		compras.get(0).getListaDeProdutos().get(0).setId(new Long (gerador.nextInt(100)*100));
		compras.get(0).getListaDeProdutos().get(0).setNmProduto("Arroz");
		compras.get(0).getListaDeProdutos().get(0).setPreco(3.0);
		compras.get(0).getListaDeProdutos().get(0).setQuantidade(50.1);
		
		//produto 02
		compras.get(0).getListaDeProdutos().add(new Produto());
		compras.get(0).getListaDeProdutos().get(1).setId(new Long (gerador.nextInt(100)*100));
		compras.get(0).getListaDeProdutos().get(1).setNmProduto("Feijao");
		compras.get(0).getListaDeProdutos().get(1).setPreco(3.8);
		compras.get(0).getListaDeProdutos().get(1).setQuantidade(3.2);
		
		//produto 03
		compras.get(0).getListaDeProdutos().add(new Produto());
		compras.get(0).getListaDeProdutos().get(2).setId(new Long (gerador.nextInt(100)*100));
		compras.get(0).getListaDeProdutos().get(2).setNmProduto("Farinha");
		compras.get(0).getListaDeProdutos().get(2).setPreco(10.25);
		compras.get(0).getListaDeProdutos().get(2).setQuantidade(50.1);
	
	/* Impressãp */
	for(Compra compra : compras) {
		System.out.println(compra);
		
		}
	
	/* Destruindo o objeto */
	DestruidorDeObjetos.setNull(compras);
	
	}
}
	
