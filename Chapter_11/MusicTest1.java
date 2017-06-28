import javax.sound.midi.*;
public class MusicTest1 {

	public void play() {

		try {
			Sequencer seqencer = MidiSystem.getSequencer();
			System.out.println("Successfully got a sequencer");
			
		} catch(MidiUnavailableException ex) {
			System.out.print("Bummer");
		}
	} // close play

	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.play();
	} // close main
} // close class