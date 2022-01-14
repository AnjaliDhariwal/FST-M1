package activities;

    abstract class Book {
        String strtitle;

        abstract void setTitle(String strVar);

        String getTitle() {
            return strtitle;
        }

    }

    class BookTitle extends Book {
        public void setTitle(String strVar) {
            strtitle = strVar;
        }
    }

public class Activity5 {
        public static void main(String args[]) {
            String strInput = "The Secret";
            Book obj = new BookTitle();
            obj.setTitle((strInput));
            System.out.println("Title is " + obj.getTitle());
        }
    }

