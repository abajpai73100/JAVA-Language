import java.util.Scanner;
class TA1Q1
{
  public static void main(String[] args)
  {
    Result r=new Result();
    r.inputDetails();
    r.assignMarks();
    r.totalMarks();
    r.printDetail();
  }
}
class Student{
  Scanner sc=new Scanner(System.in);
  long rollnumber;
  String name;
  void inputDetails(){
    System.out.print("Enter name : ");
    name=sc.nextLine();
    System.out.print("Enter rollnumber : ");
    rollnumber=sc.nextLong();
  }
}
class Exam extends Student{
  float marks[]=new float[6];
  void assignMarks(){
    for(int i=0;i<6;i++){
      System.out.print("Enter marks at subject "+(i+1)+": ");
    }
  }
}
class Result extends Exam{
  float total_marks=0;
  void totalMarks(){
    for(int i=0;i<6;i++){
      total_marks+=marks[i];
    }
  }
  void printDetail(){
    System.out.println("STUDENT'S DETAIL ARE FOLLOWS - : ");
    System.out.println("Roll number :"+rollnumber);
    System.out.println("Name : "+name);
    System.out.println("total marks are :"+total_marks);
  }
}

