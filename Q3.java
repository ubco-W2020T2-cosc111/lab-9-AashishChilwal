import java.util.Scanner;
public class Q3
{
	public static void main(String[] args) {
	    Scanner palindrome = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int number_1 = palindrome.nextInt();
		 if (isPalindrome(number_1) == true) 
		    System.out.println(number_1+" is a Palindrome number.");
		 else 
		    System.out.println(number_1+" is not a Palindrome number.");
	}
    public static int reverse(int number){
        String reversed_s = ""; 
		String s_n = number + ""; 
		for (int i = s_n.length() - 1; i >= 0; i--) {
			reversed_s += s_n.charAt(i);
		}
		return Integer.parseInt(reversed_s); 
    }
    public static boolean isPalindrome(int number){
        if (number == reverse(number))
            return true;
        else 
            return false;
    }
}

