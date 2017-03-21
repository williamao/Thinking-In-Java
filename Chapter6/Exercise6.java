
class Somedata {
	public int  a=13;

}
class DataChange{
	static void change(Somedata dSomedata,int i){
		dSomedata.a=i;
	}
}
public class Exercise6 {
	public static void main(String[] args) {
		Somedata somedata=new Somedata();
		System.out.println(somedata.a);
		DataChange.change(somedata,99);
		System.out.println(somedata.a);
	}

}
