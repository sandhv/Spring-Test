package tester;

public class Smarthphone implements Device {
	Playlist playlist;
	
	public void turnOn() {
		System.out.println("El smarthphone se est� encendiendo");
	}
	
	public void play() {
		System.out.println("EL smarthphone se est� reproduciendo" + playlist.getName());
	}
	
	public void stop() {
		System.out.println("El smarthphone se detuvo");
	}
	
	public void turnOff() {
		System.out.println("El smarthphone se apag�");
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
}
