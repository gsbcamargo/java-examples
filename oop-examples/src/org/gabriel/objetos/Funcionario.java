package org.gabriel.objetos;

import java.math.BigDecimal;

import org.gabriel.interfaces.Bonus;

// classe simulando um funcionário de um comércio qualquer
public class Funcionario implements Bonus {

	private Long id; // modificador de acesso private, para que apenas a própria classe tenha acesso
					 // direto ao atributo
	
	private String nome;

	/*
	 * BigDecimal é uma classe utilizada para trabalhar com números grandes de
	 * precisão variável, porém sem apresentar as inconsistências da classe Float
	 * (para mais detalhes, pesquisar sobre ponto flutuante)
	 * 
	 */

	private BigDecimal salario;
	private BigDecimal bonus;

	@Override // sobrescrita do método exigido pelo contrato (interface), que
			  // estabelece que o funcionário possui um bônus
	public BigDecimal calculaBonus() {

		BigDecimal bonus = salario.multiply(new BigDecimal("0.1")).add(salario); // como bigDecimal é um objeto, necessita
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
