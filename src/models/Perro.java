package models;

public class Perro {
	private String nombre;
	private String raza;
	private String tamanio;
	private int salud;
	private String color;
	
	
	/**
	 * 
	 * @param nombre
	 * @param raza
	 * @param tamanio
	 * @param salud
	 * @param color
	 */
	public Perro(String nombre, String raza, String tamanio, int salud, String color) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.tamanio = tamanio;
		this.salud = salud;
		this.color = color;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return
	 */
	public String getRaza() {
		return raza;
	}
	/**
	 * 
	 * @param raza
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}
	/**
	 * 
	 * @return
	 */
	public String getTamanio() {
		return tamanio;
	}
	/**
	 * 
	 * @param tamanio
	 */
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	/**
	 * 
	 * @return
	 */
	public int getSalud() {
		return salud;
	}
	/**
	 * 
	 * @param salud
	 */
	public void setSalud(int salud) {
		this.salud = salud;
	}
	/**
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
