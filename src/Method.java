public class Method {
    public static void main(String[] args) {
        sayHello();
        sayFirstName("Fairuz");

        var result = sum(100,100);
        System.out.println(result);

        System.out.println(hitung(100, "+" , 100));
        System.out.println(hitung(200, "-" , 100));
        System.out.println(hitung(100, "*" , 100));
        System.out.println(hitung(100, "/" , 100));

        int[] nilai = {80, 80, 80, 80, 80};
        sayCongrat("Fairuz", nilai);

        sayHello("Fairuz");
        sayHello("Fairuz", "Ulum");

        System.out.println(factorial(5));
        System.out.println(factorialLoop(5));

    }

    static void sayHello(){
        System.out.println("Hallo Fairuz");
    }

    // Method Parameter
    static void sayFirstName(String firstName){
        System.out.println("Hallo " + firstName + " Selamat Pagi");
    }

    // Method Return Value
    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case  "*":
                return value1 * value2;
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "/":
                return value1 / value2;
            default:
                return 0;
        }
    }

    // Method Variable Argument
    static void sayCongrat(String name, int[] nilai){
        var total = 0;

        for(var value : nilai){
            total += value;
        }
        var average = total / nilai.length;
        if (average > 76 ){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }


    // Method Overloading
    static void sayHello(String name){
        System.out.println("Hallo " + name);
    }
    static void sayHello(String first, String second){
        System.out.println("Hallo " + first + " dan " + second);
    }

    // Method Recursive

    static int factorial(int a){
        if(a == 0){
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }
    // factorial dengan loop
    static int factorialLoop(int a){
        var result = 1;
        for(int i = 1; i <= a; i++){
            result *= i;
        }

        return result;


    }
}
