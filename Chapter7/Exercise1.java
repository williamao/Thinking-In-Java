class Engine{
	private String string;
	Engine() {
		System.out.println("Engine()");
		string="Constructed";
	}
	public String toString(){return string;}
}
public class Exercise1 {
	private String fuselage,wings,tail;
	private Engine engine;
	public Exercise1(){
		System.out.println("Inside Ariplane");
		fuselage="Body";
		wings="Airfoils";
		tail="Empennage";
	}
	public String toString() {
		if (engine==null) 
			engine=new Engine();
		return "fuselage="+fuselage+", "+"wings "+wings+", "+"tail "+tail+","+"engine "+engine;
	}
	public static void main(String[] args) {
		Exercise1 ss=new Exercise1();
		System.out.println(ss);
	}

}
