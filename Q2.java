import java.util.Scanner;
public class Q2
{
	public static void main(String[] args) {
	    Scanner inputs = new Scanner(System.in);
		System.out.print("Enter three sides in double: ");
		double side_1 = inputs.nextDouble();
		double side_2 = inputs.nextDouble();
		double side_3 = inputs.nextDouble();
	}
	 public static boolean isValid(double side1, double side2, double side3)
     {
         if (side1 + side2 > side3 && side2+side3>side1 && side1+side3>side2){
            System.out.println("this");
            return true;
         }
         else{
              System.out.println("this");
              return false;
         }
            
         
     }
}

