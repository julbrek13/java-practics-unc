

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestRegistroTemperatura.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestRegistroTemperatura extends junit.framework.TestCase 
{
    private RegistroTemperatura r1,r2 ; 
    private Registro r4 ; 
    /**
     * Default constructor for test class TestRegistroTemperatura
     */
    public TestRegistroTemperatura()
    {
        super("Prueba de RegistroTemperatura.") ; 
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        r1 = new RegistroTemperatura(273,1900,1,0,0) ; 
        r2 = new RegistroTemperatura(293,2000,1,0,0) ; 
        r4 = new RegistroTemperatura(273,1900,1,0,0) ;
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
     * Prueba constructor respecto de la temperatura. 
     */ 
    public void testConstructorRespectoTemperatura() { 
        try{
            RegistroTemperatura reg = new RegistroTemperatura(-22,1900,1,0,0) ;
        }catch ( IllegalArgumentException e1 ) {
            assertEquals("Temperatura invalida",e1.getMessage()) ; 
            try{ RegistroTemperatura reg = new RegistroTemperatura(0,1900,1,0,0) ; } 
            catch ( IllegalArgumentException e2 ) {}
            try{ RegistroTemperatura reg = new RegistroTemperatura(190023,1900,1,0,0) ;}
            catch( IllegalArgumentException e3 ) {} 
        }
    }

    /**
     * Prueba constructor, estado siguiente del objeto. 
     */ 
    public void testConstructorEstadoInicial() {
        assertEquals(TipoRegistro.TEMPERATURA,r1.getTipo()) ; 
        try{assertEquals(new Temperatura(273),r1.getTemperatura()) ; 
            assertEquals(new Fecha(1900,1,0,0),r1.getFecha());
        } catch ( Exception e ) {} 
    } 
 
    
    /** 
     * Prueba equals() 
     */ 
    public void testEquals() {
        assertEquals( true,r1.equals(r4) ) ;
        assertEquals( true,r1.equals(r1) ) ; 
        assertEquals( false,r1.equals(r2) ) ; 
    } 
}                    

