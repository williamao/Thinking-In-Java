
class Test{
    String s1;
    String s2="hello";
    String s3;
    Test() {
    	s3="world";
	}
}
public class Exercise2 {
	public static void main(String[] args) {
	Test aTest=	new Test();
	System.out.println("aTest.s1  "+aTest.s1);
	System.out.println("aTest.s1  "+aTest.s2);
	System.out.println("aTest.s1  "+aTest.s3);
	}
}
