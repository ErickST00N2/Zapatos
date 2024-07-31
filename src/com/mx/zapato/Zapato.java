package com.mx.zapato;

public class Zapato {
	private String tipo;
	private String marca;
	private String color;
	private String origen;
	private String material;
	
	private double talla;
	private double precio;
	
	
	@Override
	public String toString() {
		return "Zapato [\ntipo=" + tipo + ", marca=" + marca + ", color=" + color + ", origen=" + origen + ", material="
				+ material + ", talla=" + talla + ", precio=" + precio + "\n]\n";
	}


	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}


	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}


	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}


	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}


	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}


	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}


	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}


	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}


	/**
	 * @return the talla
	 */
	public double getTalla() {
		return talla;
	}


	/**
	 * @param talla the talla to set
	 */
	public void setTalla(double talla) {
		this.talla = talla;
	}


	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	/**
	 * @param tipo
	 * @param marca
	 * @param color
	 * @param origen
	 * @param material
	 * @param talla
	 * @param precio
	 */
	public Zapato(String tipo, String marca, String color, String origen, String material, double talla,
			double precio) {
		this.tipo = tipo;
		this.marca = marca;
		this.color = color;
		this.origen = origen;
		this.material = material;
		this.talla = talla;
		this.precio = precio;
	}
	
	
}
