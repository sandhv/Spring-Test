package tester;

public class Tester {

    private Device device;
	
	public void test() {
		
		device.turnOn();
		device.play();
		device.stop();
		device.turnOff();
	}

	public void setDevice(Device device) {
		this.device=device;
		
		
	}
}
