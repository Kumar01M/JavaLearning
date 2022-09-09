import java.util.*;

public class ArrWeightProb {
    public static void main(String[] args) {
        int[] arr = new int[]{49, 36, 8, 10, 12};
        int[] weight = new int[]{0, 0, 0, 0, 0};
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==Math.pow((double)Math.sqrt(arr[i]), 2))weight[i]+=5;
            if((arr[i]%4==0)&&(arr[i]%6==0)) weight[i]+=4;
            if(arr[i]%2==0) weight[i]+=3;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(weight[i]<weight[j]){
                    int temp = weight[j];
                    weight[j] = weight[i];
                    weight[i] = temp;
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.print("<"+arr[i]+","+weight[i]+"> ");
        }
        
    }
}