package inter_face;
//Shape.java
//Interface Shape

interface Shape {
 double getArea();
}
//Rectangle class

class Rectangle implements Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public double getArea() {
     return length * width;
 }
}
//Circle class

 class Circle implements Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double getArea() {
     return Math.PI * radius * radius;
 }
}
//Triangle class

 class Triangle implements Shape {
 private double base;
 private double height;

 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 @Override
 public double getArea() {
     return 0.5 * base * height;
 }
} 
//Main class

public class InterfaceMain {
 public static void main(String[] args) {
     
		Rectangle rectangle = new Rectangle(10, 12);
		
     Circle circle = new Circle(3);

		Triangle triangle = new Triangle(4, 6);

     System.out.println("Area of the Rectangle: " + rectangle.getArea());
     System.out.println("Area of the Circle: " + circle.getArea());
     System.out.println("Area of the Triangle: " + triangle.getArea());
 }
}
