/**
 * @author 
 *
 */
public interface Dibujable {
	
	/**
	 * Muestra el objeto 3D.
	 * NOTA: Despu�s de llamar a este m�todo, una llamada al m�todo "esVisible()" deber�a retornar TRUE
	 * 
	 * @return
	 */
	public void mostrar();
	
	/**
	 * Oculta el objeto 3D
	 * NOTA: Despu�s de llamar a este m�todo, una llamada al m�todo "esVisible()" deber�a retornar FALSE
	 * @return
	 */
	public void ocultar();
	
	/**
	 * Muestra la visibilidad del objeto 3D.
	 * @return true si el cuerpo es visible (ha sido mostrado) y false en caso contrario (ha sido ocultado)
	 */
	public boolean esVisible();
}
