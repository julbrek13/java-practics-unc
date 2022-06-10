import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    BaseDatos b;
    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        b = new BaseDatos();
        try{
        
        Registro t1 = new RegistroDeTemperatura(100, 1920, 243, 13, 24);
        b.agregarRegistro(t1);
        Registro t2 = new RegistroDeTemperatura(230, 1902, 120, 2, 0);
        b.agregarRegistro(t2);
        Registro t3 = new RegistroDeTemperatura(350, 2010, 56, 17, 40);
        b.agregarRegistro(t3);
        Registro t4 = new RegistroDeTemperatura(415, 1948, 12, 9, 12);
        b.agregarRegistro(t4);
        Registro t5 = new RegistroDeTemperatura(580, 1967, 365, 20, 38);
        b.agregarRegistro(t5);
        Registro t6 = new RegistroDeTemperatura(690, 1989, 305, 6, 53);
        b.agregarRegistro(t6);
        
        }
        catch (RegistroDuplicadoException e){}
    
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public BaseDatos getBaseDatos()
    {
        return b;
    }
    
    public Registro getTemperatura(String t){
        return b.getRegistroPorId(t);
    }
}

