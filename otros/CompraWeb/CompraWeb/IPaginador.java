import java.util.List;


public interface IPaginador {
	
	public static int DEFAULT_PAGE_SIZE = 10;
	public static int MAX_PAGE_SIZE = 25;
	//Devuelve el tamano de la pagina del paginador
	public int getPageSize ();
	
	//Setea el tama�o de pagina del paginador. Lanza IllegalArgumentException cuando pageSize es invalido (menor 1 o mayor que el maximo permitido)
	public void setPageSize (int pageSize);

	//Obtiene la cantidad de paginas de una lista de items determinada, 
	//de acuerdo al tama�o de la pagina del paginador.
	public int getNumeroDePaginas(List<Item> fullList);
	
	//Devuelve una lista con los items de la pagina seleccionada.
	//Las paginas empiezan a numerarse desde la pagina "1"
	//Ej. pageSize=10, fullList.size() = 15 -> numeroDePaginas = 2, pagina 1 con 10 items y pagina 2 con 5 items.
	public List<Item> getItemsPaginados (List<Item> fullList, int pageNumber);
	
}
