package zooAnimales;

import java.util.*;

import gestion.Zona;

public class Anfibio extends Animal {
	private static List<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas = 0;
	public static int salamandras = 0;
	private String colorPiel = "";
	private Boolean venenoso = true;
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, Boolean venenoso ) {
		super(nombre,edad,habitat,genero,zona);
		this.venenoso = venenoso;
		this.colorPiel= colorPiel;
		listado.add(this);
	}
	public Anfibio() {
		super();
		listado.add(this);
	}
	public static int cantidadAnfibios() {
		return listado.size();
	}
	public String movimiento() {
		return "saltar";
	}
	public static Anfibio crearRana(String nombre, int edad, String genero, Zona zona) {
		ranas++;
		return new Anfibio(nombre, edad, "selva", genero, zona, "rojo" , true);
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero, Zona zona) {
		salamandras++;
		return new Anfibio(nombre, edad, "selva", genero, zona, "negro y amarillo" , false);
	}
	public List<Anfibio> getListado(){
		return listado;
	}
	public String getColorPiel() {
		return this.colorPiel;
	}
	public Boolean getVenenoso() {
		return this.venenoso;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public void setVenenoso(Boolean venenoso) {
		this.venenoso= venenoso;
	}
}
