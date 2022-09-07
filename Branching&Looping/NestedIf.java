import java.util.Scanner;



public class NestedIf {

    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Registration Number: ");

        int n = in.nextInt();

        if(n>=1&&n<=100){

            if(n<=25) System.out.println("Go to Exam Hall A");

            else if(n<=50) System.out.println("Go to Exam Hall B");

            else if(n<=75) System.out.println("Go to Exam Hall C");

            else System.out.println("Go to Exam Hall D");

        }
 	else System.out.println("Enter valid registration number");

        }

    }
    