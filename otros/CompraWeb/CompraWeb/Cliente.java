
public class Cliente {

	private TiendaProxy tienda;
	private ICarrito carrito;
	private Tarjeta tarjeta;
	
	public Cliente (Tarjeta tarjeta){
//		carrito = new CarritoDeCompras();
		tienda = TiendaProxyFactory.getTienda();
		this.tarjeta = tarjeta;
	}
	
	public void mostrarItemsPorCagetoria(Categoria cat){
		tienda.clearFiltros();
//		IFiltro filtro = new FiltroPorCategoria();
//		filtro.setCriterio(cat.name());
//		tienda.addFiltro(filtro);
		mostrarItems();
	}

	public void mostrarItemsTotales(){
		tienda.clearFiltros();
		mostrarItems();
	}
	
	private void mostrarItems(){
		int paginas = tienda.getTamanioPagina();
		for (int i=0; i<paginas; i++){
			for (Item it : tienda.getPagina(i)){
				System.out.println(it.toString());
			}
			System.out.println ("Pagina "+i+"//"+paginas);
		}
	}
	
	public void agregarAlCarrito (String itemId){
		carrito.addItem(tienda.getItemPorID(itemId));
	}
	
	public void limpiarCarrito (){
		carrito.clear();
	}
	
	public void mostrarCarrito () {
		System.out.println (carrito.toString());
	}
	
	public void comprar (){
		try {
			if (tienda.validarCompra(carrito, tarjeta)){
				System.out.println ("Compra exitosa");
				carrito.clear();
			} else {
				System.out.println ("No se puede realizar la compra");
			}
			
		} catch (TarjetaInvalidaException e) {
			System.out.println ("Tarjeta Invalida");
		}
	}
	
}
