package br.com.scarllet.eletronico;

import br.com.scarllet.produto.Produto;

public class Eletronico extends Produto {
	
	//atributos
	private String marca;
	private int voltagem;
	
	//construtor
	public Eletronico(String nome, double preco, String descricao, String marca, int voltagem) {
		super(nome, preco, descricao);
		this.marca = marca;
		this.voltagem = voltagem;
	}
	
	//metodo
	public void imprimirEletronico() {
		System.out.print(marca);
		System.out.print(voltagem);

	}
	
	//subescrita 

		@Override
	public void estoque() {
		super.estoque();
		System.out.print(13);
	}
		
	//get e set
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

}
