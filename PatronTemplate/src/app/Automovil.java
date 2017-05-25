package app;

import adapter.Motor;

public class Automovil {
	private Motor motor;
	
	public Automovil(Motor motor) {
		this.motor = motor;
	}
	
	@Override
	public String toString() {
		String salida="Automovil con "+this.motor.getClass().getSimpleName()+"\n"
				+ "Paso 1: "+this.motor.encender()+ "\n"
				+ "Paso 2: "+this.motor.acelarar()+ "\n"
				+ "Paso 3: "+this.motor.apagar()+"\n";
		return salida;
	}
}
