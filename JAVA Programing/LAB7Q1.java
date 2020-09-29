class LAB7Q1{
  static void calc(int a){
    try{
      int b=12/a;
      int c[]={1};
      c[32]=344;
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Exception encountered : Array Index is Out of Bounds");
    }
  }
  public static void main(String args[]){
    try{
      int a=args.length;
      calc(a);
    }catch(ArithmeticException e){
      System.out.println("Exception encountered:  Division by zero");
    }
    System.out.println("Rest of the code...");
  }
}
