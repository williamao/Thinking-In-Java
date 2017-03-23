
class ThreeWay{
	void number(byte b){System.out.println(b);}
	void number(short s){System.out.println(s);}
	void number(int i){System.out.println(i);}
}
public class Exercise13 extends ThreeWay{
      void number(float f){System.out.println(f);}
      public static void main(String[] args) {
		Exercise13 exercise13=new Exercise13();
		exercise13.number((byte)1);
		exercise13.number((short)6);
		exercise13.number(2);
		exercise13.number(3.0f);
	}
}
