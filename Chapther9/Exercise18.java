interface Cycle{
	void ride();
}
interface CycleFactory{
	Cycle getCycle();
}
class UnicyCycle implements Cycle{
	public void ride(){System.out.println("Ride unicycycle() ");}
}
class UnicyFactory implements CycleFactory{
	public Cycle getCycle(){return new UnicyCycle();}
}
class Bicycle implements Cycle{
	public void ride(){System.out.println("Ride Bicycle() ");}
}
class BicyFactory implements CycleFactory{
	public Cycle getCycle(){return new Bicycle();}
}
class Tricycle implements Cycle{
	public void ride(){System.out.println("Ride Tricycle() ");}
}
class TrictFactory implements CycleFactory{
	public Cycle getCycle(){return new Tricycle();}
}


public class Exercise18 {
	public static void rideCycle(CycleFactory factory){Cycle cycle=factory.getCycle();
	cycle.ride();}
	public static void main(String[] args) {
		rideCycle(new UnicyFactory());
		rideCycle(new BicyFactory());
		rideCycle(new TrictFactory());
	}

}
