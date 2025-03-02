
import java.util.Scanner;
public class largestnum {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter three number :");
        int n1=input.nextInt();
        int n2=input.nextInt();
        int n3=input.nextInt();
        if(n1>n2 && n1>n3 ){
            System.out.println(n1+" is the largest among them");
        }
        else if (n2>n1 && n2>n3){
            System.out.println(n2+" is the largest among them");
        }
        else {
            System.out.println(n3+" is the largest ");
        }



    }
}
