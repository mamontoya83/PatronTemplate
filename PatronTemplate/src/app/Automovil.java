package app;

import adapter.Motor;

public class Automovil {
	private Motor motor;
	
	public Automovil(Motor motor) {
		this.motor = motor;
	}
	
	public void recorrido(){
		this.motor.recorrido();
	}
	
}
