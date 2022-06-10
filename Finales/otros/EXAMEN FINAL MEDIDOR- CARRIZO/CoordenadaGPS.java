
/**
 * Representa la coordenada GPS de una ubicaci�n
 *
 */
public class CoordenadaGPS {
	private double latitud;
	private double longitud;
	
	/**
	 * Constructor 
	 * @param latitud La latitud de la ubicaci�n, entre -90 y +90
	 * @param longitud La longitud de la ubicaci�n, entre -180 y 180
	 * @throws IllegalArgumentException si la ubicaci�n est� fuera de los l�mites
	 */
	public CoordenadaGPS (double latitud, double longitud){
		if(latitud>= -90 && latitud <= 90)
		{
		    this.latitud= latitud;
		  }
		  else{
		      throw new IllegalArgumentException(" ubicacion fuera de limites");
		  }
		if(longitud >= -180 && longitud <= 180)
		{
		    this.longitud= longitud;
		  }
		  else{
		      throw new IllegalArgumentException(" ubicacion fuera de limites");
		  }
	}

	/**
	 * 
	 * @return La latitud de la ubicaci�n, entre -90 y +90
	 */
	public double getLatitud() {
		return latitud;
	}
	
	/**
	 * 
	 * @return La longitud de la ubicaci�n, entre -180 y 180
	 */
	public double getLongitud() {
		return longitud;
	}
	
}
