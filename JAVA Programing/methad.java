import java.util.Scanner;
class methad
{
    public static void main()
    {
    over a=new over();
    a.area(5);
    a.area(5,9);
    a.area(5,5,9);
     }
}
class over
{
    int j,k,l;
    void area(int x)
{
        l=x;
    System.out.println("area of squre"+(l*l));
}
void area(int x,int y)
{     
    l=x;
    j=y;
    System.out.println("areaof"+(l*j));
}
void area(int x,int y,int z)
{
    l=x;
    j=y;
    k=z;
    System.out.println("areaof"+(l*j*k));
}
}
    