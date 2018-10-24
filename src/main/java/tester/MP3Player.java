package tester;

public class MP3Player implements Device {
	
	Playlist playlist;

	public void turnOn() {
		System.out.println("El mp3 se está encendiendo");
	}
	
	public void play() {
		System.out.println("EL mp3 se está reproduciendo con playlist " + playlist.getName());
	}
	
	public void stop() {
		System.out.println("El mp3 se detuvo");
	}
	
	public void turnOff() {
		System.out.println("El mp3 se apagó");
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
	
	
		
}
