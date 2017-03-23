class WithFinals{
	private final void f() {
		System.out.println("WithFianls.f()");
	}
	private void g() {
		System.out.println("WithFinals.g()");
	}
}
class OverridingPrivate extends WithFinals{
	private final void f(){System.out.println("OverridingPrivate.F");}
	private void  g() {System.out.println("OverridingPrivate.G");
		
	}
}
class OveridingPrivate2 extends OverridingPrivate{
	public final void f() {
		System.out.println("OverridingPrivate22.F");
	}
	public void  g() {
		System.out.println("OverridingPrivate22.G");
		
	}
}
public class Exercise20 {
	public static void main(String[] args) {
		OveridingPrivate2 overidingPrivate2=new OveridingPrivate2();
		overidingPrivate2.f();
		overidingPrivate2.g();
		OverridingPrivate overridingPrivate=overidingPrivate2;
		WithFinals withFinals=overidingPrivate2;
	}

}
