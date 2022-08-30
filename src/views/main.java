package views;
import java.util.ArrayList;
import java.util.Scanner;

import controllers.MainController;
import models.Familia;
import models.Perro;

public class main {
	
	 
	private static Scanner scanner =  new Scanner(System.in);
	public static MainController mainController = new MainController();
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}
	
	/**
	 *  este método muestra el menu dle programa
	 */
	
	static   void menu() {
		int opcion =0;
		
		while(opcion!=4) {
			System.out.println("1. LLENAR FAMILIAS");
			System.out.println("2. AGREGAR NUEVO PERRO Y ASIGNAR");
			System.out.println("3. VER FAMILIAS");
			System.out.println("4. SALIR");
			
			
			
			opcion = scanner.nextInt();

			switch(opcion) {
				case 1:
					mainController.primeraOpcion();
					break;
				case 2:
					mainController.segundaFuncion();
					
					break;
				case 3:
					mainController.terceraFuncion();
					break;
				case 4:
					System.out.println("GRACIAS POR USAR EL PROGRAMA");
			}
		}
		
	}

}
