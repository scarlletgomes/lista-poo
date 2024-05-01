package br.com.scarllet.livro;

import br.com.scarllet.produto.Produto;

public class Livro extends Produto {
	
	//atributos
	private String autor;
	private int numeroPaginas;
	
	//construtor
	public Livro(String nome, double preco, String descricao, String autor, int numeroPaginas) {
		super(nome, preco, descricao);
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	
	//metodo
	public void imprimirlivro() {
		System.out.println(autor);
		System.out.println(numeroPaginas);

	}
	

	@Override
	public void estoque() {
		super.estoque();
		System.out.println(12);
	}

	//get e set
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	
	

}
