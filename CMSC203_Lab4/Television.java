/** 
*The purpose of this class is to model a television
*Brad Reynoso
*/

public class Television {

	//manufacturers name
	static String MANUFACTURER;
	//size of tv screen 
	static int SCREEN_SIZE;
	//Holds true/false whether tv is on or off
	Boolean powerOn;
	//holds channel value
	int channel;
	//holds volume number
	int volume;
	
	//the purpose of this constuctor is to set the variables correctly when an instance of this class is created
	public Television(String man, int screenS) {
		MANUFACTURER = man;
		SCREEN_SIZE = screenS;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	
	//accessors
	public int getVolume() {
		return volume;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
	//Mutators
	public void setChannel(int chan) {
		channel = chan;
	}
	
	public void power() {
		powerOn = !powerOn;
	}
	
	public void increaseVolume() {
		volume += 1;
	}
	
	public void decreaseVolume() {
		volume -= 1;
	}
	


}
