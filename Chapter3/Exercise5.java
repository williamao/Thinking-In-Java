class Dog{
	String name;
	String says;
}
public class Exercise5 {
	public static void main(String[] args) {
		Dog spot=new Dog();
		Dog scruffy=new Dog();
		spot.name="spot";
		scruffy.name="scruffy";
		spot.says="Ruff!";
		scruffy.says="Wurf!";
		System.out.println("spot:name  "+spot.name+", says  "+spot.says);
		System.out.println("scruffy:name  "+scruffy.name+", says  "+scruffy.says);
	}

}
