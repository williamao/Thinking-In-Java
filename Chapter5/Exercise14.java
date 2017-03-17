class Go{
	static String s1="run";
	static String s2,s3;
	static{s2="driver car";
	s3="fly";
	System.out.println(s2+" "+s3);
	}
	static void how(){
		System.out.println(s1+"  or  " +s2+"  or  "+s3);
	}
	public Go() {
		System.out.println("GO");
		// TODO Auto-generated constructor stub
	}
}
public class Exercise14 {
	public static void main(String[] args) {
		System.out.println("¿ªÊ¼");
		Go.how();
		System.out.println("Go "+Go.s1);
	}
	static Go go=new Go();
	static Go go2 =new Go();

}
