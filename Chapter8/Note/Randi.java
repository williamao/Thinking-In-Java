package Note;
import java.util.Random;
public class Randi {
	private Random random=new Random();
	public Instrument next(){
		switch (random.nextInt(7)) {
		default:
		case 0: return new Wind();
		case 1: return new Percussion();
		case 2: return new Stringed();
		case 3: return new Keyboard();
		case 4: return new Brass();
		case 5: return new Woodwind();
		case 6: return new Piano();
		}
	}
}
