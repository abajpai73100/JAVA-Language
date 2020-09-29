import java.util.*;
class q2
{  
  public static void main()
  {
    mobike M =new mobike();
    M.input();
    M.compute();
    M.display();
  }
  
}

class mobike
{
  int bno;
  int phno;
  String name;
  int days;
  int charge;
  
Scanner sc = new Scanner(System.in);
void input()
{
  
  System.out.println("Enter your name:-");
  name = sc.nextLine();
  System.out.println("Enter your phone no.:-");
  phno=sc.nextInt();
}
void compute()
{
System.out.println("chare for first five days = Rs.500 per day");
System.out.println("charge for next five days = Rs.400 per day");
System.out.println("charges for the next ten days =Rs.400 per day ");
  
  
  System.out.println("Enter the no. of days you want bike:-");
  days =sc.nextInt();
  if(days<=5)
   {
   charge = 500*days;
   }
  
  else if(days<5)
 {charge =400*days; }
 
  else if(days>10)
  {charge =400*days;}
  
  System.out.println("Enter bike no.:");;
  bno = sc.nextInt();
}
void display()
{
  System.out.println(name);
  System.out.println(phno);
  System.out.println(bno);
  System.out.println(charge);
}
}
