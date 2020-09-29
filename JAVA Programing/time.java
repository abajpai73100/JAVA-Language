import java.util.Scanner;

class time
{
    int h,m,s;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("enter hourse");
        h=sc.nextInt();
        System.out.println("enter minuts");
        m=sc.nextInt();
        System.out.println("enter second");
        s=sc.nextInt();
    }
    void compute(time t)
    {
        h=h+t.h;
        m=m+t.m;
        s=s+t.s;
        if(s>=60)
        {
            m=m+(s/60);
            s=s%60;
        }
        if(m>=60)
        {
            h=h+(m/60);
            m=m%60;
        }
    }
        void display()
        {
            System.out.println(h+"hourse "+m+"minutes "+s+"seconds");
        }
    }
class hourse
{
    public static void main(String[] args)
    {
        time a=new time();
        time b=new time();
        a.input();
        b.input();
        a.compute(b);
        a.display();
    }
}