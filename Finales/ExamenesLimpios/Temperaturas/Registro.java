
public abstract class Registro {
	
	private Fecha fecha;
	private String id;
	private static int serialNumber = 0;
	
	
	public Registro (int anio, int dia, int hora, int minuto){
		fecha = new Fecha (anio,dia,hora,minuto);
		id = ("Reg_"+serialNumber);
		serialNumber++;
	}
	
	public Fecha getFecha (){
		return fecha;
	}
	
	public String getID(){
		return id;
	}

	public abstract TipoRegistro getTipo();
}
