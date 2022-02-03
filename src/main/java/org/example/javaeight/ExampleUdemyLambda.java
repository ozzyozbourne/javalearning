package org.example.javaeight;

public class ExampleUdemyLambda {
    public static void main(String[] args) {

        var runnable = new Runnable() {
            @Override
            public void run(){
                System.out.println("Inside runnable");
            }
        };  new Thread(runnable).start();

        //java 8
        //() -> {}

        Runnable lambdaRunnable  = () -> System.out.println("Lambda runnable");

        new Thread(lambdaRunnable).start();

        new Thread(() -> System.out.println("java 8 selenium")).start();
    }
}
