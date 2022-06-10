Examen Final 05/07/2011.



1) Implemente los métodos de la clase Catalogo de acuerdo a la
   documentacion de los metodos del proyecto
  
a) Reemplace el contenido de la constante ALUMNO con su nombre
 
b) implemente un constructor sin parámetros para la clase Catalogo,
que inicialice las variables de instancia 
(idDeCatalogo y
     mapaDeCuerpos) y actualice las variables de clase (contador)
  
c) implemente los siguientes métodos de acuerdo a la descripción dada
     en la documentación de la clase. 
   
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
implementando los métodos necesarios de cada una.
  
- implemente el método "public void setLado(int lado)" para setear
 el lado del cubo y tal que lance una 
IllegalArgumentException
 cuando el lado es negativo con el mensaje "lado invalido".
  
- implemente el método "public int getLado()".
  
- implemente el constructor "public Cubo(Material m, Color c, int lado)"
    tal que:

    * setee los valores iniciales para color, material y lado

    * lance una "IllegalArgumentException" cuando material, color o lado
 sean invalidos. Si la excepción se lanzó 
      desde un método auxiliar,
 transfiera el mensaje al lanzar la nueva excepción.
      
SUGERENCIA: utilice los metodos setLado, y el constructor y el
      método pintar de la clase padre para 
inicializar estos valores.
  
- implemente el metodo "public String toString()" tal que retorne una
    cadena con el siguiente formato:
       
  "Cubo de <MATERIAL> color <COLOR> de lado <LADO>, volumen <VOLUMEN> y superficie <SUPERFICIE>"


// super(m);