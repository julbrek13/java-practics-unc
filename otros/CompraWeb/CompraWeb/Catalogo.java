import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Catalogo {

	//TODO: Modifique el constructor de la clase para inicializar 
	// la variable "IPaginador paginador" con una instancia de Paginador
	
	private ArrayList<Item> itemsList;
	private IPaginador paginador;

	public Catalogo (String nombre){
		itemsList = new ArrayList <Item>();
		init(nombre);
	}

	public List <Item> getItemsList(){
		return itemsList;
	}
	
	public void addItem(Item it){
		itemsList.add(it);
	}
	
	public void setTamanioPagina (int tamanio){
		paginador.setPageSize(tamanio);
	}
	public int getTamanioPagina (){
		return paginador.getPageSize();
	}
	
	public int getNumeroDePaginas (ArrayList<IFiltro> filtros){
		return paginador.getNumeroDePaginas(getListaFiltrada(filtros));
	}
	
	public List<Item> getItemsPagina (ArrayList<IFiltro> filtros, int pagina){
		return paginador.getItemsPaginados(getListaFiltrada(filtros), pagina);
	}
	
	private List<Item> getListaFiltrada (ArrayList<IFiltro> filtros){
		List<Item> listaFiltrada = new ArrayList<Item>(itemsList);
		if (filtros != null){
			for (IFiltro filtro : filtros) {
				listaFiltrada = filtro.aplicar(listaFiltrada);
			}
		}
		return listaFiltrada;
	}
	
	public Item getItemByID (String id){
		for (Item i : itemsList){
			if (id.equals(i.getItemID())){
				return i;
			}
		}
		return null;
	}
		
	private void init(String nombre){
		   try{
	            FileInputStream fstream = new FileInputStream(nombre.concat(".txt"));
	            DataInputStream entrada = new DataInputStream(fstream);
	            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
	            String strLinea;
	            while ((strLinea = buffer.readLine()) != null)   {
	            	String [] item = strLinea.split(",");
	            	itemsList.add(new Item(item[0],item[1],item[2],item[3]));
	            }
	            entrada.close();
	        }catch (Exception e){ 
	            System.err.println("Error: " + e.getMessage());
	        }
	}
}
