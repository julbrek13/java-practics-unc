
/**
 * Write a description of class RegistroAnemometro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RegistroAnemometro extends Registro
{
    
    private String id;
	private int anio;
	private int dia;
	private int hora;
	private int minuto;
    private int velocidad;
    private Direccion direccion;
    private TipoRegistro tipo;
    

    /**
     * Constructor for objects of class RegistroAnemometro
     * Este constructor lanza un "IllegalArgumentException"
	   cuando alguno de los atributos es invalido.
	   Velocidad no puede ser negativa, Direccion no puede
	   ser null, y una direccion "NA" no puede tener una
	   velocidad distinta de 0.
     */
    public RegistroAnemometro (String id,int anio,int dia,int hora,int minuto, int velocidad, Direccion direccion)
    {
      super(id,anio,dia,hora,minuto);//La clase fecha se encarga de largar la excepcion.
      
      if(velocidad<0||direccion==null) throw new IllegalArgumentException("Argumentos invalidos");
      if(direccion.equals("NA") && velocidad!=0)throw new IllegalArgumentException("Argumentos invalidos");
      
      this.velocidad=velocidad;
      this.direccion=direccion;
      tipo=TipoRegistro.ANEMOMETRO;
    }

    	/**
	 * Setea el ID de este registro. El ID se guarda como una
	 * cadena mayuscula y sin espacios. 
	 * @param id
	 * @throws InvalidArgumentException cuando el ID es nulo o vacio. 
	 */
	public void setID(String id)
	{
	    if(id.trim().length()==0||id==null) throw new IllegalArgumentException("ID inválido");
	    
	    id=id.trim().toUpperCase();
	    this.id=id;
	}
	
	/**
	 * Devuelve el tipo de registro.
	 * @return
	 */
	public TipoRegistro getTipo()
    {
        return tipo;
    }
    
    public Direccion getDireccion()
    {
        return direccion;    
    }
	
    public int getVelocidad()
    {
        return velocidad; 
    }
}
