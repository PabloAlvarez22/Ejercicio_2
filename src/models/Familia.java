package models;

import java.util.ArrayList;

public class Familia {
	private String apellido;
	private int miembros;
	private int ninosPeq;
	private int ninosGrand;
	private ArrayList<Perro> pero = new ArrayList();
	
	
	
	
	
	/**
	 * 
	 * @param apellido
	 * @param miembros
	 * @param ninosPeq
	 * @param ninosGrand
	 */
	public Familia(String apellido, int miembros, int ninosPeq, int ninosGrand) {
		super();
		this.apellido = apellido;
		this.miembros = miembros;
		this.ninosPeq = ninosPeq;
		this.ninosGrand = ninosGrand;
	}

	/**
	 * 
	 * @return apellido
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * 
	 * @param apellido
	 */
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * 
	 * @return 
	 */
	public int getMiembros() {
		return miembros;
	}
	/**
	 * 
	 * @param miembros
	 */
	public void setMiembros(int miembros) {
		this.miembros = miembros;
	}
	/**
	 * 
	 * @return
	 */
	public int getNinosPeq() {
		return ninosPeq;
	}
	
	/**
	 * 
	 * @param ninosPeq
	 */
	public void setNinosPeq(int ninosPeq) {
		this.ninosPeq = ninosPeq;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getNinosGrand() {
		return ninosGrand;
	}
	
	/**
	 * 
	 * @param ninosGrand
	 */
	public void setNinosGrand(int ninosGrand) {
		this.ninosGrand = ninosGrand;
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<Perro> getPero() {
		return pero;
	}
	
	/**
	 * 
	 * @param perro
	 */

	public void setPero(Perro perro) {
		this.pero.add(perro);
	}
	
	
	
	
	
}
