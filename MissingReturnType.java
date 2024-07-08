public class MissingReturnType {
    public static void main(String[] args) {
        System.out.println(getValue());  // Missing return type
    }
    public static getValue() {
        return 10;
    }
}
