package org.gabriel.objetos;

import java.math.BigDecimal;

import org.gabriel.interfaces.Bonus;

// classe simulando um funcion�rio de um com�rcio qualquer
public class Funcionario implements Bonus {

	private Long id; // modificador de acesso private, para que apenas a pr�pria classe tenha acesso
					 // direto ao atributo
	
	private String nome;

	/*
	 * BigDecimal � uma classe utilizada para trabalhar com n�meros grandes de
	 * precis�o vari�vel, por�m sem apresentar as inconsist�ncias da classe Float
	 * (para mais detalhes, pesquisar sobre ponto flutuante)
	 * 
	 */

	private BigDecimal salario;
	private BigDecimal bonus;

	@Override // sobrescrita do m�todo exigido pelo contrato (interface), que
			  // estabelece que o funcion�rio possui um b�nus
	public BigDecimal calculaBonus() {

		BigDecimal bonus = salario.multiply(new BigDecimal("0.1")).add(salario); // como bigDecimal � um objeto, necessita
																				 // ser instanciado
		return bonus;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public BigDecimal getBonus() {
		return bonus;
	}

	public void setBonus(BigDecimal bonus) {
		this.bonus = bonus;
	}

}
