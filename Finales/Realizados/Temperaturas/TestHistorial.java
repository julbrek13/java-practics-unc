import org.junit.Assert ;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.* ; 
import java.lang.* ; 
/**
 * The test class TestHistorial.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestHistorial
{
    Historial hist ; 
    /**
     * Default constructor for test class TestHistorial
     */
    public TestHistorial ()   
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() throws RegistroDuplicadoException 
    {    
            hist = new BaseDatos() ;
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Prueba 
     */ 
    @Test
    public void testGetNumeroDeRegistros() throws RegistroDuplicadoException {
         for ( int i = 0 ; i<20 ; i++ ) {
            Registro reg = new RegistroTemperatura(273+i,1900+i,i+1,i,i) ; 
            hist.agregarRegistro(reg); 
        }
          assertEquals(20,hist.getNumeroDeRegistros()) ;
    }

    /**
     * Prueba getRegistroMasViejo() 
     */    
    @Test
    public void testGetRegistroMasViejo() throws RegistroDuplicadoException {
        Historial temp = new BaseDatos() ; 
        assertEquals(null, temp.getRegistroMasViejo()) ;
        Registro reg = new RegistroTemperatura(273,1900,1,0,0) ; 
        temp.agregarRegistro(reg) ; 
        assertEquals(true, reg.equals(temp.getRegistroMasViejo())) ;   
    }

    /** 
     * Prueba getRegistroPorId() ; 
     */
    @Test(expected = IllegalArgumentException.class) 
    public void testGetRegistroPorId() {
        hist.getRegistroPorId(null) ;  
    } 
    
    /**
     * Prueba getRegistroPorTipo() 
     */ 
    @Test
    public void testGetRegistroPorTipo() throws RegistroDuplicadoException {
        Historial temp = new BaseDatos() ; 
        Registro reg = new RegistroTemperatura ( 273,1900,1,0,0 ) ; 
        temp.agregarRegistro(reg) ; 
        List<Registro> list = temp.getRegistrosPorTipo(TipoRegistro.TEMPERATURA) ; 
        assertEquals( true , reg.equals(list.get(0)) ) ; 
        assertEquals( true,hist.getRegistrosPorTipo(null).isEmpty()) ; 
    } 
    
    /**
     * Prueba de agregado. 
     */ 
    @Test ( expected = RegistroDuplicadoException.class ) 
    public void testAgregarRegistro() throws RegistroDuplicadoException { 
        Registro reg = new RegistroTemperatura(273,1900,1,0,0) ; 
        Registro reg1 = new RegistroTemperatura(273,1900,1,0,0) ;
        hist.agregarRegistro(reg);
        hist.agregarRegistro(reg1); 
    }
    
    /**
     * Prueba eliminarTodosLosRegistros() 
     */ 
    @Test
    public void testEliminarTodosLosRegistros() {
        hist.eliminarTodosLosRegistros() ; 
        Registro regNull = hist.getRegistroPorId("Reg_0"); 
        assertEquals(null,regNull) ; 
    }            
}
