package Rodent;
class Characteristic{
	private String string;
	public Characteristic(String string) {
		this.string=string;
		System.out.println("Creating Characteristic "+string);
		// TODO Auto-generated constructor stub
	}
}
class Description{
	private String string;
	public Description(String string) {
	this.string=string;
	System.out.println("Creating Description "+string);
		// TODO Auto-generated constructor stub
	}
}
class Rodent12{
	private String name="Rodent";
	private Characteristic character=new Characteristic("has tail");
	private Description deprecated=new Description("small mammal");
	public Rodent12() {
		System.out.println("Rodent()");
		// TODO Auto-generated constructor stub
	}
	protected void eat(){System.out.println("Rodent.eat()");}
	protected void run(){System.out.println("Rodent.run()");}
	protected void sleep(){System.out.println("Rodent.sleep()");}
	public String toString(){
		return name;
	}
}
class Mouse12 extends Rodent12{
	private String name="Mouse";
	private Characteristic character=new Characteristic("likes Cheese");
	private Description deprecated=new Description("nocturnal");
	public Mouse12() {
		System.out.println("Rodent()");
		// TODO Auto-generated constructor stub
	}
	protected void eat(){System.out.println("Mouse.eat()");}
	protected void run(){System.out.println("Mouse.run()");}
	protected void sleep(){System.out.println("Mouse.sleep()");}
	public String toString(){
		return name;
	}
}
class Rat12 extends Rodent12{
	private String name="Rat";
	private Characteristic character=new Characteristic("larger");
	private Description deprecated=new Description("black");
	public Rat12() {
		System.out.println("Rodent()");
		// TODO Auto-generated constructor stub
	}
	protected void eat(){System.out.println("Rat.eat()");}
	protected void run(){System.out.println("Rat.run()");}
	protected void sleep(){System.out.println("Rat.sleep()");}
	public String toString(){
		return name;
	}
}
class Squirrel12 extends Rodent12{
	private String name="Squirrel";
	private Characteristic character=new Characteristic("climb trees");
	private Description deprecated=new Description("likes nuts");
	public Squirrel12() {
		System.out.println("Rodent()");
		// TODO Auto-generated constructor stub
	}
	protected void eat(){System.out.println("Squirrel.eat()");}
	protected void run(){System.out.println("Squirrel.run()");}
	protected void sleep(){System.out.println("Squirrel.sleep()");}
	public String toString(){
		return name;
	}
}
public class Exercise12 {
	private static Randi  r=new Randi();
	public static void main(String[] args) {
		Rodent12[] rodents=new Rodent12[10];
		for(Rodent12 e:rodents){
			e=r.next();
			System.out.println(r);
		}
	}

}
