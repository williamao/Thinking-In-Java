
class Cycle{
	private String name="Cycle";
	public static void  travel(Cycle cycle) {
		System.out.println("Cycle.ride  "+cycle);
	}
	public String toString() {
		return this.name;
	}
}
class UniCycle extends Cycle{
	private String name="Unicycle";
	public String toString(){
		return this.name;
	}
}
class Bicycle extends Cycle{
	private String name="BicyCycle";
	public String toString() {
		return this.name;
	}
}
class Tricycle extends Cycle{
	private String name="Tricycle";
	public String toString() {
		return this.name;
		
	}
}
public class Exercise1 {
	public static void ride(Cycle cycle){
		Cycle.travel(cycle);
	}
	public static void main(String[] args) {
		UniCycle uniCycle=new UniCycle();
		Bicycle bicycle=new Bicycle();
		Tricycle tricycle=new Tricycle();
		ride(tricycle);
		ride(bicycle);
		ride(uniCycle);
	}

}
