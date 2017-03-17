class Tank{
	int howFull=0;
	Tank(){this(0);}
	Tank(int i){
      howFull=i;
    }
    void say(){
    	if(howFull==0){System.out.println("EMPTY");}
    	else {
    		System.out.println("ด๓ะก"+howFull);
		}
    }
    void empty(){howFull=0;}
    protected void finalize() {
    	if (howFull!=0) {System.out.println("ERROR tank not empty");
			//super.finalize();
		}
		
	}
}
public class Exercise12 {
	public static void main(String[] args) {
		Tank tank=new Tank();
	    Tank tank2=new Tank(3);
	    Tank tank3=new Tank(5);
	    tank2.empty();
	    new Tank(6);
	    tank.say();
	    tank2.say();
	    tank3.say();
	    System.gc();

}
	

}
