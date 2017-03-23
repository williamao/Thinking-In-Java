class Component10{
	public Component10(byte b) {
		System.out.println("Component10(byte)");
		// TODO Auto-generated constructor stub
	}
}
class Component20{
	public Component20(short s) {
		System.out.println("Component20(short)");
		// TODO Auto-generated constructor stub
	}
}
class Component30{
	public Component30(int i) {
		System.out.println("Component30(int)");
		// TODO Auto-generated constructor stub
	}
}
class Root1{
	Component10 component10;
	Component20 component20;
	Component30 component30;
	public Root1(float f) {
		component10=new Component10((byte)0);
		component20 =new Component20((short)0);
		component30=new Component30(0);
		System.out.println("Root1()");
		// TODO Auto-generated constructor stub
	}
}
public class Exercise10 extends Root1{
	Component10 component110;
	Component20 component220;
	Component30 component330;
	public Exercise10(double d) {
		super(2.78f);
		component110=new Component10((byte)1);
		component220=new Component20((short)1);
		component330=new Component30(1);
		System.out.println("999(double)");
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Exercise10 sExericse10=new Exercise10(2.78);
	}

}
