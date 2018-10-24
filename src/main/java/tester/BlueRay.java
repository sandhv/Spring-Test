package tester;

public class BlueRay {
	Playlist playlist;

	public void turnOn() {
		System.out.println("El BlueRay se est� encendiendo");
	}
	
	public void play() {
		System.out.println("EL BlueRay se est� reproduciendo" + playlist.getName());
	}
	
	public void stop() {
		System.out.println("El BlueRay se detuvo");
	}
	
	public void turnOff() {
		System.out.println("El BlueRay se apag�");
	}
	
	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
}
