package tester;

public class MainPlayer {
	public static void main(String[] args) {
		
		Tester tester = new Tester();
		DVDPlayer dvdPlayer = new DVDPlayer();
		MP3Player mp3Player = new MP3Player();
		
		
		tester.testDVD(dvdPlayer);		
		tester.testMP3(mp3Player);
		
		
	}

}

