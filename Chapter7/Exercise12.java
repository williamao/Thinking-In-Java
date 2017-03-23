class Component12{
	public Component12() {
		System.out.println("Component12()");}
		void dispose(){System.out.println("Component12.dispose()");}
}
class Component22{
	public Component22() {
		System.out.println("Component22()");
		// TODO Auto-generated constructor stub
	}
	void dispose(){System.out.println("Component22.dispose()");}
}
class Component32{
	public Component32() {
		System.out.println("Component32()");
		// TODO Auto-generated constructor stub
	}
	void dispose(){System.out.println("Component32.dispose()");}
}
class Root12{
	Component12 component12;
	Component22 component22;
	Component32 component32;
	public Root12() {
		component12=new Component12();
		component22 =new Component22();
		component32=new Component32();
		System.out.println("Root12()");
		// TODO Auto-generated constructor stub
	}
	void dispose(){
		component12.dispose();
		component22.dispose();
		component32.dispose();
		System.out.println("Root12.dispoae()");
	}
}
public class Exercise12 extends Root12{
	Component12 component122;
	Component22 component222;
	Component32 component332;
	public Exercise12() {
		super();
		System.out.println("Ex2()");
		component122=new Component12();
		component222=new Component22();
		component332=new Component32();
		// TODO Auto-generated constructor stub
	}
	void dispose(){
		component122.dispose();
		component222.dispose();
		component332.dispose();
		System.out.println("Ex2.dispose()");
	}
	public static void main(String[] args) {
		Exercise12 sExericse12=new Exercise12();
		sExericse12.dispose();
	}

}
