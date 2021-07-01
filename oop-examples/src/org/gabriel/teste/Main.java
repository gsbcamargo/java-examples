package org.gabriel.teste;

import java.math.BigDecimal;

import org.gabriel.objetos.Funcionario;
import org.gabriel.objetos.Gerente;

public class Main {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setSalario(new BigDecimal(1000));
		funcionario.setBonus(funcionario.calculaBonus());
		
		System.out.println("======== FUNCIONÁRIO ========");
		System.out.println(funcionario.getBonus());
		
		Gerente gerente = new Gerente();
		
		gerente.setSalario(new BigDecimal("10000"));
		gerente.setBonus(gerente.calculaBonus());
		
		System.out.println("========== GERENTE ==========");
		System.out.println(gerente.getBonus());
		
	}

}
