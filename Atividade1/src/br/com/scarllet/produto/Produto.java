package br.com.scarllet.produto;

public class Produto {
 
	//atributos 
	private String nome;
	private double preco;
	private String descricao;
	
	
	//construtor
	public Produto(String nome, double preco, String descricao) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}


	//metodo
	public void imprimirInfos() {
		System.out.println(nome);
		System.out.println(preco);
		System.out.println(descricao);
	}
	
	public void estoque() {
		System.out.print("Unidades ");
	}

	//get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
