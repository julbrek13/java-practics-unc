
public class Temperatura {
    
    private int temperaturaKelvin ;
    /**
     * TODO: Implementar el constructor
     * @param tempAbsoluta en grados Kelvin
     * @throws TemperaturaInvalidaException: cuando la temperatura Absoluta es negativa
     */
    public Temperatura (int tempAbsoluta) throws TemperaturaInvalidaException  {
        if ( tempAbsoluta < 0 ){ 
            throw new TemperaturaInvalidaException() ;
        }
        temperaturaKelvin = tempAbsoluta ; 
    }
    
    
    /**
     * TODO: Implementar 
     * @return la temperatura expresada en grados Celsius
     */
    public int getTemperaturaEnCelsius() {
        return temperaturaKelvin - 273 ; 
    }
    
    /**
     * TODO: Implementar
     * @returna temperatura expresada en grados Farenheit
     */
    public int getTemperaturaEnFarenheit() {
        return (int)(temperaturaKelvin * 1.8 - 459.0) ;
    }
    
    /**
     * TODO: Implementar
     * @return temperatura expresada en grados Kelvin
     */
    public int getTemperaturaEnKelvin() {
        return temperaturaKelvin ;
    }
    
    public boolean equals (Object o) { 
        if ( o == null || !(o instanceof Temperatura) ) return false ; 
        Temperatura t = (Temperatura) o ;
        return ( temperaturaKelvin == t.temperaturaKelvin ) ; 
    }
}
