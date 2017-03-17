class Cup{

	Cup(int i){
		System.out.println("Cup"+i);
	}
	void f(int j){
		System.out.println("f()"+j);
	}
}
class Cups{
	static Cup cup;
	static Cup cup2;
	static {cup=new Cup(1);
	cup2=new Cup(2);
	}
	public Cups() {
		// TODO Auto-generated constructor stub
		System.out.println("Cup£¨£©");
	}
}
public class Exercise13 {
	public static void main(String[] args) {
		System.out.println("¿ªÊ¼");
//		Cups.cup.f(2);
	}
   static Cups cups=new Cups();
   static Cups cups2=new Cups();
}
