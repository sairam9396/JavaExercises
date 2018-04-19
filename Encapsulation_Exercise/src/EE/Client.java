package EE;



public class Client {
	public static void main(String [] args) {
		int i=0, j=0;
		Player[] players = new Player[3];
		
		Game g1[]=new Game[2];
		g1[0]= new Game("Football");
		g1[1]= new Game("Cricket");
		players[i] = new Player();
		players[i].setPlayerName("James Rodriguez");
		players[i].setGame(g1);
		
		Game g2[]=new Game[3];
		g2[0]= new Game("Football");
		g2[1]= new Game("Cricket");
		g2[2]= new Game("Basketball");
		players[i+1] = new Player();
		players[i+1].setPlayerName("Rob Holding");
		players[i+1].setGame(g2);
		
		Game g3[]=new Game[5];
		g3[0]= new Game("Football");
		g3[1]= new Game("Cricket");
		g3[2]= new Game("Basketball");
		g3[3]= new Game("Tennis");
		g3[4]= new Game("Golf");
		players[i+2] = new Player();
		players[i+2].setPlayerName("Roger Federer");
		players[i+2].setGame(g3);
		
		
		for(i=0;i<=players.length;i++)
		{
		System.out.println("Player Name: " +players[i].getPlayerName());
		//for(int j=0;j<=g.length;i++)
//		Game g[]=new Game[5];
         
        	 
         }
		
		     System.out.println("Games Played: " +players[i].getGame());
		}
}
	


