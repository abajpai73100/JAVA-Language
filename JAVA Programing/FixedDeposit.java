import java.util.*;
class FixedDeposit extends Thread{
  Thread t;
  float pri,time,rate;
  FixedDeposit(float principal,float t,float r){
    super("First");
    pri=principal;
    time=t;
    rate=r;
    System.out.println(this);
    start();
  }
  public void run(){
    System.out.println("Fixed Deposit is : "+pri*(1+rate*time));
  }
}
class RecurringDeposit extends Thread{
  Thread t;
  float pri,time,rate;
  RecurringDeposit(float principal,float t,float r){
    super("Second");
    pri=principal;
    time=t;
    rate=r;
    System.out.println(this);
    start();
  }
  public void run(){
    System.out.println("Recurring Deposit is : "+pri*time*(1+((float)Math.pow(time+1,rate)/2400)));
  }
}
class MainThread{
  public static void main(String[] args) {
    FixedDeposit f=new FixedDeposit(1000,2,5);
    RecurringDeposit d=new RecurringDeposit(1000,2,5);
    System.out.println("Thread one is Alive : "+f.isAlive());
    System.out.println("Thread two is Alive : "+d.isAlive());
    try{
      System.out.println("Main is waiting for other threads to finish...");
      f.join();
      d.join();
    }catch(InterruptedException e){
      System.out.println(e);
    }
    System.out.println("Thread one is Alive : "+f.isAlive());
    System.out.println("Thread two is Alive : "+d.isAlive());
    System.out.println("Main thread exiting...");
  }
}
