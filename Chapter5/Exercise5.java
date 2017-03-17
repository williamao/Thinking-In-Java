
class Dog{
	void bark(){System.out.println("AAAA");}
	void bark(char a){System.out.println("BBBB "+a);}
	void bark(int i){System.out.println("CCCC "+i);}
	void bark(double d){System.out.println("DDDD "+d);}
	void bark(float f){System.out.println("EEEE "+f);}
}
public class Exercise5 {
	public static void main(String[] args) {
		Dog dog =new Dog();
		dog.bark();
		dog.bark('d');
		dog.bark(5);
		dog.bark(6.6);
		dog.bark(6.9f);
	}

}
