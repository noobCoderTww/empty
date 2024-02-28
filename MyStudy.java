
public class MyStudy {
    public static void main(String[] args) {
        var runnable = new MyRunnable();
        new Thread(runnable).start();
        new Thread(() -> System.out.println("Hello World")).start();
        var name = "tan";
        System.out.println(name + " age:18");
    }

    private static class MyRunnable implements Runnable {

        public void run() {
            var properties = System.getProperties();
            System.out.println(properties);
        }
    }
}
