import java.util.Random;

interface Game{
	void paly();
}
interface GamesFactory{
	Game getGames();
}
class CoinToss implements Game{
	Random random=new Random();
	public void play(){
		System.out.println("Games CoinToss() ");
		switch (random.nextInt(2)) {
		case 0:
			System.out.println("Heads"); return;
		case 1:
			System.out.println("Tails"); return;
		default:
			System.out.println("OnEdge"); return;
		}
	}
}
class CoinTossFactory implements GamesFactory{
	public Game getGames(){return new CoinToss();}
}
class DiceThrow implements Game{
	Random random=new Random();
	public void play(){
		System.out.println("Throw"+(random.nextInt(6)+1));
	}

}
class DiceThrowFactory implements GamesFactory{
	public Games getGames(){return new DiceThrow();}
}

public class Exercise19 {
	public static void palyGame(GamesFactory factory){
		Game games=factory.getGames();
	     games.paly();}
	public static void main(String[] args) {
		palyGame(new CoinTossFactory());
		palyGame(new DiceThrowFactory());
		}
}
