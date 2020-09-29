import java.util.*;
class q6
 {
  public static void main()
  {
  poly l=new poly();
   l.polygon(3);
   l.polygon(4,5);
   l.polygon();
   
  }
}

class poly
{
  int x,y;
  int i,j,n;
  char ch;
  Scanner sc = new Scanner(System.in);
    void polygon(int a)
  {
    n=a;
    
    
    System.out.println("Enter the character");
    ch = sc.next().charAt(0);
    
    for(i=1;i<=n;i++)
    { 
    for(j=1;j<=n;j++)
     { 
     System.out.print(ch + "" );
     }
     System.out.print("\n");
    }
  }
  
 void polygon(int s,int f)
 {
   x=s;
   y=f;
   System.out.println("Enter the character");
    ch = sc.next().charAt(0);
   
   for(i=1;i<=x;i++)
   {
     for(j=1;j<=y;j++)
     {
       System.out.print(ch + "");
     }
     System.out.print("\n");
     
   }
 }

void polygon()
{
  System.out.println("Enter the no. of rows");
  x =sc.nextInt();
  System.out.println("Enter the character");
    ch = sc.next().charAt(0);
  
  for(i=1;i<x;i++)
  {
    for(j=1;j<=i;j++)
    {
      System.out.print(ch + "");
    }
  System.out.print("\n");
  }
}
}


