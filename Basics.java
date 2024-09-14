public class Basics {
    public static void main(String[] args) {
        /*  
         *  Scroll down and complete the tasks in each function/method
         *  The instructions will be written in comments, like this
         *  Once you have completed the intructions in a method, come
         *  back here and call that method. For the first method, the code
         *  to call the method is already written.
        */ 
        introToPrinting();
    }

    public static void introToPrinting() {
        /* 
         *  System.out.println() is a method in java that will print whatever
         *  is inside the parentheses () to the console. Currently, the code
         *  in this method introToPrinting() prints "Hi" to the console.
         *  Click the run button between lines 1 and 2 to see this.
         *
         *  Now try to edit the code so that it prints your name to the console
        */

        System.out.println("hi");

        /*  Note that the code above ends with a semicolon (;)
        Semicolons are used to end statements in java */
    }

    public static void printingNumbers() {
        /*
         * Now try to print a number, such as 2. To do this, rewrite the code
         * from the last method, but replace "hi" with 2. Note that you do not
         * need the quotes to print the number.
         */

         /*
          * To call this method, replace line 10 with printingNumbers();
          * In java, to call (run) a method, you first type the name of the
          * method (case-sensitive), and then follow it with parentheses. 
          * Finally, you add a semicolon to end the statement.
          */
    }

    public static void operationsWithNumbers() {
        /*
         * Java has math built in. To demonstrate this, lets print the results
         * of different operations. Below is code that will print the result of
         * 4 + 2 and another line that prints the result of 4 - 2.
         * Use this same structure to print the result of 4 * 2, 4 / 2, and 4 % 2
         */
        
        /*
         * Similar to the last method, to call this method replace line 10 with
         * operationsWithNumbers();
         */

        System.out.println(4 + 2);
        System.out.println(4 - 2);
    }

    public static void stringConcatination() {
        /*
         * Most of the operators shown above only make sense for numbers. However,
         * you can actually use the plus operator with Strings too. Below, add a third
         * String that has your name to the end, and try running the code.
         */

        System.out.println("My name " + " is ");
    }

    public static void introToVariables() {
        /*
         * Often, we don't want to just print a value. Instead we want to store it,
         * and use it later. This is what variables are for. Below we create two 
         * variables, and assign them to the values 5 and 10 respectivly.
         * Notice how for number1, we declare the assign the variable in one line,
         * but for number2 we declare the variable in one line and assign it in a differnet
         * one. When we declare a variable in java, we first have to put its type.
         * The type of both of these variables is int, which represents an interger.
         * 
         * Later in the method, the variables are referenced in the println() method,
         * and are treated like they themselves are numbers. Try creating a third
         * variable, also of type int, assigning it a value, and adding it to the
         * print statement.
         */
        int number1 = 5;
        int number2;
        number2 = 10;

        System.out.println(number1 + number2);
    }


}
