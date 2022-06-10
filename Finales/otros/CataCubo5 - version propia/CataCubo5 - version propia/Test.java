
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private static Catalogo c;
    
    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        c = new Catalogo();
        
        Cubo c1 = new Cubo(Material.MADERA, Color.ROJO, 6);
        Cubo c2 = new Cubo(Material.MADERA, Color.NEGRO, 8);
        Cubo c3 = new Cubo(Material.METAL, Color.AMARILLO, 5);
        Cubo c4 = new Cubo(Material.METAL, Color.VERDE, 9);
        Cubo c5 = new Cubo(Material.METAL, Color.AZUL, 2);
        Cubo c6 = new Cubo(Material.CARTON, Color.VERDE, 6);
        Cubo c7 = new Cubo(Material.GOMA, Color.AZUL, 6);
        Cubo c8 = new Cubo(Material.GOMA, Color.NEGRO, 6);
        Cubo c9 = new Cubo(Material.GOMA, Color.ROJO, 6);
        Cubo c10 = new Cubo(Material.PLASTICO, Color.AMARILLO, 6);
        
        c.agregarCuerpo("c1", c1);
        c.agregarCuerpo("c2", c2);
        c.agregarCuerpo("c3", c3);
        c.agregarCuerpo("c4", c4);
        c.agregarCuerpo("c5", c5);
        c.agregarCuerpo("c6", c6);
        c.agregarCuerpo("c7", c7);
        c.agregarCuerpo("c8", c8);
        c.agregarCuerpo("c9", c9);
        c.agregarCuerpo("c10", c10);
    }

    public Catalogo getCatalogo()
    {
        return c;
    }
}
