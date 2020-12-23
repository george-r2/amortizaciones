package mx.com.amortizacion.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utils {

//	 public static BigDecimal calculatePMT(BigDecimal rate, BigDecimal nper, BigDecimal pv) {
//		 BigDecimal v = (BigDecimal.ONE.add(rate.divide(new BigDecimal(12),4,RoundingMode.HALF_UP)));
//		 BigDecimal t = ((nper.divide( new BigDecimal(12),4,RoundingMode.HALF_UP)).negate().multiply(new BigDecimal(12)));
//		 BigDecimal divisor = BigDecimal.ONE.subtract(v.pow(nper.intValue()));
//		 BigDecimal result =  pv.multiply(rate.divide(new BigDecimal(12),4,RoundingMode.HALF_UP));
//		 result=result.divide(divisor,4,RoundingMode.HALF_UP);
//		 //BigDecimal result = (pv * (rate / 12)) / (1 - Math.pow(v, t));
//		 return result;
//	 }
	
	 public static double calculatePMT(double rate, double nper, double pv) {
	        double v = (1 + (rate / 12));
	        double t = (-(nper / 12) * 12);
	        double result = (pv * (rate / 12)) / (1 - Math.pow(v, t));
	        return result;
	    }
	
	
	public static BigDecimal calcularPagoMensual(int numPagos,BigDecimal interesAnual,BigDecimal monto) {
		//PMT=(Pv*Rate*(1+Rate)Nper)/[(1+Rate)Nper−1]
		BigDecimal rate = interesAnual.divide(new BigDecimal(12), 3, RoundingMode.HALF_UP);
		BigDecimal nPer=new BigDecimal(numPagos);
		BigDecimal pagoMensual ;
		BigDecimal rateMasUno=rate.add(BigDecimal.ONE);
		pagoMensual = monto.multiply(rate).multiply(rateMasUno);
		pagoMensual=pagoMensual.multiply(nPer);
		
		BigDecimal divisor=rateMasUno;
		divisor=divisor.multiply(nPer);
		divisor=divisor.subtract(BigDecimal.ONE);
		divisor.add(BigDecimal.ONE);
		pagoMensual=pagoMensual.divide(divisor, 3, RoundingMode.HALF_UP);
		
		return pagoMensual;
	}
}
