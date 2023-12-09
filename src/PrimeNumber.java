public class PrimeNumber {

    public boolean isPrime(int n) {
        if (n <= 1) {
            System.out.println("Not a prime number");
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.println(n+": is not a prime number");
                    return false;

                }
            }
            System.out.println(n+" : is a prime number");
            return true;
        }
    }
}
