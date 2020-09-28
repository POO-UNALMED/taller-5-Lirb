package zooAnimales;
import java.util.*;


public class Mamifero extends Animal{
	private static List<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos = 0;
	public static int leones = 0;
	private Boolean pelaje = false;
	private int patas = 0;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, Boolean pelaje, int patas) {
		super(nombre,edad,habitat,genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	public Mamifero() {
		super();
		listado.add(this);
	}
	public static int cantidadMamiferos() {
		return listado.size();
		
	}
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones++;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}
	public List<Mamifero> getListado(){
		return listado;
	}
	public Boolean isPelaje() {
		return this.pelaje;
	}
	public int getPatas() {
		return this.patas;
	}
	public void setPelaje(Boolean pelaje) {
		this.pelaje = pelaje;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
}
