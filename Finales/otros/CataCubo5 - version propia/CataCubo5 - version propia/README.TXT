Examen Final 05/07/2011.



1) Implemente los m�todos de la clase Catalogo de acuerdo a la
   documentacion de los metodos del proyecto
  
a) Reemplace el contenido de la constante ALUMNO con su nombre
 
b) implemente un constructor sin par�metros para la clase Catalogo,
que inicialice las variables de instancia 
(idDeCatalogo y
     mapaDeCuerpos) y actualice las variables de clase (contador)
  
c) implemente los siguientes m�todos de acuerdo a la descripci�n dada
     en la documentaci�n de la clase. 
   
 *agregarCuerpo(), 
    *eliminarCuerpo(), 
    *getCantidadCuerposTotal(),
    *listarCuerposPorColor(), 
    
*listarColoresEnUso(),
    *cantidadColoresEnUso(), 
    *toString(), 
    *getId() 



2) Implemente la clase Cubo tal que:
  
- extienda de 'Cuerpo3D' e implemente la interfaz 'Geometria',
implementando los m�todos necesarios de cada una.
  
- implemente el m�todo "public void setLado(int lado)" para setear
 el lado del cubo y tal que lance una 
IllegalArgumentException
 cuando el lado es negativo con el mensaje "lado invalido".
  
- implemente el m�todo "public int getLado()".
  
- implemente el constructor "public Cubo(Material m, Color c, int lado)"
    tal que:

    * setee los valores iniciales para color, material y lado

    * lance una "IllegalArgumentException" cuando material, color o lado
 sean invalidos. Si la excepci�n se lanz� 
      desde un m�todo auxiliar,
 transfiera el mensaje al lanzar la nueva excepci�n.
      
SUGERENCIA: utilice los metodos setLado, y el constructor y el
      m�todo pintar de la clase padre para 
inicializar estos valores.
  
- implemente el metodo "public String toString()" tal que retorne una
    cadena con el siguiente formato:
       
  "Cubo de <MATERIAL> color <COLOR> de lado <LADO>, volumen <VOLUMEN> y superficie <SUPERFICIE>"


// super(m);