package mx.com.amortizacion.model;


public class AmortizacionRow {
	private int numPago;
	private Double saldoInicial;
	private Double cuota;
	private Double interesPrestamo;
	private Double amortizacion;
	private Double saldoTotal;
	public Double getSaldoInicial() {
		return saldoInicial;
	}
	public void setSaldoInicial(Double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
	public int getNumPago() {
		return numPago;
	}
	public void setNumPago(int numPago) {
		this.numPago = numPago;
	}
	public Double getCuota() {
		return cuota;
	}
	public void setCuota(Double cuota) {
		this.cuota = cuota;
	}
	public Double getInteresPrestamo() {
		return interesPrestamo;
	}
	public void setInteresPrestamo(Double interesPrestamo) {
		this.interesPrestamo = interesPrestamo;
	}
	public Double getAmortizacion() {
		return amortizacion;
	}
	public void setAmortizacion(Double amortizacion) {
		this.amortizacion = amortizacion;
	}
	public Double getSaldoTotal() {
		return saldoTotal;
	}
	public void setSaldoTotal(Double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
	
	
	
	
}
