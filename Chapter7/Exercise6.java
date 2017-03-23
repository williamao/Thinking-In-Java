class Game{
	Game(int i){
		System.out.println("Game()");
	}
}
class boardGame extends Game{
	public boardGame(int i) {
		super(i);
		System.out.println("boardGame()");
		
		// TODO Auto-generated constructor stub
	}
}
public class Exercise6 extends boardGame{
	public Exercise6() {
		super(11);
		System.out.println("6666()");
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Exercise6 x=new Exercise6();
	}

}
