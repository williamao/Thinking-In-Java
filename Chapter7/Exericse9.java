class Component1{
	public Component1() {
		System.out.println("Component1()");
		// TODO Auto-generated constructor stub
	}
}
class Component2{
	public Component2() {
		System.out.println("Component2()");
		// TODO Auto-generated constructor stub
	}
}
class Component3{
	public Component3() {
		System.out.println("Component3()");
		// TODO Auto-generated constructor stub
	}
}
class Root{
	Component1 component1;
	Component2 component2;
	Component3 component3;
	public Root() {
		component1=new Component1();
		component2 =new Component2();
		component3=new Component3();
		System.out.println("Root()");
		// TODO Auto-generated constructor stub
	}
}
public class Exericse9 extends Root{
	Component1 component11;
	Component2 component22;
	Component3 component33;
	public Exericse9() {
		System.out.println("999()");
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Exericse9 sExericse9=new Exericse9();
	}

}
