import java.util.Scanner;
class AreaOfCircle 
{
   public static void main(String args[]){
    Double PI = 3.14;
       
      Scanner s = new Scanner (System.in);
      System.out.println("Enter the radius: ");
      double r = s.nextDouble();
      double area = (PI*r*r);
      System.out.println("The Area of The Circle is :" + area);
   }

  }

