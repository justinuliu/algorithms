package main.java.Fundamentals;

import java.util.Scanner;

public class Average {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double sum = 0.0;
        int cnt = 0;
        while (scanner.hasNext()) {
            sum += scanner.nextDouble();
            cnt++;
        }

        double avg = sum / cnt;
        System.out.printf("Average is %.5f\n", avg);
    }
}
