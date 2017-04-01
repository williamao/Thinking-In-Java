abstract class SecendDad{
	abstract protected void print();
}
class SencendSon extends SecendDad{
	protected void print(){
		System.out.println("Secnedson");
	}
}
public class Exercise4 {
	public static void testprint(Dad dad) {
       ((Son)dad).print();
 	}
	public static void secendTestPrint(SecendDad dSecendDad) {
		dSecendDad.print();
	}
	public static void main(String[] args) {
		Son son=new Son();
		Exercise4.testprint(son);
		SencendSon sencendSon=new SencendSon();
		Exercise4.secendTestPrint(sencendSon);
	}

}
