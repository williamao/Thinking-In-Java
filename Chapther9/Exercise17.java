interface Days{
	int SUNDAY=1,MONDAY=2,TUESDAY=3,WENDEDDAY=4,
			THURSDAY=5,FRIDAY=6,SATURDAT=7;
}
class Week implements Days{
	private static int count=0;
	private int id=count++;
	public Week(){System.out.println("Week() "+id);}
}
public class Exercise17 {
	public static void main(String[] args) {
		System.out.println("Sunday() "+Days.SUNDAY);
		System.out.println("Monday() "+Days.MONDAY);
		Week week=new Week();
		Week week2=new Week();
	}

}
