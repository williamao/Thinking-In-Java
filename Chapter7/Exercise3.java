
class Art{
	Art(){System.out.println("Art()");}
}
class Drawing extends Art{
	Drawing() {
		System.out.println("Drawing()");
	}
}
public class Exercise3 extends Drawing{
	public static void main(String[] args) {
		new Exercise3();
	}

}
