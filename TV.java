
public class TV implements RemoteControl {

	int vol=0;
	boolean isPowerOn=false;

	@Override
	public boolean powerOnOff() {
		// TODO Auto-generated method stub
		if(isPowerOn==true)
		{
			isPowerOn=false;
		}
		else
		{
			isPowerOn=true;
		}
		return isPowerOn;
		
	}

	@Override
	public int volumeUp(int increment) {
		// TODO Auto-generated method stub
		if(isPowerOn==true)
		{
		this.vol+=increment;
		if(vol>=10)
		{
			System.out.println("MAX_SOUND Enter the volume within 0-10");
			vol-=increment;
		}
		}
		else
		{
		System.out.println("SwithOn the TV");
		}
		
		return vol;
		
	}

	@Override
	public int volumeDown(int decrement) {
		// TODO Auto-generated method stub
		if(isPowerOn==true)
		{
		this.vol-=decrement;
		if(vol<0)
		{
			System.out.println("MIN_SOUND Enter the volume within 0-10");
			this.vol+=decrement;
		}
		}
		else
		{
		System.out.println("SwithOn the TV");
		}
		
		return vol;
	}
		

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		if(isPowerOn==true)
		{
		System.out.println("TV is muted");
		this.vol=0;

	}
		else
		{
			System.out.println("SwithOn the TV");
		}
	}
}