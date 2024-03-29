public class OperatorLogika {
    public static void main(String[] args) {
        boolean a,b,c;

        // OR (||)
        // Kondisi akan (TRUE) apabila salah satu nya bernilai true
        a = true;
        b = false;
        c = (a || b);
        System.out.println("========= OR (||) ===========");
        System.out.println(a + " || " + b + " = " + c);

        // AND (&&)
        // Kondisi akan (TRUE) apabila keduanya bernilai true
        a = true;
        b = false;
        c = (a && b);
        System.out.println("========= AND (&&) ===========");
        System.out.println(a + " && " + b + " = " + c);

        // XOR (^)
        // Kondisi akan (TRUE apabila salah satunya true, tetapi saat kondisinya sama seperti true^true maka akan false, maupun false^false = false)
        a = true;
        b = true;
        c = (a^b);
        System.out.println("========= XOR (^) ===========");
        System.out.println(a + " ^ " + b + " = " + c);

        // negasi (!)
        a = true;
        c = !a;
        System.out.println("========= NEGASI (!) ===========");
        System.out.println("true --> (!) = " + c);
        b = false;
        c = !b;
        System.out.println("false --> (!) " + c);

    }
}
