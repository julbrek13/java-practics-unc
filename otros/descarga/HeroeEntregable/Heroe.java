/* Esta clase modela al personaje principal de un juego de rol
 */

public class Heroe {
    // La bolsa con los objetos recolectados
    private Bolsa bolsa;
    // El nivel de vida actual y su valor maximo
    private Integer vida, maxVida;
    // Objeto que tiene en la mano
    private Objetos objeto;

    /** Inicializa al heroe con el maximo nivel de vida.
    *   El objeto seleccionado inicial es la espada de acero.
    *   La espada de acero es la única arma que persiste durante
    *   todo el juego y no puede quitarse de la bolsa.
    */
    public Heroe () {
        bolsa = new Bolsa();
        objeto = bolsa.getEspada();
        maxVida = 1000;
        vida = 1000;
    }

    /** Recolecta un objeto y lo agrega a la bolsa siempre y
     *  cuando haya lugar suficiente.
     *  @param obj El objeto para agregar en la bolsa
    */
    public void TomarObjetoDelSuelo(Objetos obj) {
        // Implementar
    }


    /** Permite cambiar el arma que tiene el héroe en sus manos.
     *  Si el arma elegida no está en la bolsa, mantiene en sus
     *  manos el arma actual.
     *  @param nombre El nombre del arma a tomar de la bolsa.
     */
    public void ElegirArma(String nombre) {
        // Implementar
    }

    /** Hace que el héroe ataque a un enemigo. Solo es viable cuando
     *  tiene un arma lista para usar en sus manos.
     *  @throws NoEsArmaException Cuando no tiene un arma en sus manos.
     *  @throws ArmaDescargadaException Cuando el arma no tiene municiones.
      */
    public void Atacar() throws NoEsArmaException, ArmaDescargadaException {
        // Implementar
    }

    /** Permite cambiar la munición del arma que tiene el héroe en sus manos.
     *  Si es posible el cambio, la munición del arma se guarda en la bolsa y
     *  se establece la nueva munición. En caso contrario, se deja el arma
     *  como estaba.
     *  @param nombre La munición a buscar en la bolsa.
     */
    public void RecargarArma (String nombre) {
        // Implementar
    }

    public Objetos getObjeto() {
        return objeto;
    }

    public void setObjeto(Objetos objeto) {
        this.objeto = objeto;
    }

}
