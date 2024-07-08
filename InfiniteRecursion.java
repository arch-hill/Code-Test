public class InfiniteRecursion {
    public static void main(String[] args) {
        recursiveMethod();  // Infinite recursion
    }
    public static void recursiveMethod() {
        recursiveMethod();
    }
}
