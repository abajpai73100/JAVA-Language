import java.util.*;
import java.lang.Math;
 class q3
 {
   public static void main()
   {
   Quad q=new Quad();
   q.getA();
   q.getB();
   q.getC();
   q.get_determinant();
   q.get_root1();
   q.get_root2();
 }}
class Quad
{
  private
   double a;
   double b;
   double c;
   
   public 
   
   double root1,root2;
   double d;
   Scanner sc= new Scanner(System.in);
   Quad()
   {
     a=0;
     b=0;
     c=0;
   }
  void getA()
  {
    System.out.println("Enter the first no:");
    a = sc.nextDouble();
  }
  void getB()
  {
    System.out.println("Enter the second no:");
    b = sc.nextDouble();
  }
  void getC()
  {
    System.out.println("Enter the second no:");
    c = sc.nextDouble();
  }
  
  double get_determinant()
  {
    d = b*b - 4*a*c;
    System.out.println(d);
    return d;
  }
  double get_root1()
  {if(d>0){
    root1 = (-b - Math.sqrt(d))/2*a;
    System.out.println(root1);
    }
    else {System.out.println("!root undefine!");
    }
    return root1;
  }
  double get_root2()
  {if(d>0)
    {root2 = (-b + Math.sqrt(d))/2*a;
    System.out.println(root2);
    }
    else{
      System.out.println("!root undefine!");
    }
    return root2;
  }
}
 