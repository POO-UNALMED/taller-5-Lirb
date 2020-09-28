package zooAnimales;
import gestion.Zona;

public class Animal {
	private static int totalAnimales = 0;
	private String nombre = "";
	private int edad = 0 ;
	private String habitat = "";
	private String genero = "";
	private Zona zona = new Zona();
	public Animal(String nombre,int edad,String habitat,String genero,Zona zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.habitat = habitat;
		this.zona = zona;
		totalAnimales++;
	}
	public Animal() {
		totalAnimales++;
	}
	public String movimiento() {
		return "desplazarse";
	}
	public String totalPorTipo() {
		return String.format("Mamiferos: %d%nAves: %d%nReptiles: %d%nPeces: %d%nAnfibios: %d", Mamifero.cantidadMamiferos(),Ave.cantidadAves(),Reptil.cantidadReptiles(),Pez.cantidadPeces(),Anfibio.cantidadAnfibios());
	}
	public String toString() {
		return String.format("Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s, la zona en la que me ubico es %s, en el %s", this.nombre, this.edad,this.habitat,this.genero, this.zona.getNombre(), this.zona.getZoo().getNombre());
	}
	public String getNombre() {
		return this.nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public String getHabitat() {
		return this.habitat;
	}
	public String getGenero() {
		return this.genero;
	}
	public Zona getZona() {
		return zona;
	}
	public int getTotalAnimales() {
		return totalAnimales;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
}
