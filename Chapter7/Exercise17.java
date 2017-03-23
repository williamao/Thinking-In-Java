class Amphibian17{
	protected void swim(){
		System.out.println("Swim");
	}
	protected void speak(){
		System.out.println("Speak");
	}
	void eat(){
		System.out.println("eat");
	}
	static void grow(Amphibian17 amphibian){
		System.out.println("Amphibian");
		amphibian.eat();
	}
}
public class Exercise17 extends Amphibian17{
	@Override protected void swim(){
		System.out.println("Forg Swim");
	}
	@Override protected void speak(){
		System.out.println("Forg Speak");
	}
	@Override void eat(){
		System.out.println("Forg eat");
	}
	static void grow(Amphibian17 amphibian){
		System.out.println("Forg Amphibian");
		amphibian.eat();
	}
	public static void main(String[] args) {
		Exercise17 exercise17=new Exercise17();
		exercise17.swim();
		exercise17.speak();
		exercise17.eat();
		exercise17.grow(exercise17);
		Amphibian17.grow(exercise17);
	}

}
