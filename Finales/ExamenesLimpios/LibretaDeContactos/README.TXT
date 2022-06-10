Estimado estudiante, debe completar este proyecto realizando las
tareas que se indican a continuacion:

1. Implemente la clase "RegistroDeLlamadas" como una subclase de Registro.

abstract public List<Llamada> getLlamadasPorNumero (String numero) throws NumeroInvalidoException;
abstract public List<Llamada> getLlamadasPorTipo (boolean saliente);
abstract public int getDuracionTotalLlamadas ();
abstract public Map<String, EstadisticasNumero> getMapaDeEstadisticas (List<Llamada> llamadas);

2. Implemente la clase "Visor", tal que implemente la interfaz Formateable
public String convertirListaComoString(List<Llamada> llamadas);
public String convertirListaComoStringAmigable(List<Llamada> llamadas, LibretaDeContactos cont);
public String convertirMapaEstadisticaComoString(Map<String, EstadisticasNumero> m);

3. Fecha: Implementar el solamente Constructor
public Fecha (int anio, int mes, int dia, int hora, int minuto)

4. Llamada: Implementar los siguientes métodos
public String getDuracion()
public String toString()