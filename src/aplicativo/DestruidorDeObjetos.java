package aplicativo;

import java.util.List;

import entidade.Compra;
import entidade.Produto;

public class DestruidorDeObjetos {

	// retirar a referencia do objeto
	public static void setNull(List<Compra> compras) {
		for (Compra compra : compras) {
			for (Produto produto : compra.getListaDeProdutos()) {
				produto.setId(null);
				produto.setNmProduto(null);
				produto.setPreco(null);
				produto.setQuantidade(null);

			}

			compra.setId(null);
			compra.setEmpregada(null);
			compra.setListaDeProdutos(null);
			compra = null;

		}

		// chama lixeira
		if (lixeiro())
			System.err.println("Objeto destruido");

	}

	private static boolean lixeiro() {
		System.gc();
		return Boolean.TRUE;
		
	
	}

}

