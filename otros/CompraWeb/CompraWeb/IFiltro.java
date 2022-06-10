import java.util.List;

public interface IFiltro {
	
	// setea el criterio del filtro como un String. 
	// Cada filtro particular convierte el String al tipo apropiado 
	// Lanza IllegalArgumentException  cuando el criterio es invalido 
	// (ej. numero invalido si el criterio es un nmero, o 
	public void setCriterio (String criterio);
	
	// devuelve el criterio de filtrado 
	public String getCriterio ();
	
	// aplica el filtro, devolviendo la lista de items filtrados de acuerdo al criterio.
	// Lanza una illegalArgumentException cuando la lista de items es null.
	public List<Item> aplicar (List<Item> fullList);
}
