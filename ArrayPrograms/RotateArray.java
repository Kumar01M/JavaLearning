public class RotateArray {
    static void leftRotate(int[] arr, int n, int d) {
        System.out.println("Left Rotation by "+d);
        while(d--!=0) {
            int temp = arr[0];
            for(int i = 1; i < n; i++)
                arr[i - 1] = arr[i];
            arr[n-1] = temp;
        }
        display(arr);
    }

    static void rightRotate(int arr[], int n, int d) {
        System.out.println("Right Rotation by "+d);
        while(d--!=0) {
            int temp = arr[n-1];
            for(int i = n-2; i >= 0; i--)
                arr[i + 1] = arr[i];
            arr[0] = temp;
        }
        display(arr);
    }
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Before Rotation: ");
        display(arr);
        leftRotate(arr, arr.length, 5);
        rightRotate(arr, arr.length, 5);
    }

    static void display(int[] arr) {
        System.out.print("{");
        for(int i = 0 ; i< arr.length; i++)
            System.out.print(arr[i]+",");
        System.out.println("}");
    }
}
