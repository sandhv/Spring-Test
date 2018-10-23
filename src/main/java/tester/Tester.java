package tester;

public class Tester {

	public void testDVD(DVDPlayer dvdPlayer){
		dvdPlayer.turnOn();
		dvdPlayer.play();
		dvdPlayer.stop();
		dvdPlayer.turnOff();	
	}
	
	public void testMP3(MP3Player mp3Player) {
		mp3Player.turnOn();
		mp3Player.play();
		mp3Player.stop();
		mp3Player.turnOff();	
	}
}
