package me.adamjawed;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Server started!");

        int counter = 0;

        while (true) {
            Thread.sleep(1000);

            counter++;
            System.out.println("Counter value: " + counter);

            if (counter % 5 == 0) {
                try {
                    // intentionally triggers an error by dividing by 0
                    int result = counter / 0;
                } catch (ArithmeticException exception) {
                    // prints the error without stopping the program
                    exception.printStackTrace();
                }
            }
        }
    }
}