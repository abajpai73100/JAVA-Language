abstract class Conversion{
  float amount;
  abstract void moneyConversion();
}
class RupeesToDoller extends Conversion{
  RupeesToDoller(){
    amount=1000;
  }
  void moneyConversion(){
    System.out.println("Amount in Dollers is : $"+(amount/0.014));
  }
}
class RupeesToEuro extends Conversion{
  RupeesToEuro(){
    amount=1000;
  }
  void moneyConversion(){
    System.out.println("Amount to Euros is : "+(amount/0.012));
  }
}
class Conversionmain{
  public static void main(String args[]){
    RupeesToDoller rd=new RupeesToDoller();
    rd.moneyConversion();
    RupeesToEuro re=new RupeesToEuro();
    re.moneyConversion();
  }
}
