package mx.com.amortizacion.rest;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.amortizacion.model.AmortizacionRequest;
import mx.com.amortizacion.model.TablaAmortizacion;
import mx.com.amortizacion.service.AmortizacionService;



@RestController
public class AmortizacionRest {

	Logger logger = LogManager.getLogger(AmortizacionRest.class);
	
	@Autowired
	private AmortizacionService amortizacionService;
	
	@Value("${amortizacion.general.interes}")
	private Double interes;
	

	@GetMapping("/tabla")
	public String greeting( Model model) {
		return "tabla";
	}
	
	
	@PostMapping("/obtenerAmortizacion")
	public TablaAmortizacion obtenerAmortizacion(@RequestParam("monto") double monto,@RequestParam("numPagos") int numPagos ) {
		logger.info("servicio obtenerAmortizacion");
		
		TablaAmortizacion tabla = amortizacionService.getAmortizacion(monto,numPagos, interes);
		return tabla;
	}
	
	
	
}
