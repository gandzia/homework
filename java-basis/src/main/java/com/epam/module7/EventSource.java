package com.epam.module7;

import java.util.Observable;
import java.lang.Thread;
import java.util.Calendar;

class EventSource extends Observable implements Runnable {
    public void run() {
        while (true) {
            setChanged();
            notifyObservers(Calendar.getInstance().getTime());

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                break;
            }

        }
    }
}