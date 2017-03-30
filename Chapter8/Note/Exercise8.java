package Note;

public class Exercise8 {

	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	private static void tuneAll(Instrument[] instruments) {
		for(Instrument i:instruments){
			tune(i);
		}
	}
	private static Randi randi=new Randi();
	public static void main(String[] args) {
	Instrument[] instruments=new Instrument[20];
	for(int i=0;i<instruments.length;i++){
		instruments[i]=randi.next();
	}		
	tuneAll(instruments);
	for(Instrument i:instruments)
		System.out.println(i);

}
}
