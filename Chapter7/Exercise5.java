class Aa{
	Aa(){
		System.out.println("Aa()");
		}
	}
class Ba extends Aa{
	Ba(){
		System.out.println("Ba()");
	}
}
public class Exercise5 extends Aa{
	Ba ba=new Ba();
	public static void main(String[] args) {
		new Exercise5();
	}

}
