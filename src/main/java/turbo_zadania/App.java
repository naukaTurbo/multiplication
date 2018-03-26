package turbo_zadania;

import turbo_zadania.ex1.Multiplication;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Multiplication multiplication = new Multiplication();
        System.out.println(multiplication.minus(10,3));
        System.out.println(multiplication.modulo(16,3));
        System.out.println(multiplication.multiplyBy2(7));
    }
}
