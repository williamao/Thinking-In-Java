interface FastFood{
	void cheeseburger();
	void fries();
	void softDrink();
}
class Meal{
	public Meal() {
	System.out.println("Meal()");
		// TODO Auto-generated constructor stub
	}
}
class Bread{
	public Bread() {
	System.out.println("Break()");
		// TODO Auto-generated constructor stub
	}
}
class Cheese{
	public Cheese() {
	System.out.println("Cheese()");
		// TODO Auto-generated constructor stub
	}
}
class Lettuce{
	public Lettuce() {
	System.out.println("Letuce()");
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
	System.err.println("ProtableLunch()");
		// TODO Auto-generated constructor stub
	}
}
public class Exercise8 extends ProtableLunch{
	private Bread bread=new Bread();
	private Cheese cheese=new Cheese();
	private Lunch lunch=new Lunch();
	public Exercise8(){
		System.out.println("Exercise8()");
	}
	public void cheesburger(){
		System.out.println("Cherrsburger()");
	}
	public void frise(){
		System.out.println("Frise()");
	}
	public void softDrink(){
		System.out.println("Soft Drink");
	}
	public static void main(String[] args) {
		Exercise8 exercise8=new Exercise8();
		exercise8.cheesburger();
		exercise8.frise();
		exercise8.softDrink();
	}
}

