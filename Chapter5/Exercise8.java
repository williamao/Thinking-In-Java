class Person{
	void eat(){
		{System.out.println("GOOD");}
		fruit();
//		this.fruit();
	}
	
	void fruit(){
		{System.out.println("Bad");}
	}
}
public class Exercise8 {
	public static void main(String[] args) {
		new Person().eat();
	}

}
