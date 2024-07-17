class SpeakerRun{

	public static void main(String s[]){
	System.out.println("main started");
	Speaker.btConnected();
	
	SpeakerConnect.btNotConnected();
	Volume.increaseVolume();
	Volume.decreaseVolume();
	
	System.out.println("main ended");
	
	}
}