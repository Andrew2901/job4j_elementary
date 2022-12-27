package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int w = 0; w < width; w++) {
            for (int h = 0; h < height; h++) {
                if ((w + h) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
