
public class Exercise21 {

	public enum Bills{
		ONE ,FIVE,TEN,TWENTY,FIFTY,HUNDERD
	}
   public static void main(String[] args) {
	   for(Bills bills:Bills.values()){
		   System.out.println(bills+",ordinal   "+bills.ordinal());
	   }
    }
}
