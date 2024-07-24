import java.util.Random;
import java.util.Scanner;

public class numbergame{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Random random=new Random();
    
    int lowerbnd=1;
    int upperbnd=100;

    int numbertoguess=random.nextInt(upperbnd-lowerbnd+1);
    int attempts=0;
    int maxattempts=10;
    System.out.println("welcome to number guessing game!");
    System.out.println("select the number between"+lowerbnd+ "and" +upperbnd);
     
    while (attempts < maxattempts) {
        System.out.print("enter yuor guess number");
        int userguess= sc.nextInt();
        attempts++;

        if(userguess==numbertoguess){
            System.out.println("congratulation! your guess number is correct");
            break;
        }

            else if(userguess<numbertoguess){
                System.out.println("try higer number");
            }
            else{
                System.out.println("try lower number");
            }
        }
        if (attempts==maxattempts){
            System.out.println("Sorry you have reached maximm number of attempts, the correct number is"+ numbertoguess);
        }
        System.out.println("Thanks for playing!");
        sc.close();
        }
    
    }

