class Cleanser{
	private String s="  Cleanser  ";
	public void append(String a) {s+=a;}
    public void dilute() {append("  dilute()  ");}
	public void apply() {
		append("  apply()  ");
	}
	public void scrub() {
		append("  scrub()  ");
	}
	public String toString() { return s; }
	public static void main(String[] args) {
		Cleanser x=new Cleanser();
		System.out.println(x);
	}
}
public class Exercise11 {
	private String string="  DetergentDelegation  ";
	Cleanser cleanser=new Cleanser();
	public void append(String a) {string+=a;}
    public void dilute() {cleanser.dilute();}
    public void apply() {cleanser.apply();		
	}
    public void scrub() {append("  detergenDelegatin.scrub  ");
    cleanser.scrub();}
    public void foam() {
		append("  foam()  ");
	}
    public String toString() {
    	return string+" "+cleanser;
		
	}
    public static void main(String[] args) {
		Exercise11 exercise11=new Exercise11();
		exercise11.dilute();
		exercise11.apply();
		exercise11.scrub();
		exercise11.foam();
		System.out.println(exercise11);
		System.out.println("Test");
		Cleanser.main(args);
	}
}
