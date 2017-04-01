interface History{
	void v();
	void u();
}
interface Exam{
	void w();
	void x();
}
interface Labs{
	void y();
	void z();
}
interface WorkUp extends History,Exam,Labs{
	void zz();
}
class Doctor{
	private int i=0;
	private void doc(){}
}
class Anest extends Doctor implements WorkUp{
	private int j=0;
	public void v(){}
	public void u(){}
	public void w(){}
	public void x(){}
	public void y(){}
	public void z(){}
	public void zz(){}
}
public class Exercise14 {
	public static void m1(History history){history.v();}
	public static void m2(Exam exam){exam.w();}
	public static void m3(Labs labs){labs.y();}
	public static void m4(WorkUp workUp){workUp.zz();}
	public static void main(String[] args) {
		Anest anest=new Anest();
		m1(anest);
		m2(anest);
		m3(anest);
		m4(anest);
	}

}
