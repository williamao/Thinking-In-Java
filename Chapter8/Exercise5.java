
class Cycle5{
	private String name="Cycle5";
	private int whells=0;
	public static void  travel(Cycle5 cycle5) {
		System.out.println("Cycle5.ride  "+cycle5);
	}
	public int whells(){return whells;}
	public String toString() {
		return this.name;
	}
}
class UniCycle5 extends Cycle5{
	private String name="Unicycle5";
	private int whells=1;
	public int whells(){return whells;}
	public String toString(){
		return this.name;
	}
}
class Bicycle5 extends Cycle5{
	private String name="BicyCycle5";
	private int whells=2;
	public int whells(){return whells;}
	public String toString() {
		return this.name;
	}
}
class Tricycle5 extends Cycle5{
	private String name="Tricycle5";
	private int whells=3;
	public int whells(){return whells;}
	public String toString() {
		return this.name;
		
	}
}
public class Exercise5 {
	public static void ride(Cycle5 cycle5){
		Cycle5.travel(cycle5);
	    System.out.println("Whells"+cycle5.whells());
	}
	public static void main(String[] args) {
		UniCycle5 uniCycle5=new UniCycle5();
		Bicycle5 bicycle5=new Bicycle5();
		Tricycle5 tricycle5=new Tricycle5();
		ride(tricycle5);
		ride(bicycle5);
		ride(uniCycle5);
	}

}
