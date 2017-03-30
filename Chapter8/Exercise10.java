class A{
	protected void f(){
		System.out.println("A.f()");
	}
	protected void g(){
		System.out.println("A.g()");
	}
}
class B extends A{
	@Override protected void g(){
		System.out.println("B.g()");
	}
}

public class Exercise10 {
	public static void main(String[] args) {
		B b=new B();
		b.f();
		b.g();
	}
}
