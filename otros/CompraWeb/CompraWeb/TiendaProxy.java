import java.util.ArrayList;
import java.util.List;


public class TiendaProxy {

	Catalogo catalogo;
	ArrayList<IFiltro> filtros;
	public static final double LIMITE_DE_COMPRA = 20000.00;
	
	public TiendaProxy (String nombre){
		catalogo = new Catalogo (nombre);
		filtros = new ArrayList<IFiltro> ();
	}
	
	public void setTamanioPagina (int tamanio){
		catalogo.setTamanioPagina(tamanio);
	}
	
	public int getTamanioPagina (){
		return catalogo.getTamanioPagina();
	}
	
	public int getNumeroDePaginas (){
		return catalogo.getNumeroDePaginas(filtros);
	}
	public List<Item> getPagina (int pagina){
		if (pagina > catalogo.getNumeroDePaginas(filtros))
			throw new IllegalArgumentException ();
		return catalogo.getItemsPagina(filtros, pagina);
	}
	
	public void addFiltro(IFiltro filtro){
		filtros.add(filtro);
	}
	
	public void clearFiltros() { 
		filtros.clear();
	}
	
	public Item getItemPorID(String id){
		return catalogo.getItemByID(id);
	}
	
	
	/*
	 * TODO:
	 * implementar metodo tal que:
	 * return TRUE si el valor total del carrito de compras no supera el limite de compra de la tienda
	 * de otro manera retorne FALSE
	 * 
	 * throws TarjetaInvalidaException si la tarjeta es NULL o invalida 
	 * 
	 * Una trajeta es valida si:
	 *  Su numero tiene 16 digitos
	 *  Vencimiento al menos un mes posterior al mes actual (ej, 03/2013 es valida hasta el 02/2013)
	 *  
	 *  ej tarjeta invalida: "12309309023" 02/2020; "1234567812345678" 10/2010;"1234567812345678" 02/2013; null 05/2013 
	 *  
	 * 
	 */
	public boolean validarCompra (ICarrito carrito, Tarjeta tarjeta) throws TarjetaInvalidaException{
		return false;
	}
	
	
	
}
