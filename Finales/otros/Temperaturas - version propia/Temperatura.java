
public class Temperatura {
	
	/**
	 * TODO: Implementar el constructor
	 * @param tempAbsoluta
	 * @throws TemperaturaInvalidaException: cuando la temperatura Absoluta es negativa
	 */
	private int tempAbsoluta;
	
	public Temperatura (int temp) throws TemperaturaInvalidaException{
	    if (temp < 0) throw new TemperaturaInvalidaException();
	    else
	    { tempAbsoluta = temp; }
	}
	
	
	/**
	 * TODO: Implementar 
	 * @return la temperatura expresada en grados Celsius
	 */
	public int getTemperaturaEnCelsius() {
	    int tempCelsius = (tempAbsoluta - 273);
	    return tempCelsius;
	}
	
	/**
	 * TODO: Implementar
	 * @returna temperatura expresada en grados Farenheit
	 */
	public int getTemperaturaEnFarenheit() {
	    int tempCelsius = (tempAbsoluta - 273);
	    int Farenheit = (tempCelsius*2 + 32);
	    return Farenheit;
	}
	
	/**
	 * TODO: Implementar
	 * @return temperatura expresada en grados Kelvin
	 */
	public int getTemperaturaEnKelvin() {
	    return tempAbsoluta;
	}
}
