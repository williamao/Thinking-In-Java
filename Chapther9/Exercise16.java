import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class Exercise16 extends RandomChars implements Readable{
	private int count;
	public Exercise16(int count){
		this.count=count;
	}
	public int read(CharBuffer charBuffer){
		if (count--==0) {return-1;}
		String result=Character.toString(next())+" ";
        charBuffer.append(result);
        return result.length();
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new Exercise16(10));
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
			
		}
	}
}
