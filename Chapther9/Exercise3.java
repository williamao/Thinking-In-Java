abstract class Dad{
	protected abstract void print();
	public Dad() {
	print();
		// TODO Auto-generated constructor stub
	}
}
class Son extends Dad{
	private int i =1;
	@Override protected void print() {
		System.out.println("Son.i"+i);
	}
}
public class Exercise3 {
	public static void main(String[] args) {
		Son son=new Son();
		son.print();
	}

}
