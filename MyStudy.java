import java.util.Properties;

public class MyStudy {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        new Thread(runnable).start();
        var name = "tan";
    }

    private static class MyRunnable implements Runnable {

        public void run(){
            Properties properties = System.getProperties();
            System.out.println(properties);
        }
    }
}
