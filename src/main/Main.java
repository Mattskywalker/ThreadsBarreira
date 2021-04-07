package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        CyclicBarrier barrier = new CyclicBarrier(2);

        Thread t1 = new Thread("1",barrier);
        Thread t2 = new Thread("2",barrier);
        Thread t3 = new Thread("3",barrier);
        Thread t4 = new Thread("4",barrier);


        t1.start();
        t2.start();
        t3.start();
        t4.start();



    }
}
