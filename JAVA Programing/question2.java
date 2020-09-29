class Shapes{
  void calculate(){
    System.out.println("I am parent's calculate");
  }
}
class Rectangle extends Shapes{
  int length,breath;
  Rectangle(){
    length=0;
    breath=0;
  }
  Rectangle(int l,int b){
    length=l;
    breath=b;
  }
  void calculate(){
    super.calculate();
    System.out.println("Area of Rectangle will be : "+(length*breath));
  }
}
class Triangle extends Shapes{
  int base,height;
  Triangle(int b,int h){
    base=b;
    height=h;
  }
  void calculate(){
    System.out.println("Area of Triangle will be : "+((base*height)/2));
  }
}

class Shapesmain{
  public static void main(String args[]){
    Rectangle r=new Rectangle(5,6);
    r.calculate();
    Triangle t=new Triangle(4,5);
    t.calculate();
  }
}
