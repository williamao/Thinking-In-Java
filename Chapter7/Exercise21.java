class WithFinal{
	final void f() {
		System.out.println("WithFianl.f()");
	}
	void g() {
		System.out.println("WithFinal.g()");
	}
	void h(){
		System.out.println("WithFinal.h()");
	}
}
class OverrideFinal extends WithFinal{
	public void g(){
		System.out.println("OverrideFinal.g()");
	}
}
public class Exercise21 {
	public static void main(String[] args) {
		OverrideFinal overrideFinal=new OverrideFinal();
		overrideFinal.f();
		overrideFinal.g();
		overrideFinal.h();
		WithFinal withFinals=overrideFinal;
		withFinals.f();
		withFinals.g();
		withFinals.h();
	}

}
