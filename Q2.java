import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner inputs = new Scanner(System.in);
		System.out.print("Enter three sides in double: ");
		double side_1 = inputs.nextDouble();
		double side_2 = inputs.nextDouble();
		double side_3 = inputs.nextDouble();
		if (isValid(side_1,side_2,side_3) == true)
		    System.out.printf("Area: %.3f",area(side_1,side_2,side_3));
		else    
		    System.out.println("Invalid input. Try again.");
	}
	 public static boolean isValid(double side1, double side2, double side3)
     {
         if (side1 + side2 > side3 && side2+side3>side1 && side1+side3>side2)
            return true;
         
         else
              return false;
         }
    public static double area(double side1, double side2, double side3){
        double area_t;
        if (isValid(side1,side2,side3) == true ){
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        }
        else {
            return 0.0;
        }
       
    }
    }
