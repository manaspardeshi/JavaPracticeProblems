public class FibonacciSeries {

    public void fibonacci() {
        //There are two ways 1: without using recursion 2:using recursion

        int n1 = 0, n2 = 1, n3, count = 10;
        System.out.println(n1 + " " + n2);
        for (int i = 2; i <= count; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }

    static int n1 = 0, n2 = 1, n3 = 0;
    public void fibonacci1(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            fibonacci1(count-1);

        }
    }
}
