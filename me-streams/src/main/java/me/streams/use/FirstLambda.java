package me.streams.use;

public class FirstLambda {
    public static void main(String[] args) {
        //before Java8 write a thread
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println(0+"test before Java8");
                }

            }
        };
        new Thread(runnable).start();
        //after Java8
        Runnable runnable0 = () -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println(1+"test after Java8");
            }
        };
        new Thread(runnable0).start();
        //more concise
        new Thread(()-> System.out.println("test more concise after Java8")).start();

    }
}
