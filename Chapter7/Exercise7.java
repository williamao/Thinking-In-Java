class A7{
	A7(char c,int i){
		System.out.println("A7(char c,int i)");
		}
	}
class B7 extends A7{
	B7(String s,float f){
		super(' ', 0);
		System.out.println("B7(String s,float f)");
	}
}
public class Exercise7 extends A7{
	Exercise7(char c, int i) {
		super(c, i);
		// TODO Auto-generated constructor stub
	}
	B7 b=new B7("hi",1f);
	public static void main(String[] args) {
		new Exercise7('b',6);
	}

}
