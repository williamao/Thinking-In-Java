import cp7.*;
class DeviceFail{
	public static void main(String[] args) {
		ex15 fail=new ex15();
		fail.showS();
//		fail.changes(" ");
	}
}
public class Exercise15 extends ex15{
	void changex15(String t){
		super.changes(t);
	}
	public static void main(String[] args) {
		Exercise15 exercise15=new Exercise15();
		exercise15.showS();
		exercise15.changex15("changed");
		exercise15.showS();
		DeviceFail.main(args);
	}
	
}
