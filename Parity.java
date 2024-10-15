import java.util.Scanner;

public class Parity{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a random number: ");
        int userInput = scr.nextInt();

        boolean isPositive = userInput > 0 ? true : false;
        boolean isEven = userInput % 2 == 0 ? true : false;

        if(isPositive && isEven){
            System.out.println("The input is a positive even number");
        } else if(isPositive && !isEven){
            System.out.println("The input is a positive odd number");
        } else if(!isPositive && isEven){
            if(userInput == 0){
                System.out.print("The input is neither positive nor negative and is an even number");
            } else{
                System.out.println("The input is a negative even number");
            }
        } else{
            System.out.println("The input is a negative odd number");
        }
    }
}