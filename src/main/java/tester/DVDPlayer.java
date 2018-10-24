package tester;

public class DVDPlayer implements Device{
	Playlist playlist;

	public void turnOn() {
		System.out.println("El dvd se está encendiendo");
	}
	
	public void play() {
		System.out.println("EL dvd se está reproduciendo" + playlist.getName());
	}
	
	public void stop() {
		System.out.println("El dvd se detuvo");
	}
	
	public void turnOff() {
		System.out.println("El dvd se apagó");
	}
	
	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
}
