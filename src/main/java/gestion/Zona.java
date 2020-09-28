package gestion;
import zooAnimales.Animal;
import java.util.*;

public class Zona {
	private String nombre = "";
	private Zoologico zoo = new Zoologico();
	private List<Animal> animales = new ArrayList<Animal>();
	public Zona(String nombre, Zoologico zoo, List<Animal> animales) {
		this.nombre= nombre;
		this.zoo = zoo;
		this.animales = animales;
	}
	public Zona() {
		
	}
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
	}
	public int cantidadAnimales() {
		return this.animales.size();
	}
	public String getNombre() {
		return this.nombre;
	}
	public Zoologico getZoo() {
		return this.zoo;
	}
	public List<Animal> getAnimales(){
		return this.animales;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}
}
