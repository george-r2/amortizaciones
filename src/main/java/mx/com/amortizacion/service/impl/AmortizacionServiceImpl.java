package mx.com.amortizacion.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import mx.com.amortizacion.model.AmortizacionRow;
import mx.com.amortizacion.model.TablaAmortizacion;
import mx.com.amortizacion.service.AmortizacionService;
import mx.com.amortizacion.util.Utils;

@Service
public class AmortizacionServiceImpl implements AmortizacionService {

	Logger logger = LogManager.getLogger(AmortizacionServiceImpl.class);
	
	@Override
	public TablaAmortizacion getAmortizacion(Double monto, Integer numPagos, Double interes) {
		TablaAmortizacion tabla = new TablaAmortizacion();
		Double pagoMensual =Utils.calculatePMT(interes,numPagos, monto);
		logger.info("pago mensual:"+pagoMensual);
		//el primer row
		AmortizacionRow row = new AmortizacionRow();
		row.setNumPago(0);
		row.setSaldoTotal(monto);
		tabla.getRows().add(row);
		
		//inicializar
		for(int i=1;i<=numPagos;i++) {
			row = new AmortizacionRow();
			row.setNumPago(i);
			row.setSaldoInicial(tabla.getRows().get(i-1).getSaldoTotal());
			row.setCuota(pagoMensual);
			row.setInteresPrestamo((interes/12)*row.getSaldoInicial());
			row.setAmortizacion(row.getCuota()-row.getInteresPrestamo());
			row.setSaldoTotal(row.getSaldoInicial()-row.getAmortizacion());
			if(row.getSaldoTotal()<0) {
				row.setCuota(row.getSaldoInicial());
				row.setSaldoTotal(0.0);
			}
			tabla.getRows().add(row);
		}
		
		return tabla;
	}

}
