package com.exerceise;

import java.util.Random;

public class RandomNumber {
    public static void randomNumber(int number) {
        Random rd = new Random();
        int count = 0;
        while (true) {
            int checkCount = count++;
            int randomNumber = rd.nextInt(100);
            System.out.println("radom: " + randomNumber);
            if (randomNumber == number) {
                System.out.println("Số cần tìm là: " +randomNumber);
                System.out.println("Số bước cần thực hiện: " + checkCount);
                break;
            }
        }
    }
}
