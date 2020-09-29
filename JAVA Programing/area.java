import java.util.Scanner;
class area
{
	public static void main()
	{
		over n=new over();
		n.display();
	}
}
class over
{
	int polygon(int x)
	{
		return(x*x);
	}
	int polygon(int x,int y)
	{
		return(x*y);
	}
	double polygon(double x,double y,double z)
	{
		return(x*y*z);
	}
	void display()
	{
		System.out.println("area of square is:"+polygon(5));
		System.out.println("area of rectangle is:"+polygon(5,8));
		System.out.println("area of cuboid is:"+polygon(5.8,6.7,8.9));
	}
}

