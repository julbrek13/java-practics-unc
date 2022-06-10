

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestFecha.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestFecha extends junit.framework.TestCase
{
    private Fecha f1, f2 ; 
    /**
     * Default constructor for test class TestFecha
     */
    public TestFecha()
    { 
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        f1 = new Fecha (1900,1,0,0);
        f2 = new Fecha (2000,1,0,0); 
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
     * Prueba constructor, respecto del año.
     */ 
    public void testConstructorRespectoAnio() {
        try{
            Fecha f = new Fecha (1000,1,0,0); 
        } catch ( IllegalArgumentException e1 ) {
            assertEquals("Fecha invalida",e1.getMessage()) ; 
            try{ Fecha f = new Fecha(1900,1,0,0) ; } 
            catch ( IllegalArgumentException e2 ) {assertEquals(true,false) ;} 
            try{ Fecha f = new Fecha(23923,1,0,0) ; } 
            catch ( IllegalArgumentException e3 ) {assertEquals(true,false) ;}
        }
    } 

    /** 
    * Prueba constructor, respecto del dia.
    */ 
    public void testConstructorRespectoDia() {
        try{
            Fecha f = new Fecha (1900,0,0,0); 
        } catch ( IllegalArgumentException e1 ) {
            assertEquals("Fecha invalida",e1.getMessage()) ; 
            try{ Fecha f = new Fecha (1900,1,0,0) ; } 
            catch ( IllegalArgumentException e2 ) {} 
            try{ Fecha f = new Fecha (1900,364,0,0) ; } 
            catch ( IllegalArgumentException e3 ) {}
            try{ Fecha f = new Fecha (1900,365,0,0) ; } 
            catch ( IllegalArgumentException e4 ) { 
                assertEquals( "Fecha invalida",e4.getMessage() ) ; } 
        } 
    }
    
   /**
    * Prueba constructor, respecto el minuto.
    */
    public void testConstructorRespectoHora() {
        try{
            Fecha f = new Fecha (1900,1,24,0); 
        } catch ( IllegalArgumentException e1 ) {
            assertEquals("Fecha invalida",e1.getMessage()) ; 
            try{ Fecha f = new Fecha (1900,1,0,0) ; } 
            catch ( IllegalArgumentException e2 ) { assertEquals(true,false) ;} //No deberia entrar aquí.
            try{ Fecha f = new Fecha (1900,364,12,0) ; } 
            catch ( IllegalArgumentException e3 ) { assertEquals(true,false) ; } //No debería entrar aquí.
        } 
    }
    
   /**
    * Prueba constructor, respecto el segundo. 
    */
      public void testConstructorRespectoMinuto() {
        try{
            Fecha f = new Fecha (1900,1,0,60); 
        } catch ( IllegalArgumentException e1 ) {
            assertEquals("Fecha invalida",e1.getMessage()) ; 
            try{ Fecha f = new Fecha (1900,1,0,0) ; } 
            catch ( IllegalArgumentException e2 ) {assertEquals(true,false) ;} //No debería entrar aqui.
            try{ Fecha f = new Fecha (1900,364,0,30) ; } 
            catch ( IllegalArgumentException e3 ) {assertEquals(false,true) ;} //No debería entrar aquí.
        } 
    }
   /**
    * Prueba @equals() ; 
    */

    public void testEquals() {
        assertEquals(true, f1.equals(f1) ) ; 
        assertEquals(false, f1.equals(f2) ) ; 
    } 

    /**
     * Prueba @esAnteriorA()
     */ 
    public void testEsAnteriorA() { 
        assertEquals(true, f1.esAnteriorA(f2) ) ; 
        assertEquals(false, f2.esAnteriorA(f1) ) ; 
        assertEquals(false, f1.esAnteriorA(f1) ) ; 
        try { f1.esAnteriorA(null) ;}
        catch ( IllegalArgumentException e ) {
            assertEquals("Fecha invalida", e.getMessage() ) ; 
        }
    }

    /** 
     * Prueba getters 
     */ 
    public void testGetters() {
        assertEquals(1900,f1.getAnio());
        assertEquals(1,f1.getDia()); 
        assertEquals(0,f1.getHora()); 
        assertEquals(0,f1.getMinuto()); 
    }
}
