package Note;
class Instrument{
	void play(Note note){System.out.println("Instrument.paly()"+note);}
	public String toString(){return "Instrument";}
	void adjust(){System.out.println("Adjusting Instrument ");}
}
class Wind extends Instrument{
	void play(Note note){System.out.println("Wind.paly()"+note);}
	public String toString(){return "Wind";}
	void adjust(){System.out.println("Adjusting Wind ");}
}
class Percussion extends Instrument{
	void play(Note note){System.out.println("Percussion.paly()"+note);}
	public String toString(){return "Percussion";}
	void adjust(){System.out.println("Adjusting Percussion ");}
}
class Stringed extends Instrument{
	void play(Note note){System.out.println("Stringed.paly()"+note);}
	public String toString(){return "Stringed";}
	void adjust(){System.out.println("Adjusting Stringed ");}
}
class Brass extends Wind {
	void play(Note note){System.out.println("Brass.paly()"+note);}
	public String toString(){return "Brass";}
	void adjust(){System.out.println("Adjusting Brass ");}
}
class Woodwind extends Wind{
	void play(Note note){System.out.println("Woodwind.paly()"+note);}
	public String toString(){return "Woodwind";}

}
public class Exercise6 {
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
		                         new Brass(),new Woodwind()
	};
	tuneAll(instruments);
	for(Instrument i:instruments)
		System.out.println(i);
}
}
