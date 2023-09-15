package gestion;
import java.util.ArrayList;

public class Zoologico {

	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<>();
	
	public Zoologico() {}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		
		int contador = 0;
		for (int i = 0; i < zonas.size(); i++) {
		    Zona zona = zonas.get(i);
		    
		    contador += zona.cantidadAnimales();
		}
		
		return contador;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public ArrayList<Zona> getZona() {
		return zonas;
	}
}
