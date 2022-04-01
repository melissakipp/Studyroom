package ReferenceVariables;

public class Books {

    String title;
    String author;

}

class BooksTestDriver {

    public static void main(String[] args) {

        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books(); // Initialize each element in the array
        myBooks[1] = new Books(); // Initialize each element in the array
        myBooks[2] = new Books(); // Initialize each element in the array
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x++;
        }

    }

}
