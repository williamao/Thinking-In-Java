class A8{
	public A8(char c,int i) {
		System.out.println("A8£¨char c,int i£©");
		// TODO Auto-generated constructor stub
	}
}
public class Exercise8 extends A8{
   public Exercise8() {
	   super('p', 5);
	   System.out.println("e8()");
	// TODO Auto-generated constructor stub
}
	public Exercise8(char c, int i) {
		super(c, i);
		System.out.println("e8(char c,int i)");
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Exercise8 exercise8=new Exercise8();
		Exercise8  ex=new Exercise8('B',6);
	}
	

}
