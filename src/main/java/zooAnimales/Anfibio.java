package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {
	
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero, zona);
		listado.add(this);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		listado.add(this);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		ranas ++;
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		salamandras ++;
		return salamandra;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public boolean getVenenoso() {
		return venenoso;
	}
	
	public boolean isVenenoso() {
		return venenoso;
	}
}
