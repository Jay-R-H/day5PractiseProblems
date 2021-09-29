package com.programming;

public class CoinTossPercentage {

    public static void main(String[] args) {
        int head = 1;
        int tail = 0;
        int count= 0;
//        String h =Integer.toString(head);
//        String t =Integer.toString(tail);
        double headCounter = 0;
        double tailCounter = 0;

        for (int counter = 1; counter <= 12; counter++) {
            int faceOfCoin = (int) (Math.floor((Math.random() * 10) % 2));
            System.out.println(faceOfCoin);
            count++;

            if (faceOfCoin == head) {
                System.out.println("It is heads");
                headCounter++;
            } else {
                System.out.println("It is tails");
                tailCounter++;
            }
        }
        System.out.println(count);
        System.out.println("The number of times head occured is = " + headCounter);
        System.out.println("The number of times tail occured is = " + tailCounter);
        double percentOfHead = (headCounter / count) * 100;
        System.out.println("Head occured " + percentOfHead + "%");
        double percentOfTail = (tailCounter / count) * 100;
        System.out.println("tail occured " + percentOfTail + "%");

    }
}

