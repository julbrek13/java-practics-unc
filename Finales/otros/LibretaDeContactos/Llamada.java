
public class Llamada {
    private boolean saliente;
    private int duracionEnSegundos;
    private String numero ;
    private Fecha fecha;
    
    public Llamada (String numero, Fecha fecha, int duracion, boolean saliente){
        if (numero == null ||  numero.trim().length() != 10)
            throw new IllegalArgumentException();
        
        if (duracion < 0)
            throw new IllegalArgumentException();
            
        this.numero = numero.trim();
        this.fecha = fecha;
        this.duracionEnSegundos = duracion;
        this.saliente = saliente;
    }

    public boolean isSaliente() {
        return saliente;
    }

    public int getDuracionEnSegundos() {
        return duracionEnSegundos;
    }

    public String getNumero() {
        return numero;
    }

    public Fecha getFecha() {
        return fecha;
    }
    
    
    /**
     * Retorna la duraci�n en un string con formato <mm:ss>
     * Ejemp    los: "03:15", "12:03", "110:45"
     * 
     * @return El String con el formato indicado
     */
    public String getDuracion() {
    }
    
    /**
     * Retorna un String con el siguiente formato:
     * 
     * <aaaa/mm/dd> <hh:mm> <(saliente)|(entrante)> <numero> <duracion>
     * 
     * Ej. "2013/05/06 21:44 3514801234 (entrante) 05:12"
     * "2013/01/30 01:14 1161293091 (saliente) 12:00"
     * 
     * @return El String con el formato indicado
     */
        
    public String toString(){
    }
}
