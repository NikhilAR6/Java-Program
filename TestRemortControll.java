
public class TestRemortControll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoteControl tv = new TV();
		tv.powerOnOff();
		int no=tv.volumeUp(1);
		 no=tv.volumeUp(1);
		System.out.println(no);
		tv.powerOnOff();
		no=tv.volumeUp(1);
	    tv.mute();
        tv.powerOnOff();
	    tv.mute();
	}

}
