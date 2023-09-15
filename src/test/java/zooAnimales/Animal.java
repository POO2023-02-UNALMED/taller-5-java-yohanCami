package zooAnimales;

import gestion.Zona;

public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {}
	
	public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
		this.totalAnimales ++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.totalAnimales ++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;

	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		String salida = "Mamiferos: "+Mamifero.cantidadMamiferos()+"\n"+"Aves: "+Ave.cantidadAves()+"\n"+"Reptiles: "+Reptil.cantidadReptiles()+"\n"+"Peces: "+Pez.cantidadPeces()+"\n"+"Anfibios: "+Anfibio.cantidadAnfibios();
		
		return salida;
	}
	
	public String toString() {
		
		if (zona != null) {
			
			String salida = "Mi nombre es " + nombre + ", tengo una edad de " + edad + " habito en " + habitat + "y mi genero es " + genero + ", la zona en la que me ubico es" + zona.getNombre() + ", en el zoo" + zona.getZoo() + "" ;
			
			return salida;
			
		}
		
		String salida = "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
		
		return salida;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public String getGenero() {
		return genero;
	}

}
