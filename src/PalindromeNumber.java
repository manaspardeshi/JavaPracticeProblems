import java.util.Scanner;

public class PalindromeNumber {
    public void isPalindrome() {

        int r, sum = 0, temp;
        int n = 454; //It is the number variable to be checked for palindrome

        temp = n;
        while (n > 0) {
            r = n % 10;  //getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }

    public void isPalindrome1() {
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string or number to check");
        original = sc.nextLine();
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse))
            System.out.println("Is a palindrome");
        else
            System.out.println("Not a palindrome");
    }
}

