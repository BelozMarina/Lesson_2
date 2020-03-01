package Lesson2;

public class lesson2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int rem = a % b;

//      Math actions
        System.out.println("Summation = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);
        System.out.println("Remainder of the division = " + rem);


//      Increment and Decrement

        int inc = 10;
        inc += a;

        int dec = 13;
        dec -= b;

        System.out.println("\n" + "Increment = " + inc);
        System.out.println("Decrement = " + dec);

//      Char type
        char ch1 = '\u265E';
        char ch2 = 'A';
        char ch3 = 116;

        System.out.println("\n" + ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }

}
