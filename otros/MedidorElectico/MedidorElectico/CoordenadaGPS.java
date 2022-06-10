
/**
 * Representa la coordenada GPS de una ubicacion
 *
 */
public class CoordenadaGPS {
	private double latitud;
	private double longitud;
	
	/**
	 * Constructor 
	 * @param latitud La latitud de la ubicacion, entre -90 y +90
	 * @param longitud La longitud de la ubicacion, entre -180 y 180
	 * @throws IllegalArgumentException si la ubicacion esta fuera de los limites
	 */
	public CoordenadaGPS (double latitud, double longitud){
		//TODO Implementar metodo
	}

	/**
	 * 
	 * @return La latitud de la ubicacion, entre -90 y +90
	 */
	public double getLatitud() {
		return latitud;
	}
	
	/**
	 * 
	 * @return La longitud de la ubicacion, entre -180 y 180
	 */
	public double getLongitud() {
		return longitud;
	}
	
}
