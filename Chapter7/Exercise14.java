class Engin{
	public void start(){}
	public void rev(){}
	public void stop(){}
	public void service(){System.out.println("service()");}
}
class Whell{
	public void inflate(int psi){}
}
class Window{
	public void roollup(){}
	public void roolldown(){}
}
class Door{
	public Window window=new Window();
	public void open(){}
	public void close(){}
}
public class Exercise14 {
   public Engin engine=new Engin();
   public Whell[] whells=new Whell[4];
   public Door left=new Door(),right=new Door();
   public Exercise14() {for(int i=0;i<4;i++)
	   whells[i]=new Whell();}
   public static void main(String[] args) {
	Exercise14 exercise14=new Exercise14();
	exercise14.left.window.roollup();
	exercise14.whells[0].inflate(72);
	exercise14.engine.service();
}
}
