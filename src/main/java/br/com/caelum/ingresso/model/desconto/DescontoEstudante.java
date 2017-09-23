package br.com.caelum.ingresso.model.desconto;

import java.math.BigDecimal;

import br.com.caelum.ingresso.desconto.Desconto;

public class DescontoEstudante implements Desconto {

	private	BigDecimal metade = new	BigDecimal("2.0");
	
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal.divide(metade);
	}

}
