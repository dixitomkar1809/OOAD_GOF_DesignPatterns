public class TestTheRemote{
	
	public static void main(String[] args){

		TVDevice Tv1 = new TVDevice(1, 200);
		TVDevice Tv2 = new TVDevice(1, 200);
//		RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));
		RemoteButton theTV = new TVRemoteMute(Tv1);
//		RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));
		RemoteButton theTV2 = new TVRemotePause(Tv2);
		
//		RemoteButton theDVD = new DVDRemote(new DVDDevice(1,14));
		
		System.out.println("Test TV with Mute");
		
		theTV.buttonFivePressed();
		theTV.buttonSixPressed();
		theTV.buttonNinePressed();
		theTV.deviceFeedback();
		
		System.out.println("\nTest TV with Pause");
		
		theTV2.buttonFivePressed();
		theTV2.buttonSixPressed();
		theTV2.buttonNinePressed();
		theTV2.deviceFeedback();
		
//		System.out.println("\nTest DVD");
//		
//		theDVD.buttonFivePressed();
//		theDVD.buttonSixPressed();
//		theDVD.buttonNinePressed();
//		theDVD.buttonNinePressed();
		
	}
	
}