import java.util.Scanner;
public class studentgradecalculator{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    System.out.println("Student grade calculator!");
    System.out.println("enter the number of subject");
    int sub=sc.nextInt();
    double total=0;

    System.out.println("enter the marks of the subjects");
    
    for(int i=0;i<sub;i++){
        int marks=sc.nextInt();
        total=total+marks;

    }
    System.out.println("the total marks"+total);
    double av=total/sub;
    if(av<=90){
        System.err.println("grade is A+");
    }
    else if(av<=80){
        System.out.println("grade is A");
    }
    else if(av<=70){
        System.out.println("grade is B");
    }
    else if(av<=60){
        System.out.println("grade is C");

    }
    else if (av<=50){
        System.out.println("grade is D");

    }
    else if(av<=40){
        System.out.println("grade is E");
    }
    else{
        System.out.println("FAil");
    }
    sc.close();

    

}
}

