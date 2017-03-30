import java.util.Random;

public class RandomChars {
	private static Random rand=new Random ();
	public char next(){
		return (char)rand.nextInt(128);
	}
	public static void main(String[] args) {
		RandomChars rChars=new RandomChars();
		for (int i=0;i<10;i++){
			System.out.print(rChars.next()+" ");
		}
	}

}
