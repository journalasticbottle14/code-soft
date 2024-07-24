package code_soft;
import java.util.Scanner;
 class bankaccount{
    private double balance;
    public bankaccount(double initialbalance){
    this.balance=initialbalance;
    
 }
 public double getbalance(){
   return balance;
 }
 public void deposit(double amount){
   if(amount>0){
      balance+=amount;
      System.out.println("deposit succesful New balance"+balance);
   }
   else{
      System.out.println("invalid amount");
   }
 }
 public void withdraw(double amount){
   if(amount>0 && amount<=balance){
      balance+=amount;
      System.out.println("withdrawl successfull"+balance);
   }
   else{
      System.out.println("isuffecient fund for withdrawl");
   }
 }
}
class ATM{
   private bankaccount account;
   private Scanner scanner;

   
   public ATM(bankaccount account){
      this.account=account;
      this.scanner=new Scanner(System.in);
   }
     public void showmenu(){
      System.out.println("1check balance");
      System.out.println("2deposit");
      System.out.println("3 withdraw");
      System.out.println("4 exit");
     }

     public void run(){
      int choice;
      do{
         showmenu();
         System.out.println("enter  your choice");
         choice=scanner.nextInt();
         switch(choice){

            case 1:
            checkbalance();
            break;
            case 2:
            deposit();
            break;
            case 3:
            withdraw();
            break;
            case 4:
            System.out.println("Thank you for using ATM");
            break;
            default:
            System.out.println("invalid choice");
         }
      }while(choice!=4);
   }

   private void checkbalance(){
      System.out.println("your current blance"+account.getbalance());
   }
   private void deposit(){
      System.out.println("enter the amount to deposdit");
      double amount=scanner.nextDouble();
      account.deposit(amount);
   }
   private void withdraw()
   {
      System.out.println("enter the amopunt to nwiythdraw");
      double amount=scanner.nextDouble();
      account.withdraw(amount);

   }
}
 public class atm_interface{
   public static void main(String[] args){
   System.out.println("welcome to ATM");
   Scanner sc=new Scanner(System.in);
   System.out.println("enter your p4 digit pin");
   int enteredpin=sc.nextInt();

   bankaccount useraccount=new bankaccount(1000.0);
   ATM atm=new ATM(useraccount);
   atm.run();
   sc.close();





   
 }
}

