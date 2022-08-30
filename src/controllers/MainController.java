package controllers;

import java.util.ArrayList;
import java.util.Scanner;

import models.Familia;
import models.Perro;

public class MainController {
	static int contadorFamilias=0;
	static Scanner scanner =  new Scanner(System.in);
	private static ArrayList<Familia> familia= new ArrayList();
	static String[]  razaPeligrosa = {
			 "Pit bull terrier",
			 "American Staffordshire terrier",
			 "Tosa Inu",
			 "Dogo argentino",
			 "Dogo Guatemalteco",
			 "Fila brasileño",
			 "Presa canario",
			 "Dóberman",
			 "Gran perro japonés",
			 "Mastín napolitano",
			 "Presa Mallorqui",
			 "Dogo de burdeos",
			 "Bullmastiff",
			 "Bull terrier inglés",
			 "Bulldog americano",
			 "Rhodesiano",
			 "Rottweiler"
	};
	
	/**
	 * este método gestiona la primera opción de llenar familias.
	 */
	public void primeraOpcion() {
		if(contadorFamilias<3) {
			while(contadorFamilias<3) {
				
				System.out.println("INGRESE SU APELLIDO: ");
				String nombre = scanner.next();
				
				
				System.out.println("INGRESE SUS MIEMBROS: ");
				int miembros = scanner.nextInt();
				
				System.out.println("INGRESE CANTIDAD DE NIÑOS PEQUEÑOS: ");
				int ninosPeq = scanner.nextInt();
				
				System.out.println("INGRSE CANTIDAD DE NIÑOS GRANDES");
				int ninosGrand = scanner.nextInt();
				
				Familia fam = new Familia(nombre,miembros,ninosPeq,ninosGrand);
				familia.add(fam);
				contadorFamilias++;
			}
			
		}else {
			System.out.println("FAMILIA LLENAS");
		}
	}
	
	/**
	 * este método gestiona la segunda opción que es agregar nuevo perro y asignarla a una familia automáticamente.
	 */
	public void segundaFuncion() {
		System.out.println("INGRESE EL NOMBRE DEL PERRO");
		String nombre = scanner.next();
		
		System.out.println("INGRESE LA RAZA DEL PERRO");
		String raza = scanner.next();
		
		System.out.println("INGRESE EL TAMAÑO DEL PERRO");
		String tamanio = scanner.next();
		
		System.out.println("INGRESE LA SALUD DEL PERRO");
		int salud = scanner.nextInt();
		
		System.out.println("INGRESE EL COLOR DEL PERRO");
		String color = scanner.next();
		
		Perro perro = new Perro(nombre, raza, tamanio,salud,color);
		
		for(int i=0;i<familia.size();i++) {
			if(familia.get(i).getNinosPeq()>0) {
				if(tamanio.equals("Pequeño")) {
					boolean valor = false;
					for(int x = 0; x<razaPeligrosa.length-1; x++) {
						if(raza.equals(razaPeligrosa[x])) {
							valor =true;
							break;
						}
					}
					if(valor) {
						System.out.println("RAZA PELIGROSA NO SE PUEDE ASIGNAR");
					}else {
						familia.get(i).setPero(perro);
						System.out.println("SE AGREGÓ EL PERRO A LA FAMILIA: "+ familia.get(i).getApellido());
						break;
					}
				}else {
					System.out.println("LA RAZA ES MUY GRANDE");
				}
			}else if(familia.get(i).getNinosGrand()>0) {
				if(tamanio.equals("Grande")) {
					System.out.println("NO PUEDES AGREGAR PERRO POR LA ESTATURA");
					
				}else {
					boolean valor = false;
					for(int x = 0; x<razaPeligrosa.length-1; x++) {
						if(raza.equals(razaPeligrosa[x])) {
							valor =true;
							break;
						}
					}
					if(valor) {
						System.out.println("RAZA PELIGROSA NO SE PUEDE ASIGNAR");
					}else {
						familia.get(i).setPero(perro);
						System.out.println("SE AGREGÓ EL PERRO A LA FAMILIA: "+ familia.get(i).getApellido());
						break;
					}
				}
			}else {
				familia.get(i).setPero(perro);
				System.out.println("SE AGREGO EL PERRO A LA FAMILIA: "+ familia.get(i).getApellido());
			}
		}
	}
	
	/**
	 * este método gestiona la tercera opción para ver familias y sus perros
	 */
	public void terceraFuncion() {
		for(int i=0;i<familia.size();i++) {
			System.out.println("=================================================");
			System.out.println("APELLIDO: "+familia.get(i).getApellido());
			System.out.println("MIEMBROS: "+familia.get(i).getMiembros());
			System.out.println("NIÑOS PEQUEÑOS: "+familia.get(i).getNinosPeq());
			System.out.println("NIÑOS GRANDES: "+familia.get(i).getNinosGrand());
			System.out.println("=================================================");

			for(int x = 0; x<familia.get(i).getPero().size(); x++) {
				System.out.println("=================================================");
				System.out.println("NOMBRE DEL PERRO: "+ familia.get(i).getPero().get(x).getNombre());
				System.out.println("RAZA DEL PERRO: "+ familia.get(i).getPero().get(x).getRaza());
				System.out.println("TAMAÑO DEL PERRO: "+ familia.get(i).getPero().get(x).getTamanio());
				System.out.println("SALUD DEL PERRO: "+ familia.get(i).getPero().get(x).getSalud());
				System.out.println("COLOR DEL PERRO: "+ familia.get(i).getPero().get(x).getColor());
				System.out.println("=================================================");

			}

		}
	}
	
}
