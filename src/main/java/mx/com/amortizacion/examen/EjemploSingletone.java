package mx.com.amortizacion.examen;

public class EjemploSingletone {

	private String nombre="singletone";
	private static EjemploSingletone ejemploSingletone;
	
	private  EjemploSingletone() {
	}
	
	public static EjemploSingletone getInstance() {
		if(ejemploSingletone==null) {
			ejemploSingletone=new EjemploSingletone();
		}
		return ejemploSingletone;
	}
}
