public class TipeDataPrimitive {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("==========INTEGER==========");
        System.out.println("Nilai Integer i = " + i);
        System.out.println("Nilai Max = " + Integer.MAX_VALUE);
        System.out.println("Nilai Min = " + Integer.MIN_VALUE);
        System.out.println("Besar Integer = " + Integer.BYTES + " byte");
        System.out.println("Besar Integer = " + Integer.SIZE + " bit");

        byte b = 10;
        System.out.println("==========BYTE==========");
        System.out.println("Nilai Byte dari b = " + b);
        System.out.println("Nilai Max = " + Byte.MAX_VALUE);
        System.out.println("Nilai Min = " + Byte.MIN_VALUE);
        System.out.println("Besar Byte = " + Byte.BYTES + " byte");
        System.out.println("Besar Byte = " + Byte.SIZE + " bit");

        short s = 10;
        System.out.println("==========SHORT==========");
        System.out.println("Nilai Short dari s = " + s);
        System.out.println("Nilai Max = " + Short.MAX_VALUE);
        System.out.println("Nilai Min = " + Short.MIN_VALUE);
        System.out.println("Besar Short = " + Short.BYTES + " byte");
        System.out.println("Besar Short = " + Short.SIZE + " bit");

        long l = 10L; // Bisa pakai L atau tidak
        System.out.println("==========LONG==========");
        System.out.println("Nilai Long dari l = " + l);
        System.out.println("Nilai Max = " + Long.MAX_VALUE);
        System.out.println("Nilai Min = " + Long.MIN_VALUE);
        System.out.println("Besar Long = " + Long.BYTES + " byte");
        System.out.println("Besar Long = " + Long.SIZE + " bit");

        double d = 10.5d;
        System.out.println("==========DOUBLE==========");
        System.out.println("Nilai Double dari d = " + d);
        System.out.println("Nilai Max = " + Double.MAX_VALUE);
        System.out.println("Nilai Min = " + Double.MIN_VALUE);
        System.out.println("Besar Double = " + Double.BYTES + " byte");
        System.out.println("Besar Double = " + Double.SIZE + " bit");

        float f = 10.5f;
        System.out.println("==========FLOAT==========");
        System.out.println("Nilai Float dari f = " + f);
        System.out.println("Nilai Max = " + Float.MAX_VALUE);
        System.out.println("Nilai Min = " + Float.MIN_VALUE);
        System.out.println("Besar Float = " + Float.BYTES + " byte");
        System.out.println("Besar Float = " + Float.SIZE + " bit");

        char c = 'c';
        System.out.println("==========CHAR==========");
        System.out.println("Nilai Char dari c = " + c);
        System.out.println("Nilai Max = " + Character.MAX_VALUE);
        System.out.println("Nilai Min = " + Character.MIN_VALUE);
        System.out.println("Besar Char = " + Character.BYTES + " byte");
        System.out.println("Besar Char = " + Character.SIZE + " bit");

        Boolean val = true; // True / False
        System.out.println("==========BOOLEAN==========");
        System.out.println("Nilai Booelan dari val = " + val);
        System.out.println("Nilai True = " + Boolean.TRUE);
        System.out.println("Nilai False = " + Boolean.FALSE);

    }
}
