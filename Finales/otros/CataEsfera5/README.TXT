Examen cursado 21/6/2011

1) Implemente los m�todos de la clase Catalogo de acuerdo a la documentacion de los metodos del proyecto
  
a) Reemplace la constante ALUMNO con su nombre
  
b) implemente un constructor sin par�metros para la clase Catalogo, que inicialice las variables de instancia 
(idDeCatalogo y mapaDeCuerpos) y actualice las variables de clase (contador)
  
c) implemente los siguientes m�todos de acuerdo a la descripci�n dada en la documentaci�n de la clase. 
    
*agregarCuerpo(), 
    *eliminarCuerpo(), 
    *getCantidadCuerposTotal(), 
    *listarCuerposPorMaterial(), 
    
*toString(), 
    *getId() 



2) Implemente la clase Esfera tal que:
  
- extienda de 'Cuerpo3D' e implemente la interfaz 'Dibujable', implementando los m�todos necesarios de cada una, 
y contenga la variable boolean visible.
 
- implemente el m�todo "public void setRadio(int radio)" para setear el radio de la esfera y tal que lance 
una IllegalArgumentException cuando el radio es negativo con el mensaje "radio invalido".
  
- implemente el m�todo "public int getRadio()".
  
- implemente el constructor "public Esfera(Material m, Color c, int radio, boolean visible)" tal que:

    * setee los valores iniciales para color, material, radio y visibilidad

    * lance una "IllegalArgumentException" cuando material, color o radio sean invalidos
    
SUGERENCIA: utilice los metodos setRadio, y el constructor y el m�todo pintar de la clase padre para inicializar 
estos valores.
  
- implemente el metodo "public String toString()" tal que retorne una cadena con el siguiente formato:
       
  "Esfera de color <COLOR> de <MATERIAL> de radio <radio>"
