package ReferenceVariables;

import java.util.Objects;

public class Library {

    protected record Book(String title, String author) {

        @Override
        public String toString() {
            return "\"" + title + "\" by " + author;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            var that = (Book) obj;
            return Objects.equals(this.title, that.title) &&
                    Objects.equals(this.author, that.author);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title, author);
        }

    }

    public static void main(String [] args)
    {
        Book [] books = new Book[] {
                new Book("The Grapes of Java","bob"),
                new Book("The Java Gatsby","sue"),
                new Book("The Java Cookbook","ian"),
        };

        for (Book book:books) {
            System.out.println(book);
        }
    }

}
