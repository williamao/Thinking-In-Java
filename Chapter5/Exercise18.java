class Qtest2{
    Qtest2(String s){
	    System.out.println("TESTF");
	    System.out.println(s);
     }
}

public class Exercise18 {
	public static void main(String[] args) {
			Qtest2[] it =new Qtest2[10]; 
			for (int i=0;i<it.length;i++){
				it[i]=new Qtest2(Integer.toString(i));
			}
 	}
}
