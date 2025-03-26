package day3.basic;

public class OperatorsDemo1 {

    public static void main(String[] args) {
        //1.Arithmetic Operators: + - / * %
        //Priority: + - (Low) / * % (high)
        //Associativity: Left to Right

        int a = 4 + 2 - 7 / 2 + 2 * 3 - 7 % 3;
        a = 4 + 2 - 3 + 2 * 3 - 7 % 3;
        a = 4 + 2 - 3 + 6 - 7 % 3;
        a = 4 + 2 - 3 + 6 - 1;
        a = 6 - 3 + 6 - 1;
        a = 3 + 6 - 1;
        a = 3 + 5;
        a = 8;
        System.out.println(a);
    }
}
