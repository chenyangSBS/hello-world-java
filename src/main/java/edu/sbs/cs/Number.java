package edu.sbs.cs;

public class Number {

    public static void main(String[] args) {
//        int b = 200;
//        short decimal = 43;
//        int binary = 0b101;
//        int octal = 052;
//        int hex = 0x2A;

        byte a = 10, b = 20;
        byte c = (byte) (a + b);

        char ch = 65;
        System.out.println(ch);
        int v = ch;
        short s = (short) ch;
        System.out.println(v);
        System.out.println(s);

    }

}
