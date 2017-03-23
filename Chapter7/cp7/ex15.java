package cp7;

public class ex15 {
	private String string="Original";
	public ex15(){string="Original";}
	protected void changes(String s){
		string=s;
	}
	public void showS(){
		System.out.println(string);
	}

}
