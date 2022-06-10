
/**
 * @author 
 *
 */
public abstract class Cuerpo3D {
	public static final int PI = 3;
	private Material material;
	private Color color = Color.BLANCO;
	
	/**
	 * Constructor con parámetros
	 * @param material
	 */
	public Cuerpo3D (Material material){
		if (material == null){
			throw new IllegalArgumentException ("Material invalido");
		}
		this.material = material;
	}
	
	/**
	 * Devuelve el volumen de este Cuerpo 3D
	 * @return
	 */
	public abstract int getVolumen();
	
	/**
	 * Devuelve el tipo del Cuerpo. Por ejemplo para instancias de la clase Cubo retorna 
	 * "cubo", para instancias de la clase Esfera retorna "esfera", para instancias de 
	 * la clase Cilindro retorna "cilindro", etc.
	 * 
	 * @return el tipo de Cuerpo
	 */
	public abstract String getNombreDeCuerpo(); 
	
	/**
	 * Indica si el color es valido para este Cuerpo3D
	 * @param color
	 * @return true si es valido, false en caso contrario
	 */
	public boolean esColorValido(Color color){
		boolean valido = true;
		
		if (color == null){
			return false;
		}
		
		switch (material) {
			case MADERA: 
				if (color.equals(Color.AMARILLO)) {
					valido=false;
				}
				break;
			case GOMA:
				if (color.equals(Color.VERDE)) {
					valido=false;
				}
				break;
			case PLASTICO:
			case CARTON:
				if (color.equals(Color.NEGRO)) {
					valido=false;
				}
				break;
			case METAL:
				if (color.equals(Color.ROJO)) {
					valido=false;
				}
				break;
		}
		return valido;
	}
	
	/**
	 * Pinta el cuerpo3d 
	 * @param color 
	 * @throws CombinacionInvalidaException
	 */
	public void pintar(Color color) throws CombinacionInvalidaException {
		if (!esColorValido(color)){
			throw new CombinacionInvalidaException("Color invalido para este material");
		}
		this.color = color;
	}
	
	/**
	 * @return the color
	 */
	public Color getColor() 
	{
		return color;
	}
	
	/**
	 * @return the material
	 */
	public Material getMaterial()
	{
		return material;
	}
	/**
	 * @param material the material to set
	 */
	public void setMaterial(Material material) {
		this.material = material;
	}
}
