package Rodent;
interface Rodent{
	private String name="Rodent";
	protected void eat(){System.out.println("Rodent.eat()");}
	protected void run(){System.out.println("Rodent.run()");}
	protected void sleep(){System.out.println("Rodent.sleep()");}
	public String toString(){
		return name;
	}
}
class Mouse implements Rodent{
	private String name="Mouse";
	protected void eat(){System.out.println("Mouse.eat()");}
	protected void run(){System.out.println("Mouse.run()");}
	protected void sleep(){System.out.println("Mouse.sleep()");}
	public String toString(){
		return name;
	}
}
class Rat implements Rodent{
	private String name="Rat";
	protected void eat(){System.out.println("Rat.eat()");}
	protected void run(){System.out.println("Rat.run()");}
	protected void sleep(){System.out.println("Rat.sleep()");}
	public String toString(){
		return name;
	}
}
class Squirrel implements Rodent{
	private String name="Squirrel";
	protected void eat(){System.out.println("Squirrel.eat()");}
	protected void run(){System.out.println("Squirrel.run()");}
	protected void sleep(){System.out.println("Squirrel.sleep()");}
	public String toString(){
		return name;
	}
}
public class Exercise7 {
	private static Randi  r=new Randi();
	public static void main(String[] args) {
		Rodent[] rodents=new Rodent[10];
		for(Rodent e:rodents){
			e=r.next();
			System.out.println(r+": ");
			e.eat();
			e.run();
			e.sleep();
		}
	}

}
