package tester;

public class BlueRay implements Device{

	public void turnOn() {
		System.out.println("El BlueRay se est� encendiendo");
	}
	
	public void play() {
		System.out.println("EL BlueRay se est� reproduciendo" );
	}
	
	public void stop() {
		System.out.println("El BlueRay se detuvo");
	}
	
	public void turnOff() {
		System.out.println("El BlueRay se apag�");
	}
	
}
