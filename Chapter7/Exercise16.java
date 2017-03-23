class Amphibian{
	protected void swim(){
		System.out.println("Swim");
	}
	protected void speak(){
		System.out.println("Speak");
	}
	void eat(){
		System.out.println("eat");
	}
	static void grow(Amphibian amphibian){
		System.out.println("Amphibian");
		amphibian.eat();
	}
}
public class Exercise16 extends Amphibian{
	public static void main(String[] args) {
		Exercise16 exercise16=new Exercise16();
		exercise16.swim();
		exercise16.speak();
		exercise16.eat();
		Amphibian.grow(exercise16);
	}

}
