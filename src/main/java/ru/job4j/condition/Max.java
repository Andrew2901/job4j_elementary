package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int max =  left > right ? left : right;
        return max;
    }

    public static void main(String[] args) {
        int msg = Max.max(100, 25);
        System.out.println(msg);
    }
}