
import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.println("How many times do you want to play");
    int expectedPlays = input.nextInt();
    while(expectedPlays <= 0)
    {
      System.out.println("How many times do you want to play");
      expectedPlays = input.nextInt();
    }
    
    int plays = 0;
    int userInput = 5;
    int computerChoice;
    int lose = 0;
    int win = 0;
    int tie = 0;
    
    while(plays < expectedPlays)
    {
      System.out.println("1 for rock, 2 for paper, 3 for scissors");
      userInput = input.nextInt();
  
      while(checkNum(userInput))
      {
         System.out.println("1 for rock, 2 for paper, 3 for scissors");
         userInput = input.nextInt();
      }

      if(userInput == 1)
      {
        System.out.println("You chose rock🗿");
      }
      else if(userInput == 2)
      {
        System.out.println("You chose paper🧾");
      }
      else
      {
        System.out.println("You chose scissors✂️");
      }
      
      computerChoice = (int) ((Math.random() * 3) + 1);
      
      if(computerChoice == 1)
      {
        System.out.println("Computer chose rock🗿");
      }
      else if(computerChoice == 2)
      {
        System.out.println("Computer chose paper🧾");
      }
      else
      {
        System.out.println("Computer chose scissors✂️");
      }
      
      if((userInput == 1 && computerChoice == 1) || (userInput == 2 && computerChoice == 2) || (userInput == 3 && computerChoice == 3))
      {
        System.out.println("Tie Game!");
        tie++;
      }
      else if((userInput == 1 && computerChoice == 3) || (userInput == 2 && computerChoice == 1) || (userInput == 3 && computerChoice == 2))
      {
        System.out.println("\u001B[32m" + "You Win!" + "\u001B[0m");
        win++;
      }
      else
      {
        System.out.println("\u001B[31m" + "You Loose!" + "\u001B[0m");
        lose++;
      }
      plays++;
    }

    System.out.println("\n" + "\u001B[32m" + "Wins: " + win + "\u001B[0m" + "\u001B[31m" + "\nLosses: " + lose + "\u001B[0m" + "\nTies: " + tie);
  }

  public static boolean checkNum(int input)
  {
    if(input != 1 && input != 2 && input != 3)
    {
      return true;
    }
    return false;
  }





}