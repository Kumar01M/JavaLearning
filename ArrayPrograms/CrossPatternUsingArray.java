import java.util.Scanner;

public class CrossPatternUsingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        in.close();
        char[] arr = text.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i==j || j  ==((arr.length - 1)-i))
                    System.out.print(arr[j]);
                else
                    System.out.print(' ');
            }
            System.out.println("");
        }
    }
}
