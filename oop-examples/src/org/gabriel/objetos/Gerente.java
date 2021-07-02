package org.gabriel.objetos;

import java.math.BigDecimal;

public class Gerente extends Funcionario {
	
	@Override
	public BigDecimal calculaBonus() {
		
		BigDecimal bonus = getSalario().multiply(new BigDecimal("0.3")).add(getSalario()); // 

		return bonus;
		
	}

}
