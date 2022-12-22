import java.math.*;

public class SumOfChess {
    
    public static void main(String[] args) {
        BigInteger A = BigInteger.ZERO;
        for(int i = 0;i<64;i++)
            A = A.add(BigInteger.valueOf(2).pow(Integer.valueOf(i)));
        System.out.println(A);
    }
}
