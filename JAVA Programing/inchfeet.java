import java.util.Scanner;
class inchfeet
{
    public static void main(String[] args)
    {
        name a=new name();
        name b=new name();
        a.input();
        b.input();
        a.add(b);
        a.display();
    }
}
class name
{ 
    Scanner sc=new Scanner(System.in);
    int feet,inch;
void input()
{
    System.out.println("enter feet");
    feet=sc.nextInt();
    System.out.println("enter inch");
    inch=sc.nextInt();
}
    name()
    {
    feet=5;
    inch=6;
   }
name(int x,int y)
{
    feet=x;
    inch=y;
}
name(name na)
{
    feet=na.feet;
    inch=na.inch;
}
void add(name d)
{
    feet=d.feet+feet;
    inch=d.inch+inch;
    if(inch>=12)
    {
        feet=feet+(inch/12);
        inch=inch%12;
    }
}
void display()
{
System.out.println(feet+"feet"+inch+"inch");
}
}

            