package mx.com.amortizacion.service;

import java.math.BigDecimal;

import mx.com.amortizacion.model.TablaAmortizacion;

public interface AmortizacionService {

	TablaAmortizacion getAmortizacion(Double monto,Integer numPagos,Double interes);
}
