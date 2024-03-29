import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        int input,x;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Masukan angka : ");
        input = userInput.nextInt();

        x = (input == 10) ? (input*input) : (input/2);

        System.out.println("hasilnya : " + x);

    }
}
