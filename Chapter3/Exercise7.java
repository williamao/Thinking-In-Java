import java.util.Random;

public class Exercise7 {
	public static void main(String[] args) {
		Random random=new Random();
		int coin=random.nextInt();
		if(coin%2==0){
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
	}
}
