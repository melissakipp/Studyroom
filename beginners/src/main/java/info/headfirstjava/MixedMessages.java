package main.java.info.headfirstjava;

public class MixedMessages {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
//            y = x -y;
            y = y + x;
            System.out.print(x + "" + y + " ");
            x++;
        }
    }
}
