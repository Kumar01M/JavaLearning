import java.util.Scanner;

public class OddOrEvenUsingBitwiseAnd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if ((n & 1) != 0) 
            System.out.println("The Given Number is Odd");
        else
            System.out.println("The Given Number is Even");
    }
}
