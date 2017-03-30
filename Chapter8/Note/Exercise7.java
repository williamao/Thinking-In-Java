package Note;
class Keyboard extends Instrument{
	void play(Note note){System.out.println("Keyboard.paly()"+note);}
	public String toString(){return "Keyboard";}
	void adjust(){System.out.println("Adjusting Keyboard ");}
}
class Piano extends Keyboard{
	void play(Note note){System.out.println("Piano.paly()"+note);}
	public String toString(){return "Piano";}
}
public class Exercise7 {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	private static void tuneAll(Instrument[] instruments) {
		for(Instrument i:instruments){
			tune(i);
		}
	}
	public static void main(String[] args) {
		Instrument[] instruments={new Wind(),new Percussion(),new Stringed(),
		                         new Brass(),new Woodwind(),new Piano()
	};
	tuneAll(instruments);
	for(Instrument i:instruments)
		System.out.println(i);

}
}
