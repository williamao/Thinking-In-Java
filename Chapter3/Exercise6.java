class Dogcp{
	String name;
	String says;
	public void setName(String name) {
		this.name = name;
	}
	public void setSays(String says) {
		this.says = says;
	}

}
public class Exercise6 {
	public static void main(String[] args) {
		Dogcp spot=new Dogcp();
		Dogcp scruffy=new Dogcp();
		spot.setName("spot");
		spot.setSays("Ruff!");
//		spot.name="spot";
//		scruffy.name="scruffy";
		scruffy.setName("scruffy");
		scruffy.setSays("Wurf!");
//		spot.says="Ruff!";
//		scruffy.says="Wurf!";
		System.out.println("spot==scruffy          "+(spot==scruffy));
		System.out.println("spot.equals(scruffy)   "+(spot.equals(scruffy)));
		System.out.println("scruffy.equals(spot)   "+(scruffy.equals(spot)));
		spot=scruffy;
		System.out.println("再次比较");
		System.out.println("spot==scruffy          "+(spot==scruffy));
		System.out.println("spot.equals(scruffy)   "+(spot.equals(scruffy)));
		System.out.println("scruffy.equals(spot)   "+(scruffy.equals(spot)));
//		System.out.println("spot:name  "+spot.name+", says  "+spot.says);
//		System.out.println("scruffy:name  "+scruffy.name+", says  "+scruffy.says);
	}

}
