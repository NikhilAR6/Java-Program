
public class TestInstrument {

	public static void main(String[] args)
	{
		Instrument[] instrument = new Instrument[10];
		
		instrument[0] = new Piano();
		instrument[1] = new Flute();
		instrument[2] = new Guitar();
		instrument[3] = new Flute();
		instrument[4] = new Piano();
		instrument[5] = new Flute();
		instrument[6] = new Piano();
		instrument[7] = new Guitar();
		instrument[8] = new Piano();
		instrument[9] = new Guitar();
		
		for(int i=0; i<instrument.length;i++) {
			instrument[i].play();
		}
	}
}
