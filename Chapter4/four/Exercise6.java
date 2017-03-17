package four;

public class Exercise6 {
	static int  test(int shu,int begin,int end){
		if(begin>end){
			System.out.println("错误");
			return 0;
		}
		else if (shu>(begin-1)&&shu<(end+1)) {
			System.out.println("在中间");	
			return +1;
		}
		else {
			System.out.println("不在");
			return -1;
		}
		
	}
	public static void main(String[] args) {
		test(6, 5, 9);
		test(2, 2, 2);
		test(9, 6, 2);
		test(44, 4, 9);
		test(9, 56, 3);
	}

}
