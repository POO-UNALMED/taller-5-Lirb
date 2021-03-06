package zooAnimales;
import java.util.*;


public class Pez extends Animal{
	private static List<Pez> listado = new ArrayList<Pez>();
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas = "";
	private int cantidadAletas = 0;
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	public Pez() {
		super();
		listado.add(this);
	}
	public static int cantidadPeces() {
		return listado.size();
	}
	public String movimiento() {
		return "nadar";
	}
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		return new Pez(nombre,  edad, "oceano",  genero, "rojo", 6);
	}
	public static Pez crearBacalao(String nombre, int edad, String genero){
		bacalaos++;
		return new Pez(nombre,  edad, "oceano",  genero, "gris", 6);
	}
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public int getCantidadAletas() {
		return this.cantidadAletas;
	}
	public List<Pez> getListado(){
		return listado;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
}
