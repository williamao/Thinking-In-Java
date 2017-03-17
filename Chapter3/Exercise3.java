
class Ad{
	float s;
}

public class Exercise3 {
   static void f(Ad y){
	 y.s=3.6f;
   }
   public static void main(String[] args) {
	Ad x=new Ad();
	x.s=4.9f;
	System.out.println("1 x.s="+x.s);
	f(x);
	System.out.println("2 x.s="+x.s);
	
}
}
