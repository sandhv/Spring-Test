package tester;

public class Smarthphone implements Device {
	Playlist playlist;
	
	public void turnOn() {
		System.out.println("El smarthphone se está encendiendo");
	}
	
	public void play() {
		System.out.println("EL smarthphone se está reproduciendo" + playlist.getName());
	}
	
	public void stop() {
		System.out.println("El smarthphone se detuvo");
	}
	
	public void turnOff() {
		System.out.println("El smarthphone se apagó");
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
}
