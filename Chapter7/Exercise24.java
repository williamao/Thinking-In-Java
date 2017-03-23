class Insect{
	private int i=9;
	protected int j;
	public Insect() {
		System.out.println("i="+i+", j="+j);
		j=39;
		// TODO Auto-generated constructor stub
	}
	private static int x1=printInit("static Insect.x1 init");
	static int  printInit(String string) {
		System.out.println(string);
		return 47;
	}
}
class Beetlr extends Insect{
	private int  k=printInit("Bettle.k init");
	public Beetlr(){
		System.out.println("K= "+k);
		System.out.println("j="+j);
	}
	private static int x2=printInit("static Bettlr.x2 init");
}
public class Exercise24 extends Beetlr{
	private int n=printInit("EX24.n init");
	public Exercise24(){
		System.out.println("n="+n); 
	    System.out.println("j="+j);
	}
	private static int x3=printInit("statil EX24.X3 INIT");
	public static void main(String[] args) {
		System.out.println("Construct");
		Exercise24 exercise24=new Exercise24();
	}

}
