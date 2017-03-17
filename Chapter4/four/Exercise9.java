package four;
public class Exercise9 {
	int FF(int i){
		if(i<2) return 1;
		else {
			return FF(i-2)+FF(i-1);
		}
	}
	public static void main(String[] args) {
		Exercise9 first=new Exercise9();
		int j=5;
		System.out.println("Êý×ÖÊÇ"+j);
		for(int i=0;i<j;i++){
			System.out.println(first.FF(i));
		}
		
	}
}
