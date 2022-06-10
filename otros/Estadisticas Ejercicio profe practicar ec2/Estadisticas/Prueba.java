
public class Prueba
{
    private static int ID_PROX_TEST = 1;
    private Integer idTest; 
    private Persona persona;
    private Resultado resultado;
    
    public Prueba(Persona p)
    {
        persona = p;
        idTest = ID_PROX_TEST;
        ID_PROX_TEST ++;
    }

    public void setResultado(Resultado r)
    {
        resultado = r;
    }
}
