package gestion;
import java.util.*;
public class Zoologico {
	private String nombre = "";
	private String ubicacion = "";
	private List<Zona> zonas = new ArrayList<Zona>();
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Zoologico() {
		this.nombre = null;
		this.ubicacion = null;
	}
	public void agregarZonas(Zona zona){
		zonas.add(zona);
	}
	public int cantidadTotalAnimales() {
		int total = 0;
		for (Zona zona :zonas ) {
			total = total + zona.cantidadAnimales();
		}
		return total;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getUbicacion() {
		return this.ubicacion;
	}
	public List<Zona> getZona() {
		return this.zonas;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public void setZona(List<Zona> zona) {
		this.zonas = zona;
	}
}
