public class InvalidMethodSignature {
    public static void main(String[] args) {
        System.out.println(add(5, 3));  // Invalid method signature
    }
    public static int add(int a, int b, int c) {
        return a + b;
    }
}
