import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        // IF STATEMENT

        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukan nilai anda : ");
        int nilai = userInput.nextInt();

        if (nilai >= 90){
            System.out.println("Nilai anda A");
        } else if (nilai >= 80) {
            System.out.println("Nilai anda B");
        } else if (nilai >= 70) {
            System.out.println("Nilai anda C");
        } else {
            System.out.println("Nilai anda E");
        }

    }
}
