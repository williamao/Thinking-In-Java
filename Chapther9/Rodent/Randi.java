package Rodent;
import java.util.Random;
public class Randi {
	private Random random=new Random();
	public Rodent next(){
		switch (random.nextInt(3)) {
		default:
		case 0: return new Mouse();
		case 1: return new Rat();
		case 2: return new Squirrel();
	
		}
	}

}