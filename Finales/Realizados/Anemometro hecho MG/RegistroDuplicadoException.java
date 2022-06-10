
public class RegistroDuplicadoException extends Exception {
    
    private String msj;

    /**
     * Almacena los datos erroneos.
     * @param msj El mensaje a ser transimitido con la excepción.
     */
    public RegistroDuplicadoException(String msj)
    {
        this.msj = msj;
    }

}
