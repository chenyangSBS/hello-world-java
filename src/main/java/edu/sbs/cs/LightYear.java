package edu.sbs.cs;

public class LightYear {
    public static void main(String[] args) {
       int speed = 300000;
       long seconds = 365 * 24 * 60 * 60;
       long distance = calcDistance(seconds,speed);
       System.out.println("一光年的距离是：" + distance);
    }

    public static long calcDistance(long seconds, long distance) {
        return seconds * distance;
    }
}
