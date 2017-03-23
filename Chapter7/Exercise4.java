class A{
	A(){System.out.println("A()");}
}
class B extends A{
	B() {System.out.println("B()");}
}
class C extends B{
    C() {System.out.println("C()");}
}
class D extends C{
	D() { System.out.println("D()"); }
	public static D makeD() { return new D(); }
	public static void main(String[] args) {
		D d = new D();
		D d2 = makeD();
	}
}
public class Exercise4 extends D{
	Exercise4() { System.out.println("f()");} 
	public static void main(String[] args) {
		Exercise4 e = new Exercise4();
		// test D:
		D.main(args);
	}
}
