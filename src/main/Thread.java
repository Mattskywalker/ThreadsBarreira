package main;
import java.lang.*;
import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Thread extends java.lang.Thread {

    private String id;
    private CyclicBarrier barreira;
    public Thread(String id,CyclicBarrier barreira){
        this.id = id;
        this.barreira = barreira;
    }

    public void run(){
        try{
            Random a =new Random();
            int tempo = a.nextInt(3000) + 1000;
            sleep(tempo);
            System.out.println("Thread: " + id +" Esperando a Thread Fidalga");


            barreira.await();
            System.out.println("Todos prontos: Executei thread: " + id);
        }catch (Exception e){
            System.out.println("deu merda");
        }

    }
}
