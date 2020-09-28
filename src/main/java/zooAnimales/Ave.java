package zooAnimales;

import java.util.*;

import gestion.Zona;

public class Ave extends Animal{
	private static List<Ave> listado = new ArrayList<Ave>();
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas = "";
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
		super(nombre,edad,habitat,genero,zona);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	public Ave() {
		super();
		listado.add(this);
	}
	public static int cantidadAves() {
		return listado.size();
	}
	public String movimiento() {
		return "volar";
	}
	public static Ave crearHalcon(String nombre, int edad, String genero,Zona zona) {
		halcones++;
		return new Ave(nombre, edad, "montañas", genero, zona, "café glorioso");
	}
	public static Ave crearAguila(String nombre, int edad, String genero,Zona zona) {
		aguilas++;
		return new Ave(nombre, edad, "montañas", genero, zona, "blanco y amarillo");
	}
	public List<Ave> getListado(){
		return listado;
	}
	public String getColorPlumas() {
		return this.colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
}
