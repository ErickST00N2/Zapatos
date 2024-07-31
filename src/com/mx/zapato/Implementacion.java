package com.mx.zapato;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase es la implementacion de la interface: por lo que ocupamos la palabra reservada implements
 * */
public class Implementacion implements IMetodos{
	
	List<Zapato> zapatos = new ArrayList<Zapato>();

	@Override
	public void guardar(Zapato zapato) {
		// TODO Auto-generated method stub
		zapatos.add(zapato);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(zapatos);
	}

	@Override
	public void editar(int indice, Zapato zapato) {
		// TODO Auto-generated method stub
		zapatos.set(indice, zapato);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		zapatos.remove(indice);
		
	}

	@Override
	public Zapato buscar(int indice) {
		// TODO Auto-generated method stub
		return zapatos.get(indice);
	}
	
	public int contador() {
		return zapatos.size();

	}
	
	public void contarRegistros() {
		System.out.println("La lista contiene: " + contador() + " Zapatos.");
	}
	

}
