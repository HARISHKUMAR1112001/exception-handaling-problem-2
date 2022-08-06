/*Create a thread using Runnable interface and print the thread name */

public class Main {
  public static void main(String[] args) {
    Thread t1 = new Thread(new Main().new RunnableImpl());
    t1.start();
  }

  private class RunnableImpl implements Runnable {
    public void run() {
      System.out.println(Thread.currentThread().getName());
    }
  }
}
