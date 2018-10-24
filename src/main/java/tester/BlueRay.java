package tester;

public class BlueRay {
	Playlist playlist;

	public void turnOn() {
		System.out.println("El BlueRay se está encendiendo");
	}
	
	public void play() {
		System.out.println("EL BlueRay se está reproduciendo" + playlist.getName());
	}
	
	public void stop() {
		System.out.println("El BlueRay se detuvo");
	}
	
	public void turnOff() {
		System.out.println("El BlueRay se apagó");
	}
	
	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
}
