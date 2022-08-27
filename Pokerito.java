package section_two;
import java.util.*;


public class Pokerito {
 
    public static String randomCard(){
        
        int randCard=(int)(Math.random()*13+1);
        String card="";
        System.out.println(randCard);
        switch(randCard){
            case 1: card= "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";
                break;

            case 2: card=  "   _____\n"+              
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n";
                break;

            case 3: card= "   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n";
                break;

            case 4: card=  "   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";
                break;

            case 5: card=   "   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n";
            break;

            case 6: card=  "   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n";
            break;

            case 7: card=  "   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n";
            break;

            case 8: card=  "   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n";
            break;

            case 9: card=    "   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n";
            break;

            case 10: card=   "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";
            break;

            case 11: card=  "   _____\n" +
            "  |J  ww|\n"+ 
            "  | o {)|\n"+ 
            "  |o o% |\n"+ 
            "  | | % |\n"+ 
            "  |__%%[|\n";
            break;

            case 12: card=  "   _____\n" +
            "  |Q  ww|\n"+ 
            "  | o {(|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%O|\n";
            break;

            case 13: card=  "   _____\n" +
            "  |K  WW|\n"+ 
            "  | o {)|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%>|\n";
            break;

            default: break;

        }
        return card;
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String return_key = "";
        String userInput = "";
        String userCard="";
        String computerCard="";

        System.out.println("\nLet's play Pokerito. Type anything when you're ready."+
        "\nIt's like Poker, but a lot simpler."+
        "\n- There are two players, you and the computer."+
        "\n- The dealer will give each player one card."+
        "\n- Then, the dealer will draw five cards (the river)"+
        "\n- The player with the most river matches wins!"+
        "\n- If the matches are equal, everyone's a winner!"+
        "\n- Ready? Type anything if you are.");
        userInput=input.nextLine();
        if(userInput.equals(return_key)){
            System.out.println("Here's your card: ");
            userCard=randomCard();
            System.out.println(userCard);
            System.out.println("\nHere's the computer's card: ");
            computerCard=randomCard();
            System.out.println(computerCard);
        }

        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        int counter = 0;
        int userMatch=0;
        int compMatch=0;
        String river="";
        while(counter<5){
            userInput=input.nextLine();
            if(userInput.equals(return_key)){
                river=randomCard();
                System.out.println(river);
                if(river.equals(userCard)){
                    userMatch++;
                    
                }
                else if(river.equals(computerCard)){
                    compMatch++;
                    
                }

            }
            counter+=1;
        }
        
        System.out.println("Your number of matches: " + userMatch);
        System.out.println("Computer number of matches: " + compMatch);

        if(userMatch>compMatch){
            System.out.println("Your win!");
        }
        else if(userMatch<compMatch){
            System.out.println("The computer wins!");
        }
        else{
            System.out.println("everyone wins!");
        }
        
        




    }
}
