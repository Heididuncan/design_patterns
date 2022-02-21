/**
 * Written by Heidi Duncan
 */
package SingletonDesign;
import java.util.Random;
import java.util.Scanner;
//import java.math.*;
//import java.util.*;

/**
 * 
 * @implNote 
 * Math game will go through each of the methods, taking a new instance each time,
 * I didnt do paraiterized constructors in the private MathGame method because
 * all the values exept score is randomizing each time in thr program. 
 * @apiNote
 * I put the score varible is in one method playRound() because thats where the varible
 * needs to keep track of an integer, this is also why I didnt parameterizer it and 
 * just set a default value as it will start at 0.
 */

public class MathGame {
    
    private static MathGame mathGame;
    int score = 0;
    Random rand = new Random();
    Scanner reader = new Scanner(System.in);
    String[] operands = {"+","-","*","/"};
   
     double answer;
    
    private MathGame()
    {
        
    }
    /**
     * 
     * @return getInstances which is know to be used with a singleton design pattern
     * returns instance thats already created or will create and return a new one. 
     */
    public static MathGame getInstance() {

        if(mathGame == null){
            mathGame = new MathGame();
        }
        return mathGame;

    }

    /**
     * @exception System.exit(0) to terminate after quiting
     */
    public void play() {

        
        boolean doMath = true;
        System.out.println("");
        System.out.println("Let's have fun with Math!");
        System.out.print("(P)lay or (Q)uit: ");
        
        
        while(doMath){
            
            String input = reader.next();
            if(input.equalsIgnoreCase("p")){
                 playRound();
            }else if(input.equalsIgnoreCase("q")){
                 
                 System.out.println("You won "+score+" games!");
                 System.out.println("Goodbye!");
                 System.exit(0);
            }else{
                System.out.println("Invalid, enter p or q");  
            }
            reader.nextLine();
        }  
    }
    
        /**
         * @return returns true when the answer is correct and false when the answer is wrong
         * @apiNote The method will ask if you want to keep playing in both cases
         * @param score keeps track of just the wins
         */
    public boolean playRound()
    {
    /**
     * The variable below are used for calculation and appending purposes.
     */
    
        String input;
        double calculate = 0.0;
        double rounded = 0.0;
        
        do{

          int firstNum = rand.nextInt(100);
          int secNum = rand.nextInt(100);
          int operandIndex = rand.nextInt(operands.length);

             System.out.println("");
             System.out.println("Round to one Decimal Place");
             System.out.print(firstNum+" "+operands[operandIndex]+" "+secNum+" = ");
            
             switch(operands[operandIndex])
             {
                case "+": 
                    calculate = firstNum + secNum;
                    rounded = Math.round(calculate);
                    break;
                case "-": 
                    calculate = firstNum - secNum;
                    rounded = Math.round(calculate);
                    break;
                case "*": 
                    calculate = firstNum * secNum;
                    rounded = Math.round(calculate);
                    break;
                case "/": 
                    calculate = firstNum / secNum;
                    rounded = Math.round(calculate);
                    break;
             }
              double answer = reader.nextDouble();  

            if(answer == rounded)
              {
                 System.out.println("You got it!!");
                 score++;
                 System.out.print("(P)lay or (Q)uit: ");
                 return true;
              }else{
                  if(answer != rounded){
                 System.out.println("Sorry check again that was wrong");
                    System.out.println("The correct answer is "+rounded);
                    System.out.print("(P)lay or (Q)uit: ");
                    return false;
                } 
                    
              }   
                    
                    input = reader.nextLine();    
          
        }while(input.equalsIgnoreCase("p"));

            if(input.equalsIgnoreCase("q"))
            {
                System.out.println("You won "+this.score+" games!");
                System.out.println("Goodbye");
            }  
                return false;
        }    
              
    }   
         

