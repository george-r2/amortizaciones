package mx.com.amortizacion.model;

import java.math.BigDecimal;

public class AmortizacionRequest {

	private int numPagos;
	private Double monto;
	
	public int getNumPagos() {
		return numPagos;
	}
	public void setNumPagos(int numPagos) {
		this.numPagos = numPagos;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
	
}
