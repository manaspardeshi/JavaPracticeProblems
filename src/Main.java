import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println("Hello world!");
//        int a=74;
//        int b=36;
//        int sum=a+b;
//        System.out.println("sum:"+ (a+b));
//
//        int num;
//        System.out.println("Enter number");
//
//        Scanner scanner = new Scanner(System.in);
//        num = scanner.nextInt();
//        System.out.println("Entered Integer is :" + num);
//
//        BufferedReader reader = new BufferedReader(
//                new InputStreamReader(System.in));
//
//        String name = reader.readLine();
//        System.out.println("Name :"+name);
//
//        Practice practice=new Practice();
//        practice.swapVariables4(10,5);
//
//        FibonacciSeries fibonacciSeries=new FibonacciSeries();
//        fibonacciSeries.fibonacci();
//        fibonacciSeries.fibonacci1(10);
//
//        PrimeNumber primeNumber=new PrimeNumber();
//        primeNumber.isPrime(6);
//        primeNumber.isPrime(17);
//        primeNumber.isPrime(9);
//
//        PalindromeNumber palindromeNumber=new PalindromeNumber();
//        palindromeNumber.isPalindrome1();
//
//        LongestSubstringWithoutRepetation longestSubstringWithoutRepetation = new LongestSubstringWithoutRepetation();
//        longestSubstringWithoutRepetation.longestSubstring();

        RomanToInteger romanToInteger=new RomanToInteger();
        romanToInteger.romanToInteger("XII");
    }
}