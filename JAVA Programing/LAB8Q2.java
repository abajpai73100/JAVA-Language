class Convertkmtomile implements Runnable{
  Thread t;
  float val;
  Convertkmtomile(String name,float val){
    t=new Thread(this,name);
    System.out.println(t);
    this.val=val;
    t.start();
  }
  public void run(){
    System.out.println("Kilometer value : "+val/1.609+" km");
  }
}
class ConvertFtoC implements Runnable{
  Thread t;
  float val;
  ConvertFtoC(String name,float val){
    t=new Thread(this,name);
    System.out.println(t);
    this.val=val;
    t.start();
  }
  public void run(){
    System.out.println("Celcius value is : "+((val-32)*5)/9+" C");
  }
}
class MainThread{
  public static void main(String[] args) {
    Convertkmtomile obj1= new Convertkmtomile("One",8.04672f);
    ConvertFtoC obj2= new ConvertFtoC("Two",41.0f);
    try{
      obj1.t.join();
      obj2.t.join();
    }catch(InterruptedException e){
      System.out.println(e);
    }
    System.out.println("Main thread exits...");
  }
}
