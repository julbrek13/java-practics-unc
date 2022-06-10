import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;



public class MaquinaDeCafe implements MaquinaDeEstados {
    protected TipoProducto seleccion;
    protected Estado estado = Estado.APAGADO;
    protected List <Recipiente> recipientes;
    protected Map <TipoProducto, Receta> recetas;
    protected int totalProductosServidos;


    /**
     * Constructor sin parametros.
     */
    public MaquinaDeCafe(){
        recipientes = new ArrayList<Recipiente>();
        recetas = new HashMap<TipoProducto,Receta>();
        totalProductosServidos = 0;
    }

    /**
     * Retorna la cantidad total de productos servidos por esta maquina.
     *
     * @return cantidad total de productos servidos
     */
    public int getTotalProductosServidos() {
        return totalProductosServidos;
    }


    /**
     * Retorna los productos y recetas configurados en esta
     * maquina de cafe
     *
     * @return mapa con productos y recetas asociadas
     */
    public Map<TipoProducto, Receta> getRecetas() {
        return recetas;
    }

    /**
     * Retorna los recipientes configurados en esta maquina de cafe
     *
     * @return lista de los recipientes
     */
    public List<Recipiente> getRecipientes() {
        return recipientes;
    }

    /**
     * Retorna el producto (receta) seleccionado
     *
     * @return el producto seleccionada en la maquina
     */
    public TipoProducto getSeleccion() {
        return seleccion;
    }

// A PARTIR DE AQUI SON METODOS A MODIFICAR EN EL EXAMEN (NO MODIFICAR LOS ANTERIORIES)

    /**
     * Ejecuta la receta para el producto especificado, extrayendo
     * de cada recipiente la cantidad necesaria de ingredientes
     * para preparar la receta
     *
     * @param el TipoProducto seleccionado
     * @throws ProductoException si por algun motivo no se puede
     * extraer la cantidad requerida de cada ingrediente
     * @return un nuevo cafe
     */
    public Cafe prepararProducto(TipoProducto seleccion) throws ProductoException {
        //TODO implementar el metodo
        //throw new IllegalStateException();//REMOVER ESTA LINEA
        
        try{
           return new Cafe(seleccion); 
        }
        catch(Exception e)
        {
            throw new ProductoException("No se pudo preparar el cafe");
        }
        
    }

    /**
     * Retorna el recipiente para el producto especificado
     *
     * @param ingrediente el ingrediente requerido
     * @return el recipiente que contiene el ingrediente
     * requerido, o null si no existe un recipiente para ese
     * ingrediente.
     */
    public Recipiente getRecipiente (Ingrediente ingrediente){
        //TODO implementar el metodo
        throw new IllegalStateException();//REMOVER ESTA LINEA
    }

    /**
     * Agrega una receta para un producto de la maquina de
     * cafe. Solo es valido en modo MANTENIMIENTO
     *
     * @param r la Receta correspondiente al producto a agregar.
     * @param p el Producto a agregar y configurar en la maquina.
     * @throws IllegalStateException si la maquina no esta en modo MANTENIMIENTO
     */
    public void agregarReceta (Receta r, TipoProducto p){
        //TODO implementar el metodo
    }

    /**
     * Selecciona un producto para despachar. Solo es posible si
     * la maquina esta lista para despachar el producto
     *
     * @param seleccion el producto a despachar
     * @throws IllegalStateException si la maquina no esta lista
     */
    public void setSeleccion(TipoProducto seleccion) {
        //TODO implementar el metodo
    }

    /* Metodos de la interface */

    @Override
    public Estado getEstado() {
        //TODO implementar el metodo
        return null;
    }

    @Override
    public void operar() {
        //TODO implementar el metodo
    }

    @Override
    public void restablecer() {
        //TODO implementar el metodo
    }

    @Override
    public void encender() {
        //TODO implementar el metodo
    }

    @Override
    public void apagar() {
        //TODO implementar el metodo
    }

    @Override
    public void mantener() {
        //TODO implementar el metodo
    }

}




