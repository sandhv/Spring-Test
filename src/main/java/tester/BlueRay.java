package tester;

public class BlueRay implements Device{

	public void turnOn() {
		System.out.println("El BlueRay se está encendiendo");
	}
	
	public void play() {
		System.out.println("EL BlueRay se está reproduciendo" );
	}
	
	public void stop() {
		System.out.println("El BlueRay se detuvo");
	}
	
	public void turnOff() {
		System.out.println("El BlueRay se apagó");
	}
	
}
