package four;
import java.io.IOException;

public class Exercise4 {
	public static void main(String[] args) throws IOException {
		for(int i=0;i<100;i++){
			int count=0;
			for(int j=1;j<(i+2)/2;j++){
				if (i%j==0) {
					count++;
				}
			}
			if (count<2) {
				 System.out.println(i+"������");
				
			}
		}
	}
	

}
