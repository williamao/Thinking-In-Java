package Shape;
import java.util.Random;
public class RandomShapeGenerator{
	private Random random=new Random();
	public Shape next(){
		switch (random.nextInt(4)) {
		default:
		case 0: return new Cycle();
		case 1: return new Square();
		case 2: return new Triangel();
		case 3: return new Rectangle();
		}
	}
}