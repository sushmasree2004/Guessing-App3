/*

Guessing APP -Use Case 2 : User Guess Submission


Thiss class is responsible for comparing 
the users Guess with target number
It doesnt handle input or output

@author : B.Sushma Sree
@version: 2

*/

import java.util.*;
public class Main 
{
   public static void main(String args[])
   {
	   System.out.println("Welcome To GUESSING APP ");
	   GameConfig game=new GameConfig();
	   game.showRules();
	   
	   
	   
	   Scanner sc = new Scanner(System.in);
	   int attempts=0;
	   
	   while(attempts<game.getMax_Attempts())
	   {
		   
		   System.out.print("Enter Your Guess : ");
		   int guess=sc.nextInt();
		   attempts++;
		   
		   
		   
		   String result=GuessValidator.validateGuess(guess,game.getTargetNumber());
		   System.out.println(result);
		   
		   
		   
		   if(" CORRECT ".equals(result))
		   {
			   break;
			   
		   }
	   }
   }
}

