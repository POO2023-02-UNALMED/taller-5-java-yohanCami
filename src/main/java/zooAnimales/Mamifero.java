package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal {
	
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero, zona);
		listado.add(this);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		listado.add(this);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		//this(nombre, edad, genero, zona);
		Mamifero caballo = new Mamifero(nombre, edad, "pradera" ,genero, true, 4);
		caballos ++;
		return caballo;
		
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva" ,genero, true, 4);
		leones ++;
		return leon;
	}
	
	public boolean getPelaje() {
		return pelaje;
	}
	
	public boolean isPelaje() {
		return pelaje;
	}
	
	public int getPatas() {
		return patas;
	}
		

}
