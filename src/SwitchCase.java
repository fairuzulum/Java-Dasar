import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Boolean lanjut = true;
        while (lanjut){
            System.out.print("Masukan Warna Lampu (merah/kuning/hijau) : ");
            String warna = userInput.next();
            switch (warna.toLowerCase()){
                case "merah":
                    System.out.println("Anda harus berhenti");
                    break;
                case "kuning":
                    System.out.println("Anda harus hati-hati");
                    break;
                case "hijau":
                    System.out.println("Anda harus jalan");
                    break;
                case "exit":
                    lanjut = false ;
                    System.out.println("Terimakasih");
                    break;
                default:
                    System.out.println("Warna yang anda masukan salah");
            }

            System.out.println("lanjut ? (y/n) : ");
            String lagi = userInput.next();
            if(lagi.equalsIgnoreCase("y")){
                lanjut = true;
            }else{
                lanjut = false;
            }
        }
        userInput.close();

    }
}
