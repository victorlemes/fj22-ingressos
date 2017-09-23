package br.com.caelum.ingresso.model.desconto;

import java.math.BigDecimal;

import br.com.caelum.ingresso.desconto.Desconto;

public class DescontoBanco implements Desconto {

	private BigDecimal percentualDeDesconto = new BigDecimal("0.3");

	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal.subtract(trintaPorCentoSobre(precoOriginal));
	}

	private BigDecimal trintaPorCentoSobre(BigDecimal precoOriginal) {
		return precoOriginal.multiply(percentualDeDesconto);
	}

}
