import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


public class Mapa
{
    // instance variables - replace the example below with your own
    private Map<String, PuntoInteres> puntos;
    private int maxX;
    private int maxY;
    private Coordenada posActual;
    private Decodificador deco;
    
    /**
     * Inicializa el mapa. 
     * Establece los limites del mapa. los valores maximos de x e y deben ser mayores o iguales a 1.
     * Establece la posicion actual en la coordenada 0,0
     * Establece el docodificador por defecto.
     * 
     */
    public Mapa (int maxX, int maxY){
        //TODO: Implementarç
        if ( ( maxX < 1) || (maxY < 1) ){throw new IllegalArgumentException ();}
        this.maxX = maxX;
        this.maxY = maxY;
        puntos = new HashMap <String, PuntoInteres> ();
        
        posActual = new Coordenada(0,0);
        deco = new GeneradorDirecciones ();
        
    }
    
    /**
     * Agrega un punto de Interes al Mapa.
     * 
     * @param p El punto de interes
     * @return 'false' cuando el punto es null, su Id es null o está fuera de los limites del mapa, 
     * y 'true' si se pudo agregar el punto al mapa.
     */
    public boolean agregarPunto(PuntoInteres p){
        //TODO: Implementar
          if (p == null) { return false; }
          else if (p.getId() == null) { return false; }
          else if ( (p.getCoordenada().getPosicionX() > maxX) || ( p.getCoordenada().getPosicionY() > maxY) )
             { return false;}
            
          
            else { puntos.put(p.getId(), p); }
            return true;
    }
    
    /** 
     * Devuelve el cuadrado de la distancia de la posición actual en el mapa al punto pasado como argumento.
     * Lanza una PuntoDesconocidoException cuando el punto no está en el mapa o su id es nulo
     * 
     * @param idPunto El ID del punto contra el cual se quiere calcular la distancia cuadrada
     * @return el cuadrado de la distancia del punto actual al punto de interes
     * @throws PuntoDesconocidoException 
     */
    
    public int getDistanciaCuadratica (String idPunto) throws PuntoDesconocidoException {
         //TODO: Implementar
           idPunto = idPunto.trim().toLowerCase();
         if (idPunto == null ) throw new PuntoDesconocidoException ();
         if (!puntos.containsKey(idPunto)) throw new PuntoDesconocidoException ();
         PuntoInteres p = puntos.get(idPunto);
         int x = p.getCoordenada().getPosicionX() - posActual.getPosicionX();
         int y = p.getCoordenada().getPosicionY() - posActual.getPosicionY();
          return x*x + y*y;
         
    }
    
    /**
     * Devuelve el punto de interés más cercano a la posición actual, o null si no pudo encontrar ningún punto de interes.
     * 
     * @return PuntoInteres el punto de Interpes más cercano
     */
    public PuntoInteres puntoMasCercano () {
        //TODO: Implementar
        int distancia = maxX*maxX + maxY*maxY;
        PuntoInteres punto = null;
        for (PuntoInteres p : puntos.values())
        {
        int x = p.getCoordenada().getPosicionX() - posActual.getPosicionX();
        int y = p.getCoordenada().getPosicionY() - posActual.getPosicionY();
        int distanciaActual = x*x + y*y;
        if (distanciaActual <= distancia)
          {
            distancia = distanciaActual;
            punto = p;
           }
        }
        
        return punto;
        }
    
    
    /**
     * Borra un punto del mapa por su id
     * 
     * @param idPunto el ID del punto que se quiere eliminar del mapa
     * @throws PuntoDesconocidoException cuando no existe el punto o el id es nulo
     */
    public void borrarPunto(String idPunto) throws PuntoDesconocidoException {
         idPunto = idPunto.trim().toLowerCase();
         if (idPunto == null) { throw new PuntoDesconocidoException();}
         if (!puntos.containsKey(idPunto)) {throw new PuntoDesconocidoException();}
         else {puntos.remove(idPunto); }
   
    }
    
    /**
     * Borra todos los puntos del mapa
     */
    public void borrarTodo (){
        
        puntos.clear();
    }
    
    
    /**
     * Devuelve una lista de Puntos de Interes por Tipo
     * @param tipo El tipo de punto de interes a listar
     * @return la lista de puntos de interes
     *
     */
    public List<PuntoInteres> getPuntosDeInteresPorTipo (Tipo tipo) {
        //TODO: Implementar
        List <PuntoInteres> lista = new ArrayList <PuntoInteres>  ();
        for (PuntoInteres p: puntos.values())
        {
            if (p.getTipo() == tipo) { lista.add(p); }
        }
        return lista;
        
    }
    
    /**
     * Devuelve la ubicación actual en el mapa
     * @return la coordenada de la ubicación actual
     */
    public Coordenada getUbicacion (){
        //TODO: Implementar       
        return posActual;
    }
    
    /**
     * Establece la posicion Actual. Lanza una IllegalArgumentException cuando se setea una coordenada
     * fuera de los rangos del mapa
     * 
     * @param Coordenada la cordenada de la posicion que se quiere establece
     * @throws IllegalArgumentException cuando se setea una coordenada
     * fuera de los rangos del mapa
     * 
     */
    public void setUbicacion(Coordenada c) {
        if ((c.getPosicionX() > maxX) || (c.getPosicionY() > maxY)) { throw new IllegalArgumentException();}
        else {
            posActual.setPosicionX(c.getPosicionX());
            posActual.setPosicionY(c.getPosicionY());
        }
        
            //TODO: Implementar
    }
    
    
    /**
     * Realiza un movimiento en la posición actual en el mapa de acuerdo a la dirección pasada
     * como argumento. La dirección es decodificada por el decodificador actual
     * 
     * @param String la dirección (codificada) hacia donde moverse en el mapa
     * 
     */
    public void mover (String direccion) {
        
        Direccion dire = deco.decodifica(direccion);
        switch (dire) {
            
            case SUR:
            if (posActual.getPosicionY() > 0)
            {
                posActual.setPosicionY(posActual.getPosicionY() -1 );
            }
            break;
            
            case NORTE:
            if (posActual.getPosicionY() < maxY)
            {
                posActual.setPosicionY(posActual.getPosicionY()+1);
            } 
            break;
            
            case ESTE:
            if (posActual.getPosicionX ()> 0)
            {
                posActual.setPosicionX(posActual.getPosicionX()-1);
            }
            break;
            
            case OESTE:
            if (posActual.getPosicionX() < maxX)
            {
                posActual.setPosicionX(posActual.getPosicionX()+1);
            }
            break;
        
        }
    }
}