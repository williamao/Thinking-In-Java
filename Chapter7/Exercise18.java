import java.util.Random;

class Test{
	Test(){
		System.out.println("Test()");
	}
}
public class Exercise18 {
	private String name;
	public Exercise18(String s){name=s;}
	static final Test stf=new Test();
	private final Test fTest=new Test();
	static final String SFS="Statilc fianl";
	private final String fS="final";
	private static Random rand=new Random();
	static final int SFI=rand.nextInt();
	private final int fi=rand.nextInt();
	public String toString(){
		return(name+":"+stf+" ,"+fTest+" "+SFS+" "+fS+" "+SFI+" "+fi);
	}
	public static void main(String[] args) {
		Exercise18 exercise18=new Exercise18("ss");
		Exercise18 exercise182=new Exercise18("ss2");
		Exercise18 exercise183=new  Exercise18("ss3");
		System.out.println(exercise18);
		System.out.println(exercise182);
		System.out.println(exercise183);
	}

}
