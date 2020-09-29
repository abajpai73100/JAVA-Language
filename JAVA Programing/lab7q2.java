import java.util.Scanner;
class LAB7Q2
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
    Temprature t=new Temprature();
    System.out.println("Press 1 to convert Fahrenheit to Celcius");
    System.out.println("Press 2 to convert Celcius to Fahrenheit");
    int ch=sc.nextInt();
    switch (ch) {
      case 1: System.out.println(t.toCelcius());
      break;
      case 2: System.out.println(t.toFahrenheit());
      break;
      default:System.out.println("Invalid input");
    }
  }
}
class Temprature{
  Scanner sc=new Scanner(System.in);
  float toCelcius(){
    float fahren=0;
    System.out.println("Enter the Fahrenheit value to convert:");
    try{
      fahren=sc.nextFloat();
    }catch(NumberFormatException e){
      System.out.println("Value entered is not a valid float");
    }
    return (float)((fahren-32.0)*5.0/9.0);
  }
  float toFahrenheit(){
    float celcius=0;
    System.out.println("Enter the celcius value to convert :");
    try{
      celcius=sc.nextFloat();
    }catch(NumberFormatException e){
      System.out.println("Value entered is not a valid float");
    }
    return (float)((9.0*celcius)/5.0+32.0);
  }
}
