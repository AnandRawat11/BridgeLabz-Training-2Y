public class Hello {
    public static void main(String[] args) {
        byte num = 32;
        short num1 = num;
        System.out.println("byte to short "+num1);

        byte num2 = (byte) num1;
        System.out.println("short to byte "+ num2);

        int num3 = num1;
        System.out.println("short to integer "+ num3);

        short num4 = (short) num3;
        System.out.println("integer to short "+ num4);

        int a = 42;
        long newnum = a;
        System.out.println("integer to long "+newnum);

        int b = (int) newnum;
        System.out.println("long to int "+b);

        char c = 'A';
        int x = c;
        System.out.println("char to integer "+x);

        char y = (char) x;
        System.out.println("integer to char "+ y);

        float dec1 = 4.32F;
        int newnum1 = (int) dec1;
        System.out.println("float to int "+ newnum1);

        float dec2 = (float) newnum1;
        float dec3 = newnum1;
        System.out.println("integer to float "+ dec2);
        System.out.println("integer to float implicite "+dec3);

        char word = 'a';
        int wordnum = (int) word;
        System.out.println("char to int explicite "+wordnum);
    }
}
