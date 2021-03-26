import java.util.Scanner;
public class Q1
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter time in secs: ");
		int secs = input.nextInt();
		convertTime(secs);
	}
	 public static String convertTime(int totalSeconds)
	 {
	     String str1; 
	     int mins,seconds,hour; 
	     hour = totalSeconds/3600;
	     mins = totalSeconds/60;
	     seconds = totalSeconds%60;
	     str1 = String.valueOf(hour) + String.valueOf(mins)+String.valueOf(seconds);
	     System.out.println(hour+":"+mins+":"+seconds);
	     return str1;
	 }
}
