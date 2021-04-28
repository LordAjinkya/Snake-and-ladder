package snake_and_ladder;

public class game {
	public static int player1_position=0;
	public static int dice1 =(int)(Math.random()*6+1);

	public static void main(String[] args) {
		
		System.out.println("The number after rolling the dice is: "+ dice1);
		int possibility=(int)(Math.random()*10)%3;
		System.out.println("random possibility "+possibility);
		switch (possibility) {
		  case 0:
		    System.out.println("no play");
		    break;
		  case 1:
		    System.out.println("ladder");
		    break;
		  case 2:
		    System.out.println("snake");
		    break;
		}
		
		
		

	}

}
