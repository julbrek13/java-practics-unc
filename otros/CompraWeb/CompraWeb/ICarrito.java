import java.util.ArrayList;


public interface ICarrito {
	
	// Agrega un item valido al carrito de compras. 
	// lanza una IllegalArgumentException cuando item es null.
	public void addItem (Item item);
	
	// remueve el item cuyo id es el pasado como argumento del carrito de compras
	// ignora id's inexistentes.
	// lanza una IllegalArgumentException cuando el itemId es null 
	public void removeItem (String itemId);
	
	// vacia el carrito de compras
	public void clear();
	
	//devuelve una lista con los itmes del carrito de compra
	public ArrayList<Item> getItemList ();
	
	//retorna el valor total de los items en el carrito de compra
	public double getTotalCompra();
	
}
