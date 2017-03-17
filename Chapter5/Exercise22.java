
public class Exercise22 {
	public enum Bills{
		ONE ,FIVE,TEN,TWENTY,FIFTY,HUNDERD
	}
	Bills b;
 public static void main(String[] args) {
	for(Bills b:Bills.values()){
		 System.out.println("×ª»»");
		 switch (b) {
		case ONE:
			System.out.println("$1");
			break;
        case FIVE:
        	System.out.println("$5");
			break;	
        case TEN:
			System.out.println("$10");
			break;
        case FIFTY:
        	System.out.println("$50");
        	break;
        case HUNDERD:
			System.out.println("$100");
			break;
		default:
			break;
		}
	}
}
}
