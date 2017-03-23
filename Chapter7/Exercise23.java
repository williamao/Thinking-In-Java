class A23{
	static int j=printInit("A.j initialized");
	static int printInit(String string){
		System.out.println(string);
		return 1;
	}
	A23(){System.out.println("A23");}
}
class B23 extends A23{
	static int k=printInit("B.k initialized");
	public B23() {
		{System.out.println("B23");}
		// TODO Auto-generated constructor stub
	}
}
class C23{
	static int n=printInit("C.n initialized");
	static A23 a23=new A23();
	public C23() {
		System.out.println("C23");
		// TODO Auto-generated constructor stub
	}
	static int printInit(String string){
		System.out.println(string);
		return 1;
	}
}
class D23{
	public D23() {System.out.println("D23");
		// TODO Auto-generated constructor stub
	}
}
public class Exercise23 extends B23{
	static int i=printInit("EXERcise23.i initialized");
	public Exercise23() {
		System.out.println("Exercise23()");
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.out.println("ok!");
		Exercise23 exercise23= new Exercise23();
		System.out.println(C23.a23);
		D23 d23=new D23();
	}

}
