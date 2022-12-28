import java.util.Scanner;
public class AreaofRectangle {
  public static void main(String[] args){
    Scanner s = new Scanner (System.in);
    System.out.println("Enter the length: ");
    double l = s.nextDouble ();
    System.out.println("Enter the breadth: ");
    double b = s.nextDouble ();
    double area = l*b;
    System.out.println("The area of the Rectangla is:" +area);

  } 
}
