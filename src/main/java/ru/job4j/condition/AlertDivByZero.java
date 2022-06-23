package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDive(4);
        possibleDive(0);
        possibleDive(-4);
    }

    public static void possibleDive(int result) {
        if (result == 0) {
            System.out.println("Could not div by 0.");
        }

        if (result < 0) {
            System.out.println("This is negative number.");
        }
    }
}