
public class Tarjeta {
	private String numero;
	private int anoVencimiento;
	private int mesVencimiento;
	
	public Tarjeta (String numero, int anoVencimiento, int mesVencimiento){
		this.numero = numero;
		if (mesVencimiento < 1 || mesVencimiento > 12 || anoVencimiento < 2010 || anoVencimiento > 2050)
			throw new IllegalArgumentException();
		this.anoVencimiento = anoVencimiento;
		this.mesVencimiento = mesVencimiento;
	}
	
	public String getNumeroTarjeta(){
		return numero;
	}
	public int getAnoVencimiento(){
		return anoVencimiento;
	}
	public int getMesVencimiento(){
		return mesVencimiento;
	}
}
