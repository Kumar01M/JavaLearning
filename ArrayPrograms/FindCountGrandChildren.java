public class FindCountGrandChild {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
        
        String q = "ronaldo";
        int count = 0;
        
        for(int i = 0;i < arr.length;i++) {
            if((arr[i][1]).equals(q)) {
                for(int j = 0;j < arr.length;j++){
                    if(arr[j][1].equals(arr[i][0])) count+=1;
                }
            }
        }
        System.out.println(count);
    }
}
