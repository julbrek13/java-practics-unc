
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private Mapa mapa;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        mapa = new Mapa(100,100);
        
        Coordenada psm = new Coordenada(5,5);
        Coordenada r = new Coordenada(7,3);
        Coordenada b = new Coordenada(2,4);
        Coordenada mc = new Coordenada(9,1);
        Coordenada g = new Coordenada(6,8);
        
        Parque plazaSanMartin = new Parque(psm,"plazasanmartin");
        Parque rotonda = new Parque(r,"rotonda");
        Restaurante betos = new Restaurante(b,"betos");
        Restaurante mcDonalds = new Restaurante(mc,"mcdonalds");
        PuntoInteres gepetto = new Restaurante(g,"gepetto");
        
        mapa.agregarPunto(plazaSanMartin);
        mapa.agregarPunto(rotonda);
        mapa.agregarPunto(betos);
        mapa.agregarPunto(mcDonalds);
        mapa.agregarPunto(gepetto);
    }
    
    public Mapa getMapa()
    {
        // put your code here
        return mapa;
    }
}
