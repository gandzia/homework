package com.epam.module7;

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class ServerDemo {
    public static void main(String[] args) {

        System.out.print("Would you like to start? (y/n): ");
        Scanner sc = new Scanner(System.in);
        String r = sc.next();

        if (r.equalsIgnoreCase("y")) {
            System.out.println("Press 'Enter' to stop");
            System.out.println();
            EventSource eventSource = new EventSource();

            eventSource.addObserver(new Observer() {
                public void update(Observable obj, Object arg) {
                    System.out.println("Received response: " + arg);
                }
            });

            Thread timer = new Thread(eventSource);
            timer.start();

            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            timer.interrupt();

        }
    }
}