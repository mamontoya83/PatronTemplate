package app;

import java.util.Scanner;

import adapter.Motor;
import adapter.MotorAdapter;
import adapter.MotorComun;
import adapter.MotorEconomico;
import adapter.MotorElectrico;

public class Main {
	public static void main(String[] args) {
		Automovil auto = null;
		do {
			int o = menu();
			if(o <= 4){
				switch (o) {
				case 1:
					auto = new Automovil(new MotorComun());
					break;
				case 2:
					auto = new Automovil(new MotorEconomico());
					break;
				case 3:
					auto = new Automovil(new MotorAdapter(new MotorElectrico()));
					break;
				case 4:
					System.out.println("Sistema Terminado");
					System.exit(0);
					break;
				}
				auto.recorrido();
			}else{
				System.out.println("Ingreso una opcion invalida, intente de nuevo\n");
			}
		} while (0 != 4); 
	}

	public static int menu(){
		Scanner s = new Scanner(System.in);
		System.out.print(
				"MENU DE OPCIONES\n"
				+ "Seleccione el tipo de motor para su automovil \n"
				+ "1. Motor Comun\n"
				+ "2. Motor Economico\n"
				+ "3. Motor Electrico\n"
				+ "4. Salir \n"
				+ ">"
				);
		String resp = s.next(); 
		return (resp != null) ? Integer.parseInt(resp):-1
				;
	}
}
