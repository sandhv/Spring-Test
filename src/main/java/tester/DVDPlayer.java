package tester;

public class DVDPlayer implements Device{
	

	public void turnOn() {
		System.out.println("El dvd se está encendiendo");
	}
	
	public void play() {
		System.out.println("EL dvd se está reproduciendo");
	}
	
	public void stop() {
		System.out.println("El dvd se detuvo");
	}
	
	public void turnOff() {
		System.out.println("El dvd se apagó");
	}
	
	
}
