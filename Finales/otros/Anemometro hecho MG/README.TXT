1 - Desarrolle la clase "BaseDatos" tal que implemente la
    interfaz "Historial"
2 - Implementar la clase "RegistroAnemometro" tal que: 
	a. Extienda de la clase "Registro" 
	b. Implemente el siguiente constructor
	 "public RegistroAnemometro (String id,int anio,int dia,int hora,int minuto, int velocidad, Direccion direccion)"
	
	   Este constructor lanza un "IllegalArgumentException"
	   cuando alguno de los atributos es invalido.
	   Velocidad no puede ser negativa, Direccion no puede
	   ser null, y una direccion "NA" no puede tener una
	   velocidad distinta de 0.
	   
	c. Implemente los metodos "public Direccion getDireccion()"
	   y "public int getVelocidad()"



 