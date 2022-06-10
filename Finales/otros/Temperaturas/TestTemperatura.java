

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestTemperatura.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestTemperatura extends junit.framework.TestCase 
{
    private RegistroTemperatura registro1;
    private RegistroTemperatura registro2;
    private RegistroTemperatura registro3;

    
    

    /**
     * Default constructor for test class TestTemperatura
     */
    public TestTemperatura()
    {
        super("TestTemperatura") ; 
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        registro1 = new RegistroTemperatura(298, 2013, 45, 13, 51);
        registro1.getFecha();
        registro2 = new RegistroTemperatura(298, 2013, 45, 13, 51);
        registro3 = new RegistroTemperatura(295, 2012, 23, 6, 1);
        registro1.equals(registro2);
        registro1.equals(registro3);
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
     * @brief Prueba del constructor con parámetro inválido. 
     */
 
}
        