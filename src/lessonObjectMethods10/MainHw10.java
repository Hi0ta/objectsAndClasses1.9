package lessonObjectMethods10;

import java.util.Arrays;

public class MainHw10 {

    private static Book[] getArrlibrary(Book[] arrlibrary, Book nextBook) {
        for (int i = 0; i < arrlibrary.length; ) {
            if (arrlibrary[i] != null) {
                i++;
            } else {
                arrlibrary[i] = nextBook;
                break;
            }
        }
        return arrlibrary;
    }

    public static void main(String[] args) {


        Author author1 = new Author("Лев", "Толстой");
        Book book1 = new Book("Война и мир", author1, 2016);

        Author author2 = new Author("Михаил", "Булгаков");
        Book book2 = new Book("Мастер и Маргарита", author2, 2016);

        book2.setYearOfPublication(2020);

        Book[] arrlibrary = new Book[5];
        arrlibrary[0] = book1;
        arrlibrary[1] = book2;
        Book nextBook = new Book(null, null, 0);

        Author author3 = new Author("Макс", "Фрай");
        Book book3 = new Book("Чужак", author3, 1996);
        nextBook = book3;
        getArrlibrary(arrlibrary, nextBook);

        Author author4 = new Author("Макс", "Фрай");
        Book book4 = new Book("Чужак", author4, 1996);
        book4.setYearOfPublication(2019);
        nextBook = book4;
        getArrlibrary(arrlibrary, nextBook);

        Author author5 = new Author("Макс", "Фрай");
        Book book5 = new Book("Дворы", author5, 2022);
        nextBook = book5;
        getArrlibrary(arrlibrary, nextBook);


        System.out.println(Arrays.toString(arrlibrary));

        //System.out.println(book1.hashCode() == book2.hashCode());
        //System.out.println(book1.equals(book2));
        //System.out.println(book3.hashCode() == book4.hashCode());
        //System.out.println(book3.equals(book4));

        // System.out.println(book1);
        // System.out.println(book2);
        // System.out.println(book3);


    }
}
