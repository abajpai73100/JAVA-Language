import java.util.Scanner;
class GeometricObject{
  String color;
  boolean filled;
  java.util.Date dateCreated;
  Scanner sc=new Scanner(System.in);
  GeometricObject(){
    color="white";
    filled=false;
  }
  GeometricObject(String col,boolean fill){
    color=col;
    filled=fill;
  }
  String getColor(){
    return color;
  }
  void setColor(String color){
    this.color=color;
  }
  boolean isFilled(){
    return filled;
  }
  void setFilled(boolean filled){
    this.filled=filled;
  }
  java.util.Date getDateCreated(){
    java.util.Date dateCreated=new java.util.Date();
    return dateCreated;
  }
  String toOString(){
    return "The object is Geometric Shape";
  }
}

class Circle extends GeometricObject{
  double radius;
  Circle(){
    radius=0.0;
  }
  Circle(double radius){
    this.radius=radius;
  }
  Circle(double radius, String color, boolean filled){
    super(color,filled);
    this.radius=radius;
  }
  double getRadius(){
    return radius;
  }
  void setRadius(double radius){
    this.radius=radius;
  }
  double getArea(){
    return (3.14*radius*radius);
  }
  double Perimeter(){
    return (2*3.14*radius);
  }
  double Diameter(){
    return (2*radius);
  }
  void printCircle(){
    System.out.println(toOString());
    if(isFilled()){
      System.out.println("Color of object is : "+color);
      System.out.println("Date of creation of this object is : "+getDateCreated());
    }
    System.out.println("Radius of circle is : "+getRadius());
    System.out.println("Diameter of circle is : "+Diameter());
    System.out.println("Area of circle is : "+getArea());
    System.out.println("Perimeter of circle is : "+Perimeter());
    System.out.println("---------------------------------------------------------------------");
  }
}

class Rectangle extends GeometricObject{
  double width, height;
  Rectangle(){
    width=0.0;
    height=0.0;
  }
  Rectangle(double width,double height){
    this.width=width;
    this.height=height;
  }
  Rectangle(double width,double height,String color,boolean filled){
    super(color,filled);
    this.width=width;
    this.height=height;
  }
  double getWidth(){
    return width;
  }
  void setWidth(double width){
    this.width=width;
  }
  double getHeight(){
    return height;
  }
  void setHeight(double height){
    this.height=height;
  }
  double getArea(){
    return (width*height);
  }
  double getPerimeter(){
    return (2*(width+height));
  }
  void printRectangle(){
    System.out.println(toOString());
    if(isFilled()){
      System.out.println("Color of object is : "+color);
      System.out.println("Date of creation of this object is : "+getDateCreated());
    }
    System.out.println("Area of Rectangle is : "+getArea());
    System.out.println("Perimeter of Rectangle is : "+getPerimeter());
  }
}

class TestMain{
  public static void main(String args[]){
    Circle c=new Circle(4.12,"Red",true);
    c.printCircle();
    Rectangle r=new Rectangle(5.42,10.23,"Blue",true);
    r.printRectangle();
  }
}
