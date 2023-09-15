package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal {
	
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {}
	
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, int iguanas, int serpientes, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero, zona);
		listado.add(this);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		listado.add(this);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		iguanas ++;
		return iguana;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		serpientes ++;
		return serpiente;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public int getLargoCola() {
		return largoCola;
	}

}
