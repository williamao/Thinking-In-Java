class Doc{
	Doc(int i){
		this("Say");
		System.out.println("i "+i);
	}
	Doc(String s){
		String some=s;
		System.out.println("some  "+some);
	}
	void eatF(){
		System.out.println("Fruit");
		taste();
	}
	 void taste() {
		 {System.out.println("Good");}
	}
}

public class Exercise9 {
	public static void main(String[] args) {
		new Doc(8).eatF();
	}
}
