
public class Exercise11 {
	public static void main(String[] args) {
		int h=0x10000000;
		System.out.println("h= "+Integer.toBinaryString(h));
		for(int i=0;i<28;i++){
			h>>>=1;
		
		}
		System.out.println("h= "+Integer.toBinaryString(h));
	}

}
