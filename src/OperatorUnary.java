public class OperatorUnary {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(+a);

        // Increment & Decrement
        System.out.println(a++);
        System.out.println(a--);

        //Prefix & PostFix
        int b = 5;
        System.out.println(++b);
        int c = 5;
        System.out.println(c++);
        System.out.println(c);

        // Unary Boolean
        boolean z = true;
        System.out.println(!z);
    }
}
