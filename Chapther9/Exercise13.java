interface Cando{
	void doit();
}
interface CandoMore extends Cando{
	void doMore();
}
interface CandoFaster extends Cando{
	void doFaster();
}
interface CandoMost extends CandoFaster,CandoMore{
	void doMost();
}
class doer implements CandoMost{
	public void doit(){}
	public void doMore(){}
	public void doFaster(){}
	public void doMost(){}
}
public class Exercise13 {
	public static void main(String[] args) {
		doer doer=new doer();
		((CandoMore)doer).doMore();
		((CandoFaster)doer).doFaster();
		((Cando)doer).doit();
	}

}
