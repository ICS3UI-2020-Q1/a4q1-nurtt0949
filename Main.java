import java.util.Scanner;

/**
 * Counts down to number
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner 
    Scanner input = new Scanner(System.in);
    //ask user for an integer to count down to
    System.out.println("Please enter an integer to count down to from 100");
    //declare a variable
    int integer = input.nextInt();
    //create variable to keep track of count down
    int start = 100;
    System.out.println("Count Down");
    //start the count down
    while(start > integer || start == integer){
     System.out.println(start);
     start = start - 5;

    

    } 
    }
    }
  
