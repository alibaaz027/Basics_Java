package Threads;
  class Test extends Thread {

      public void run(){
          if(Thread.currentThread().isDaemon()){
              System.out.println("Daemon Thread");
          }else {
              System.out.println("Non Daemon Thread");
          }
      }
  }




public class MultiThreadEx {
     float b ;
    public static void main(String[] args) {


        MultiThreadEx input = new MultiThreadEx();
        System.out.println(input.b);


     Test t1 = new Test();
     Test t2 = new Test();
     Test t3 = new Test();
     t1.setDaemon(true);
     t1.start();
     t2.start();
     t3.start();


    }
}
