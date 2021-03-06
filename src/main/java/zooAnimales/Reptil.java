package zooAnimales;

import java.util.*;


public class Reptil extends Animal{
	private static List<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas = 0;
	public static int serpientes = 0;
	private String colorEscamas = "";
	private int largoCola = 0;
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	public Reptil() {
		super();
		listado.add(this);
	}
	public static int cantidadReptiles() {
		return listado.size();		
	}
	public String movimiento() {
		return "reptar";
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas++;
		return new Reptil(nombre, edad, "humedal", genero, "verde",3);
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes++;
		return new Reptil(nombre, edad, "jungla", genero, "blanco",1);
	}
	public List<Reptil> getListado(){
		return listado;
	}
	public String getColorEscamas(){
		return this.colorEscamas;
	}
	public int  getLargoCola() {
		return this.largoCola;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}
