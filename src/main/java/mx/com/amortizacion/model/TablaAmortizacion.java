package mx.com.amortizacion.model;

import java.util.ArrayList;
import java.util.List;

public class TablaAmortizacion {
	List<AmortizacionRow> rows;

	public TablaAmortizacion() {
		rows = new ArrayList<AmortizacionRow> ();
	}
	
	
	public List<AmortizacionRow> getRows() {
		return rows;
	}

	public void setRows(List<AmortizacionRow> rows) {
		this.rows = rows;
	}
	
	
	
}
