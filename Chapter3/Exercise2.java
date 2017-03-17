class Foll{
	float some;
}
public class Exercise2 {
  public static void main(String[] args) {
	 Foll f1=new Foll();
	 Foll f2=new Foll();
	 f1.some=3.5f;
	 
	 f2.some=6.7f;
	 System.out.println("f1.some="+f1.some+"   f1.some="+f2.some);
//	 f1.some=f2.some;
//	 System.out.println("f1.some="+f1.some+"   f1.some="+f2.some);
	 f1=f2;
     System.out.println("f1.some="+f1.some+"   f1.some="+f2.some);
  }
}
