package day3.basic;

public class OperatorsDemo7 {

    public static void main(String[] args) {
        //Ternary(conditional) Operator ?:

        int a = 4;
        int b = 6;
        if (a > b) {//true
            System.out.println("a is greater than b.");
        } else {//false
            System.out.println("b is greater than a.");
        }

        String r = (a > b) ? "a is greater than b." : "b is greater than a.";
        System.out.println(r);

        boolean rr = (a > b) ? true : false;
        System.out.println(rr);
    }
}
