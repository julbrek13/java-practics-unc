import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Catalogo {
    
    /**
     * Nombre del alumno.
     */
    public static final String ALUMNO = "";
    
    /**
     * Cantidad total de objetos de la clase Catalogo. Se incrementa cada vez
     * que se crea un objeto de esta clase
     */
    public static int contador = 0;
    
    /**
     * Mapa que contiene Cuerpos3D con su respectivo ID
     */
    private HashMap<String, Cuerpo3D> mapaDeCuerpos;
    
    /**
     * Este String representa el identificador de este catálogo. Es de la forma
     * "id_<nro>" donde <nro> corresponde al valor del contador de Catalogos
     *  al momento de la creación de este Contador. 
     */
    private final String idDeCatalogo;
    
    
    /**
     * Implemente el constructor tal que inicialice las variables de instancia
     * y actualice las variables de clase.
     */
    public Catalogo()
    {
        //TODO Implementar el constructor
        contador++;
        mapaDeCuerpos = new HashMap<String, Cuerpo3D> ();
        idDeCatalogo = "id_" +contador;
    }
    
    
    /**
     * Agrega un Cuerpo3D al mapa de cuerpos de este catalogo.
     * El id debe guardarse en minúsculas y sin espacios (principio o fin del string). 
     * Retorna true si se agregó correctamente, false si el id es null o vacío, o si el 
     * cuerpo3D es null.
     * 
     * @param id 
     * @param cuerpo
     * @return false si id es null o vacío, o si el cuerpo3D es null
     */
    public boolean agregarCuerpo(String id, Cuerpo3D cuerpo)
    {
        //TODO Implementar método
        if (id.trim().toLowerCase() == null) return false;
        if (id.length() == 0) return false;
        if (cuerpo == null) return false;
        else 
        {
            mapaDeCuerpos.put(id, cuerpo);
           return true;
          }
          
    }
    
    
    /**
     * Elimina del catalogo el cuerpo con este id.
     * El id debe convertirse a minúsculas y sin espacios (principio o fin del string).
     * @param id
     * @return false si no existe un cuerpo con este id en el catalogo
     */
    public boolean eliminarCuerpo(String id)
    {
        //TODO Implementar metodo
        id = id.trim().toLowerCase();
        if (!mapaDeCuerpos.containsKey(id))return false;
        else
        { mapaDeCuerpos.remove(id); 
          return true; }
        
    }
    
        
    /**
     * 
     * @return el id de este catalogo
     */
    public String getId()
    {
        //TODO Implementar metodo
        return idDeCatalogo;
    }
    
    /**
     * 
     * @return la cantidad de cuerpos de este catalogo 
     */
    public int getCantidadDeCuerposTotal()
    {
        //TODO Implementar metodo
        return mapaDeCuerpos.size();
    }
    
    /**
     * Devuelve una lista de Cuerpos de este catalogo cuyo color se pasa
     * como argumento
     * @param c
     * @return lista de cuerpos de color c
     */
    public List<Cuerpo3D> listarCuerposPorColor(Color c)
    {
        List<Cuerpo3D> listarCuerposPorColor = new ArrayList <Cuerpo3D> ();
        for (Cuerpo3D c3d: mapaDeCuerpos.values())
        {
            if (c3d.getColor() == c) 
            {
                listarCuerposPorColor.add(c3d);
                
               }
           }
        return listarCuerposPorColor;
    }
    
    /**
     * Devuelve la lista de todos los colores en uso dentro del catalogo
     * @return lista de colores
     */
    public List<Color> listarColoresEnUso()
    {
       //TODO Implementar metodo
       List<Color>listarColoresEnUso = new ArrayList<Color>();
       for (Cuerpo3D c3d: mapaDeCuerpos.values())
       {
           listarColoresEnUso.add(c3d.getColor());
       }
       return listarColoresEnUso;
    }
    
    /**
     * Devuelve la cantidad de colores en uso dentro del catalogo
     * NOTA: El tipo enumerado puede cambiar
     * @return cantidad de colores en uso
     */
    public int cantidadColoresEnUso()
    {
     //TODO Implementar metodo
     int cantidad = 0;
     int rojo =0;
     int verde =0;
     int amarillo =0;
     int azul=0;
     int blanco =0;
     int negro =0;
     for (Cuerpo3D c3d: mapaDeCuerpos.values())
     {
    
         if (c3d.getColor() == Color.ROJO && (rojo==0) ) {
             rojo++;
             cantidad++;}
         if (c3d.getColor() == Color.VERDE && (verde==0) ) {
             verde++;
             cantidad++;}
         if (c3d.getColor() == Color.AMARILLO && (amarillo==0) ) {
	         amarillo++;
	         cantidad++;}
	     if (c3d.getColor() == Color.AZUL && (azul==0) ) {
	         azul++;
	         cantidad++;}
	    if (c3d.getColor() == Color.BLANCO && (blanco==0) ) {
	         blanco++;
	         cantidad++;}
	    if (c3d.getColor() == Color.NEGRO && (negro==0) ) {
	         negro++;
	         cantidad++;}
         
    }
    return cantidad;
  }
    /**
     * Devuelve un String con el siguiente formato:
     * "Catalogo <id del catalogo> con <cantidad total de cuepos 3D> cuerpos.";
     * @return String id del catalogo
     */
    public String toString()
    {
        //TODO Implementar metodo
       
        return "Catalogo"+idDeCatalogo+"con"+mapaDeCuerpos.size()+"cuerpos.";
    }
}
