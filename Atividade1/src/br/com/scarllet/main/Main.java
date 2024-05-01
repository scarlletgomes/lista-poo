package br.com.scarllet.main;

import br.com.scarllet.eletronico.Eletronico;
import br.com.scarllet.livro.Livro;

public class Main {

	public static void main(String[] args) {
	
		Livro objLivro = new Livro("Biblia", 100.00,"Livro cristao", "Deus", 4000);
		objLivro.setAutor("Jesus");
		objLivro.imprimirInfos();
		objLivro.imprimirlivro();
		objLivro.estoque();
		
		Eletronico objEletronico = new Eletronico("Smartfone", 1000.00, "telefone", "Samsung", 200);
		objEletronico.imprimirInfos();
		objEletronico.estoque();
		
	}

}
