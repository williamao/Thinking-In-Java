
public class Exercise19 {
	static void showString(String...args){
		for(String string:args)
			System.out.print("   s   "+string);
		System.out.println();
	}
public static void main(String[] args) {
	showString("one","two","three","four");
	showString(new String[]{"1","2","3","4"});
}
}
