
public class Fecha {
	private int anio;
	private int dia;
	private int hora;
	private int minuto;
	
	public Fecha (int anio, int dia, int hora, int min){
		if ( anio<1900 ||
			 dia < 1 || dia > 365 || 
			 hora < 0 || hora > 23 || 
			 min < 0 || min > 59)      
			throw new IllegalArgumentException ("Fecha invalida");
		this.anio=anio;
		this.dia=dia;
		this.hora=hora;
		this.minuto=min;
	}
	
	public boolean equals (Object o){
		if (o==null || !(o instanceof Fecha)) 
			return false;
		Fecha f = (Fecha)o;
		return (anio == f.getAnio() && 
			dia == f.getDia() &&
			hora == f.getHora() &&
			minuto == f.getMinuto());		
	}
	
	public boolean esAnteriorA (Fecha f){
		if (f==null) 
			throw new IllegalArgumentException ("Fecha invalida");

		long fecha1 = ((anio-1900)*525600)+dia*1440+hora*60+ minuto;
		long fecha2 = ((f.getAnio()-1900)*525600)+f.getDia()*1440+f.getHora()*60+ f.getMinuto();
		return (fecha1<fecha2);
	}
	
	public int getAnio() {
		return anio;
	}

	public int getDia() {
		return dia;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}
	
}
