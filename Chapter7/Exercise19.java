class Poppet{
	private int i;
	Poppet(int i){this.i=i;}
	public String toString(){
		return ("Poppet  "+i);
	}
}
public class Exercise19 {
	private final Poppet poppet;
	public Exercise19(){
		poppet=new Poppet(1);
	}
	public Exercise19(int i){
		poppet=new Poppet(i);
	}
	public static void main(String[] args) {
		Exercise19 exercise19=new Exercise19();
		Exercise19 exercise192=new Exercise19(14);
//	    exercise19.poppet=new Poppet(2);
//	    exercise192.poppet=new Poppet(3);
	    System.out.println(exercise19.poppet);
	    System.out.println(exercise192.poppet);
	}
}
