public class Main {
    public static void main(String[] args) {
       /*
       <<<Primitive Types>>>
            byte
            short
            int
            long
            float
            doable
            char
            boolean

       */

        //String is a sequence of characters
        String myString = "This is String";
        System.out.println("myString is equal to: " + myString);

        myString = myString + ", and this is more";
        System.out.println("myString is equal to: " + myString);

        myString = myString + " \u00A9 2018";
        System.out.println("myString is equal to: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49,95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);


    }
}
