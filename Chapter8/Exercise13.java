class Shared{
	private int refount=0;
	private static long count=0;
	private final long id=count++;
	public Shared(){
		System.out.println("Creating"+this);
	}
	public void addRef(){refount++;}
	protected void finnalize(){
		if (refount>0) {
			System.out.println("Error"+refount+"Share"+id+"Object in use");
		}
	}
	protected void dispose(){
		if (--refount==0) {
			System.out.println("Dispose"+this);
		}
	}
	public String toString(){
		return "shared"+id;
	}
}
class Composing{
	private Shared shared;
	private static long counter=0;
	private final long id=counter++;
	public Composing (Shared shared) {
		System.out.println("Creating"+this);
		this.shared=shared;
		this.shared.addRef();
	}
	public String toString() {
		return "Composing"+id;
		
	}
	public void dispose() {
		// TODO Auto-generated method stub
		System.out.println("Diospose"+this);
		shared.dispose();
	}
}
public class Exercise13 {
	public static void main(String[] args) {
		Shared shared=new Shared();
		Composing[] composing={new Composing(shared),
				new Composing(shared),new Composing(shared),
				new Composing(shared),new Composing(shared)};
	for (Composing c:composing){c.dispose();}
	Composing composing2=new Composing(shared);
	Composing composing3=new Composing(shared);
	shared.finnalize();
	Shared shared2=new Shared();
	Composing composing4=new Composing(shared2);
	shared2.finnalize();
	}
}
