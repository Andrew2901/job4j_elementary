package ru.job4j.condition;
public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double dtc = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return dtc;

    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(2, 3, 5, 4);
        System.out.println("result (2, 3) to (5, 4) " + result1);
        double result2 = Point.distance(1, 2, 2, 4);
        System.out.println("result (1, 2) to (2, 4) " + result2);
        double result3 = Point.distance(1, 2, 6, 7);
        System.out.println("result (1, 2) to (6, 7) " + result3);
        double result4 = Point.distance(5, 5, 3, 2);
        System.out.println("result (5, 5) to (3, 2) " + result4);

    }
}