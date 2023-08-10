package lesson49;

public class Test {

    public static void main(String[] args) {

        //counter(3);

        // 4! = 4 * 3 * 2 * 1
        // 1! = 1
        // 15! = 15 * 14 * 13 * ... * 1
        // 0! = 1

        System.out.println(fac(4));

    }

    // someMethod() -> someMethod() -> someMethod()

    // counter(3) -> counter(2) -> counter(1)

    // counter(3)
    // counter(2)
    // counter(1)
    // counter(0)

    /*
    private static void counter(int n) {

       // System.out.println("Hello");
       // someMethod();

        if (n == 0) return;

        System.out.println(n);

        counter(n-1); // 3, 2, 1

    }
    */

    // fac(4)
    // 4 * 6 = 24
    // 3 * 2 = 6
    // 2 * 1
    // fac(1) = return 1;

    private static int fac(int n) {
        if ( n == 1 ) return 1;

        return n * fac(n - 1);
    }

}