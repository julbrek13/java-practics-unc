import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class LibretaDeContactos {
	
	private Map<String,Contacto> contactos;
	
	public LibretaDeContactos(){
		contactos = new HashMap<String, Contacto> ();
	} 
	
	public void agregarContacto (Contacto contacto){
		contactos.put (contacto.getNumerotelefonico(), contacto);
	}
	
	public Contacto getContactoPorNumero (String numero){
		return contactos.get(numero);		
	}

	public void borrarContacto (Contacto contacto){
		contactos.remove(contacto.getNumerotelefonico());
	}
	
	public List<Contacto> getContactos(){
		return new ArrayList<Contacto> (contactos.values());
	}
}
