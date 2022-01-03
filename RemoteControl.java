
interface RemoteControl {

	abstract boolean powerOnOff(); // Returns new state, on = true
	abstract int volumeUp(int increment); // Returns new volume level
	abstract int volumeDown(int decrement); // Returns new volume level
	abstract void mute(); // Mutes sound output
}
