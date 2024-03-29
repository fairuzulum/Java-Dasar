public class ConversiTipeData {
    public static void main(String[] args) {
        // CONVERSI TIPE DATA NUMERIC

        int nilaiInt = 255;
        System.out.println("nilai int = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);

        // Memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);

        /* apabila conversi dari tipe data yang kecil ke besar tidak akan terjadi masalah, namun
        akan menjadi masalah apalbil conversi dari tipe data yang lebih besar ke lebih kecil misalnya
        long ke int. tidak masalah jika masih dalam rentan max/min value dari tipe datanya, tapi bermasalah
        saat melebihi bates max/min
         */

        // Casting pembagian
        float a = 10;
        int b = 4;
        // Ubah salah satu tipe data diatas menjadi float
        float c = a/b;
        System.out.printf("%f / %d = %f \n", a,b,c);

        int x = 10;
        int y = 4;
        float z = (float) a/b;
        System.out.printf("%d / %d = %f \n", x,y,z);


    }
}
