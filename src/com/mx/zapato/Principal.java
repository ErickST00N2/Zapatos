/**
 * 
 */
package com.mx.zapato;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciar el objeto
		Zapato zapato1 = new Zapato("TENIS", "NIKE", "BLANCO", "USA", "PIEL", 25.5, 2550.70);
		Zapato zapato2 = new Zapato("CHAROL", "FLEXI", "BLANCO", "USA", "SINTETICO", 26, 1200);
		Zapato zapato3 = new Zapato("ELZAPATO", "CHARLY", "NEGRO", "MX", "SINTETICO", 28, 800);
		Zapato zapato4 = new Zapato("Tenis", "Nike", "Rojo", "USA", "Piel", 28, 2550);
		Zapato zapato5 = new Zapato("Zapato", "Lacoste", "Verde", "MX", "Sintetico", 25, 3050);
		Zapato zapato6 = new Zapato("TENIS", "ADIDAS", "BLANCO", "USA", "PIEL", 27.5, 200.70);
		Zapato zapato7 = new Zapato("BOTAS", "CUADRA", "NEGRO", "MEXICO", "PIEL", 29, 3000.50);
		Zapato zapato8 = new Zapato("ZAPATILLA", "SHEIN", "AZUL", "TAIWAN", "PIEL", 12, 1800.99);
		Zapato zapato9 = new Zapato("Casual", "Adidas", "White", "Germany", "Leather", 10.0, 85.0);

		// Auxiliar
		Zapato zapatito = null;
		Implementacion crud = new Implementacion();

		crud.contarRegistros();

		// Añadir datos a la lista
		crud.guardar(zapato1);
		crud.guardar(zapato2);
		crud.guardar(zapato3);
		crud.guardar(zapato4);
		crud.guardar(zapato5);
		crud.guardar(zapato6);
		crud.guardar(zapato7);
		crud.guardar(zapato8);
		crud.guardar(zapato9);

		// Mostrar
		crud.mostrar();
		crud.contarRegistros();

		// Buscar
		zapatito = crud.buscar(1);
		System.out.println("El zapato encontrado:\n" + zapatito);

		// Editar
		zapatito = crud.buscar(0);
		zapatito.setColor("Negro");
		zapatito.setMaterial("Lona");
		crud.editar(0, zapatito);
		crud.mostrar();

		// Eliminar
		crud.eliminar(7);
		crud.mostrar();

		///////////////////////////////////////////////////////////////////////////////////
		// Metodo personalizado
		crud.contarRegistros();

		// Datos de zapato:
		String tipo, marca, color, origen, material;
		double talla, precio;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		// Creamos las variables que utilizaremos
		// Scanner:
		Scanner scan = null;

		int search;
		String search2;
		double search3;

		// Menu:
		int menuP = 0, menuS = 0, indice = 0;

		do {
			// Menu
			System.out.println("------ MENU ------");
			System.out.println("1.- Alta");
			System.out.println("2.- Buscar");
			System.out.println("3.- Editar");
			System.out.println("4.- Eliminar");
			System.out.println("5.- Mostrar");
			System.out.println("6.- Contar");
			System.out.println("7.- Salir del menu");
			System.out.println("ELIGEN UNA OPCION");
			scan = new Scanner(System.in);
			menuP = scan.nextInt();

			switch (menuP) {

			// ALTA
			case 1:

				System.out.println("Escribe la tipo de zapato");
				scan = new Scanner(System.in);
				tipo = scan.nextLine();

				System.out.println("Escribe el marca de zapato");
				scan = new Scanner(System.in);
				marca = scan.nextLine();

				System.out.println("Escribe el color de zapato");
				scan = new Scanner(System.in);
				color = scan.nextLine();

				System.out.println("Escribe el origen de zapato");
				scan = new Scanner(System.in);
				origen = scan.nextLine();

				System.out.println("Escribe el material de zapato");
				scan = new Scanner(System.in);
				material = scan.nextLine();

				System.out.println("Escribe la talla de zapato");
				scan = new Scanner(System.in);
				talla = scan.nextDouble();

				System.out.println("Escribe el precio de zapato");
				scan = new Scanner(System.in);
				precio = scan.nextDouble();

				zapatito = new Zapato(tipo, marca, color, origen, material, talla, precio);

				boolean existe = false;
				for (Zapato p : crud.zapatos) {
					if (p.getTipo().equalsIgnoreCase(tipo) && p.getMarca().equalsIgnoreCase(marca)
							&& p.getColor().equalsIgnoreCase(color) && p.getOrigen().equalsIgnoreCase(origen)
							&& p.getMaterial().equalsIgnoreCase(material) && p.getTalla() == talla
							&& p.getPrecio() == precio) {
						existe = true;
						break;
					}
				}

				if (existe) {
					System.out.println("Los zapatos ya existen en la lista.");
				} else {
					// Agregamos a la lista
					crud.guardar(zapatito);
					System.out.println("El registro de los zapatos fue exitoso");
				}
				break;

			// BUSCAR
			case 2: {
				if (crud.zapatos.size() < 1) {
					System.out.println("No hay nada en la lista");
					break;
				}

				// SUB-MENU DE LA OPCION BUSCAR

				do {
					System.out.println("2. Buscar un elemento por atributo");
					System.out.println("¿Qué atributo deseas buscar?");
					System.out.println("1. Buscar por indice");
					System.out.println("2. Buscar por tipo");
					System.out.println("3. Buscar por marca");
					System.out.println("4. Buscar por color");
					System.out.println("5. Buscar por origen");
					System.out.println("6. Buscar por material");
					System.out.println("7. Buscar por talla");
					System.out.println("8. Buscar por precio");
					System.out.println("9. Salir");

					scan = new Scanner(System.in);
					menuS = scan.nextInt();

					switch (menuS) {
					case 1:
						System.out.println("Dame el indice");
						scan = new Scanner(System.in);
						search = scan.nextInt();
						System.out.println("El zapato encontrado es:" + crud.buscar(indice));
						break;

					case 2:
						System.out.println("Dame el tipo");
						scan = new Scanner(System.in);
						search2 = scan.nextLine();

						for (Zapato zapAux : crud.zapatos) {
							if (zapAux.getTipo().contains(search2)) {
								System.out.println("El encontro el zapato en la posicion ["
										+ crud.zapatos.indexOf(zapAux) + "]: " + zapAux);
							}
						}

						break;
					case 3:
						System.out.println("Dame la marca");
						scan = new Scanner(System.in);
						search2 = scan.nextLine();

						for (Zapato zapAux : crud.zapatos) {
							if (zapAux.getMarca().contains(search2)) {
								System.out.println("Se encontro el zapato en la posicion ["
										+ crud.zapatos.indexOf(zapAux) + "]: " + zapAux);
							}
						}
						break;
					case 4:
						System.out.println("Dame la color");
						scan = new Scanner(System.in);
						search2 = scan.nextLine();

						for (Zapato zapAux : crud.zapatos) {
							if (zapAux.getColor().contains(search2)) {
								System.out.println("Se encontro el zapato en la posicion ["
										+ crud.zapatos.indexOf(zapAux) + "]: " + zapAux);
							}
						}
						break;
					case 5:
						System.out.println("Dame la origen");
						scan = new Scanner(System.in);
						search2 = scan.nextLine();

						for (Zapato zapAux : crud.zapatos) {
							if (zapAux.getOrigen().contains(search2)) {
								System.out.println("Se encontro el zapato en la posicion ["
										+ crud.zapatos.indexOf(zapAux) + "]: " + zapAux);
							}
						}
						break;
					case 6:
						System.out.println("Dame el material");
						scan = new Scanner(System.in);
						search2 = scan.nextLine();

						for (Zapato zapAux : crud.zapatos) {
							if (zapAux.getMarca().contains(search2)) {
								System.out.println("Se encontro el zapato en la posicion ["
										+ crud.zapatos.indexOf(zapAux) + "]: " + zapAux);
							}
						}
					case 7:
						System.out.println("Dame la talla");
						scan = new Scanner(System.in);
						search3 = scan.nextDouble();

						for (Zapato zapAux : crud.zapatos) {
							if (zapAux.getTalla() == search3) {
								System.out.println("Se encontro el zapato en la posicion ["
										+ crud.zapatos.indexOf(zapAux) + "]: " + zapAux);
							}
						}

						break;
					case 8:
						System.out.println("Dame el precio");
						scan = new Scanner(System.in);
						search3 = scan.nextDouble();

						for (Zapato zapAux : crud.zapatos) {
							if (zapAux.getPrecio() == search3) {
								System.out.println("Se encontro el zapato en la posicion ["
										+ crud.zapatos.indexOf(zapAux) + "]: " + zapAux);
							}
						}
					case 9:
						System.out.println("Saliendo del sub menu de buscar");

						break;
					default:
						throw new IllegalArgumentException("Unexpected value: " + menuP);
					}
				} while (menuS != 9);
			}

			// EDITAR
			case 3:
				if (crud.zapatos.size() < 1) {
					System.out.println("No hay nada en la lista");
					break;
				}

				System.out.println("3. Editar un elemento por atributo");

				// IMPRIMIR TODOS LOS ZAPATOS CON SU INDICE
				for (int i = 0; i < crud.zapatos.size(); i++) {
					System.out.println("El indice de los zapatos es el siguiente: ");
					System.out.println("[" + i + "]: " + crud.zapatos.get(i));
				}

				
				System.out.println("Introduce el indice de la lista a editar");
				scan = new Scanner(System.in);
				indice = scan.nextInt();

				// Obtenemos el zapato indicado
				zapatito = crud.zapatos.get(indice);

				// SUB-MENU DE EDITAR
				do {

					System.out.println("¿Qué atributo deseas editar?");
					System.out.println("1. Editar por tipo");
					System.out.println("2. Editar por marca");
					System.out.println("3. Editar por color");
					System.out.println("4. Editar por origen");
					System.out.println("5. Editar por material");
					System.out.println("6. Editar por talla");
					System.out.println("7. Editar por precio");

					scan = new Scanner(System.in);
					menuS = scan.nextInt();

					switch (menuS) {
					case 1:
						System.out.println("Dame el tipo");
						scan = new Scanner(System.in);
						tipo = scan.nextLine();

						zapatito.setTipo(tipo);

						break;
					case 2:
						System.out.println("Dame la marca");
						scan = new Scanner(System.in);
						marca = scan.nextLine();

						zapatito.setMarca(marca);

						break;
					case 3:
						System.out.println("Dame la color");
						scan = new Scanner(System.in);
						color = scan.nextLine();

						zapatito.setColor(color);

						break;
					case 4:
						System.out.println("Dame la origen");
						scan = new Scanner(System.in);
						origen = scan.nextLine();

						zapatito.setOrigen(origen);

						break;
					case 5:
						System.out.println("Dame el material");
						scan = new Scanner(System.in);
						material = scan.nextLine();

						zapatito.setMaterial(material);

						break;

					case 6:
						System.out.println("Dame la talla ");
						scan = new Scanner(System.in);
						talla = scan.nextDouble();

						zapatito.setTalla(talla);
						break;
					case 7:
						System.out.println("Dame el precio ");
						scan = new Scanner(System.in);
						precio = scan.nextDouble();

						zapatito.setPrecio(precio);
						break;
					case 8:
						System.out.println("*Estas saliendo del sub menu de editar*");
					default:
						throw new IllegalArgumentException("Unexpected value: " + menuP);
					}

				} while (menuS != 8);

				crud.zapatos.set(indice, zapatito);
				System.out.println("El ");
				break;

			// ELIMINAR
			case 4:
				if (crud.zapatos.size() < 1) {
					System.out.println("No hay nada en la lista para eliminar");
					break;
				}
				
				System.out.println("Cual deseas eliminar?");
				// IMPRIMIR TODOS LOS ZAPATOS CON SU INDICE
				for (int i = 0; i < crud.zapatos.size(); i++) {
					System.out.println("El indice de los zapatos es el siguiente: ");
					System.out.println("[" + i + "]: " + crud.zapatos.get(i));
				}
				scan =  new Scanner(System.in);
				indice = scan.nextInt();
				System.out.println("Zapatos eliminados: " + crud.zapatos.get(indice));
				crud.zapatos.remove(indice);

				break;

			// MOSTRAR
			case 5:
				if (crud.zapatos.size() < 1) {
					System.out.println("No hay nada en la lista");
					break;
				}
				crud.mostrar();

				break;

			// CONTAR
			case 6:
				if (crud.zapatos.size() < 1) {
					System.out.println("No hay nada en la lista");
					break;
				}
				crud.contarRegistros();

				break;

			// SALIR DEL MENU
			case 7:
				System.out.println("Hasta pronto!");
				break;

			}

		} while (menuP != 6);
	}

}
