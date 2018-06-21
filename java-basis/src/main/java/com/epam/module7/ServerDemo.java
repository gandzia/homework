package com.epam.module7;

//Используя паттерн программирования наблюдатель (Observer - https://en.wikipedia.org/wiki/Observer_pattern)
//напишите приложение сервера который с определенным интервалом оповещает клиентов о текущем времени.
//В методе main реализуйте вызов к серверу по которому он сможет начать оповещение клиентов. Предусмотрите несколько
//реализаций сервера с одним интерфейсом Регистрацию клиентов предусмотрите в методе main
// Примечания:
//Для передачи текущей даты и времени используйте класс Date из пакета java.util
//Get current date and time Date currentDate = new Date();
//Print current date and time System.out.println(currentDate);
//Общий код метода main может выглядеть следующим образом:
//public static void main(String[] args) { Server server1 = new ServerImplOne(); Server server2 = new ServerImplTwo();
//Client client1 = new ClientOne(); Client client2 = new ClientTwo(); Client client3 = new ClientThree();
//Client client4 = new ClientFour(); server1.register(client1); server1.register(client2); server1.register(client3);
//server2.register(client2); server2.register(client4); for (int i=0;i<10;i++) { server1.process(); server2.process();
//Sleep for 2 seconds      Thread. sleep (2000); } }
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