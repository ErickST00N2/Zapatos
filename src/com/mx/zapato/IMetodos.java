/**
 * 
 */
package com.mx.zapato;

/**
 * Una interface es una plantilla para la construcción de una clase.
 */
public interface IMetodos {
	//CRUD: es un acronimo para las operaciones CREATE, READ, UPDATE, DELETE.
	
	
	// void
	public void guardar(Zapato zapato);
	
	public void mostrar();
	
	public void editar(int indice, Zapato zapato);
	
	public void eliminar(int indice);
	
	public Zapato buscar(int indice);
	
}
