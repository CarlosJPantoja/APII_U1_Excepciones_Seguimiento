package ui;

import java.util.Scanner;

import model.*;

public class Main {
	
	public static Scanner lector = new Scanner(System.in);
	
	private MiniMarket miBarrio;
	
	public static void main(String args[]) {
		Main controller = new Main();
		controller.showMenu();
	}
	
	public Main() {
		miBarrio = new MiniMarket();
	}
	
	public void showMenu() {
		int option = 0;
		do{
			System.out.println("Welcome to the options menu \n1: Add Person \n2: Login attempts \n3: End program execution ");
			option = lector.nextInt(); lector.nextLine();
			switch(option){
				case 1:
					addPerson();
				break;
				
				case 2:
					logins();
				break;
				
				case 3:
					option = -02062002;
				break;
				
				default:
					System.out.println("\nThe option entered is not valid");
				break;
			}
			int bucle = 0, add = 0;
			do{
				if(add!=0){System.out.println("\nThe option entered is not valid, please try again");}
				if(option != -02062002) { 
					System.out.println("\nChoose an option: \n0: Return to the menu\n1: End program execution"); 
					option = lector.nextInt(); lector.nextLine();
				} else { option = 1;}
				if(option == 0){bucle=0;} else if(option == 1){bucle=0;} else{bucle=1; add++;}
			} while(bucle==1);
		} while(option == 0);
		System.out.println("\nProgram finished"); 
	}
	
	public void addPerson() {
		System.out.println("\nChoose your document type: \n1: TI: Tarjeta de Identidad \n2: CC: Cedula de Ciudadania \n3: PP: Pasaporte \n4: CE: Cedula de Extranjeria");
		int type = lector.nextInt(); lector.nextLine();
		System.out.println("\nEnter your document number");
		String numDocumento = lector.nextLine();
		String msg = miBarrio.addPerson(type, numDocumento);
		System.out.println("\n"+msg);
	}
	
	public void logins() {
		int logs = miBarrio.getIntentos();
		String msg = "\nEl numero de intentos de ingreso al MiniMarket es: "+logs;
		System.out.println(msg);
	}
}
