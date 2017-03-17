
public class Exercise14 {
	static void f(boolean b){
		if(b==true){
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	static void StringTest(String i,String j){
		f(i==j);
		f(i.equals(j));
		f(j.equals(i));
		f(i!=j);
	}
	public static void main(String[] args) {
		String string1="fw" ,string2="fg";
		StringTest(string1, string2);
	}
}


