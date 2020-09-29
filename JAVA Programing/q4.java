import java.util.*; 
class q4 
{
 public static void main()
 {
   books B = new books();
   B.input();
   B.compute();
   B.display();
  }
}
class books
{
  int acc_num;
  String title;
  String author;
  int fine;
  int late;
  
  Scanner sc = new Scanner(System.in);
  
  void input()
  {
    System.out.println("Enter the no.");
    acc_num = sc.nextInt();
    System.out.println("Enetr author");
    author = sc.nextLine();
    System.out.println("Enter title");
    title =sc.nextLine();
 
  }  
    void compute()
    {
      System.out.println("Enter the days late");
      late = sc.nextInt();
      if(late>5)
      {
        fine  = late*2;
        }
        else
        {
          System.out.println("no fine");
        }
    }
  
  void display()
  {
    System.out.println("details are:");
    System.out.println(acc_num);
    System.out.println(title); 
    System.out.println(author);
    System.out.println(fine);
  }
}


