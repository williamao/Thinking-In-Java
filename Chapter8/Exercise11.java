class Meal{
	public Meal() {
		System.out.println("Meal()");
		// TODO Auto-generated constructor stub
	}
}
class Bread{
	public Bread() {
		System.out.println("Bread()");
		// TODO Auto-generated constructor stub
	}
}
class Cheese{
	public Cheese() {
		System.out.println("Cheese()");
		// TODO Auto-generated constructor stub
	}
}
class Lettuce {
	public Lettuce() {
	System.out.println("Lettuce()");
	// TODO Auto-generated constructor stub
     }
}
class Pickle{
	public Pickle() {
		System.out.println("Pickle()");
		// TODO Auto-generated constructor stub
	}
}
class Lunch extends Meal{
	public Lunch() {
		System.out.println("Lunch()");
		// TODO Auto-generated constructor stub
	}
}
class ProtableLunch extends Lunch{
	public ProtableLunch() {
		System.out.println("ProtableLunch()");
		// TODO Auto-generated constructor stub
	}
}
public class Exercise11 extends ProtableLunch{
	private Bread bread=new Bread();
	private Cheese cheese=new Cheese();
	private Pickle pickle=new Pickle();
	private Lunch lunch=new Lunch();
	public Exercise11(){
		System.out.println("Exercise11()");
	}
	public static void main(String[] args) {
		new Exercise11();
	}
}
