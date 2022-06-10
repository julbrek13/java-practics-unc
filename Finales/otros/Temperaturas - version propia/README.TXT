CONSIGNA:
1 - Desarrolle la clase "BaseDatos" tal que implemente la interfaz "Historial"
2 - Implemente los m�todos de la clase Temperatura indicados con "TODO", de acuerdo a la descripci�n documentada en la clase
    (Puede agregar los atributos o m�todos privados que crea conveniente, MANTENIENDO los existentes) 
3 - Implementar la clase "RegistroDeTemperatura" tal que: 
	a. Extienda de la clase "Registro"
	b. Implemente el constructor "public RegistroDeTemperatura (int tempAbsoluta, int anio, int dia, int hora, int minuto)"
	   Este constructor asocia un objeto de la clase Temperatura a este Registro.
	   Este constructor lanza una "IllegalArgumentException" cuando alguno de los atributos es invalido.
	c. Implemente el m�todo "public Temperatura getTemperatura()"
	   Este m�todo retorna el objeto de la clase Temperatura asociado a este Registro.

RECUERDE:
1 - No debe cambiar nada de lo que se le entrega. 
2 - Agregue solamente lo que se pide.


//GetRegistroPorID