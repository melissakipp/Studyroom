package main.java.info.headfirstjava;

public class BeTheCompiler {
    public static void main(String[] args) {
        /* *
         * Exercise A
         * */
        /*
        int x = 1;
        while (10 >= x) {
            x += 1;
            if (x > 3) {
                System.out.println("big x");
            } else {
                System.out.println("little x");
            }
        }
        /*
         */
        /* *
         * My version
         * */
        /*
        int i = 1, n = 5;
        do {
            if (i > 3) {
                System.out.println(i + " big num");
            } else {
                System.out.println(i + " little num");
            }
            i++;
        } while (i <= n);
    }
    */
        /* *
         * Exercise B
         * */
        /*
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }*/
        /* *
         * Exercise C
         * */
        int x = 5;
        while (x > 1) {
            x--;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }
}
