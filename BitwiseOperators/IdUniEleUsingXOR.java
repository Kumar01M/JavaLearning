public class IdUniEleUsingXOR{

    public static void main(String[] args){
        int sum = 0;
        int[] arr = new int[] {1, 2, 5, 3, 4, 3, 2, 1};
        for (int val: arr) {
            sum ^= val;
        }
        System.out.print(sum); //can find only if there's one unique
        
//         boolean flag = true;
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 if(i==j)continue;
//                 if((arr[i]^arr[j])==0) flag = false;
//             }
//             if(flag)System.out.println(arr[i]+" is the unique element.");
//             flag = true;
//         }

    }

}
