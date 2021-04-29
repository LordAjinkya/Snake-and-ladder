package snake_and_ladder;

public class game {
	public static int player1_position=0;
	public static int dice1 =(int)(Math.random()*6+1);
	public static int dice_roll_times;
	public static int roll(int value)
	{
		values=value;
		dice1=dieroll();
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
		return values;
	}
	 public static void ladder()
     {
         System.out.println("Ladder");
         if (values+dice1<100)
         {
             values=values+dice1;

             if (values<100)
             {
                 dice1=dieroll();

                 if (values+dice1<=100)
                 {
                     values=values+dice1;
                 }
             }
         }
     }
	 public static void snake()
	 {
		 if (values>dice1)
		 {
			 values =values-dice1;
		 }
		 else {
			 values=0;
		 }
	 }
	
	

	public static void main(String[] args) {
		
		System.out.println("The number after rolling the dice is: "+ dice1);
		 snake_and_ladder obj1=new snake_and_ladder();
		player1_position=obj1.play(player1_position);
        System.out.println("Number Of Die Roll :" +dice_roll_times + "\n" + "Position of Player1 :"+player1_position);
		
		

	}

}
