class SwappingUsingXOR {

    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Before Swapping: a = "+a+" b = "+b);
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.print("After Swapping: a = "+a+" b = "+b);
    }
}
