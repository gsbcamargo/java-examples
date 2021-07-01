package org.gabriel.objetos;

import java.math.BigDecimal;

import org.gabriel.interfaces.Bonus;

public class Gerente extends Funcionario implements Bonus {
	
	@Override
	public BigDecimal calculaBonus() {
		
		BigDecimal bonus = getSalario().multiply(new BigDecimal("0.3")).add(getSalario()); // 

		return bonus;
		
	}

}
