class Dog2{
	void bark(){System.out.println("AAAA");}
	void bark(char a){System.out.println("BBBB "+a);}
	void bark(int i){System.out.println("CCCC "+i);}
	void bark(double d){System.out.println("DDDD "+d);}
	void bark(float f){System.out.println("EEEE "+f);}
	void bark(char c,int a){System.out.println("FFFF "+c +" "+a);}
	void bark(int a,char c){System.out.println("GGGG "+a+" "+c);}
	
}
public class Exercise6 {
	public static void main(String[] args) {
		Dog2 dog =new Dog2();
		char a='a';
		dog.bark();
		dog.bark(a);
		dog.bark(5);
		dog.bark(6.6);
		dog.bark(6.9f);
		dog.bark(a,5);
		dog.bark(5,a);
	}

}
