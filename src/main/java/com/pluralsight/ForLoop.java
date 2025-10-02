package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

        for (int countup = 1; countup <= 10; countup++) {
            System.out.println(countup);
        } System.out.println("Launch!");

        for (int countdown = 10; countdown >= 1; countdown--) {
            System.out.println(countdown);
            Thread.sleep(1000);
        }
        System.out.println("Launch!");


    }

}
