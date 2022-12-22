import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();	//number
        int n = in.nextInt();	//times
        while(n--!=0)i+=i;
        System.out.println(i);
        in.close();
    }
}
