/**
 * @author 
 *
 */
public interface Dibujable {
	
	/**
	 * Muestra el objeto 3D.
	 * NOTA: Después de llamar a este método, una llamada al método "esVisible()" debería retornar TRUE
	 * 
	 * @return
	 */
	public void mostrar();
	
	/**
	 * Oculta el objeto 3D
	 * NOTA: Después de llamar a este método, una llamada al método "esVisible()" debería retornar FALSE
	 * @return
	 */
	public void ocultar();
	
	/**
	 * Muestra la visibilidad del objeto 3D.
	 * @return true si el cuerpo es visible (ha sido mostrado) y false en caso contrario (ha sido ocultado)
	 */
	public boolean esVisible();
}
