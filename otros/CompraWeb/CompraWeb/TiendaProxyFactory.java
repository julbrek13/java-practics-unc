
public class TiendaProxyFactory {
	private static TiendaProxy tienda;
	private final static String DEFAULT_CATALOGO = "catalogo"; 
	public static TiendaProxy getTienda(){
		if (tienda == null){
			tienda = new TiendaProxy(DEFAULT_CATALOGO);
		}
		return tienda;		
	}
}
