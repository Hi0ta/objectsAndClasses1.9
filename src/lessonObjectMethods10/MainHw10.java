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
        Book[] arrlibrary = new Book[5];
        Book nextBook = new Book(null, null, 0);
        Author nextAuthor = new Author(null, null);

        nextAuthor = new Author("Лев", "Толстой");
        nextBook = new Book("Война и мир", nextAuthor, 2016);
        getArrlibrary(arrlibrary, nextBook);

        nextAuthor = new Author("Михаил", "Булгаков");
        nextBook = new Book("Мастер и Маргарита", nextAuthor, 2016);
        getArrlibrary(arrlibrary, nextBook);
        nextBook.setYearOfPublication(2020);

        //Book[] arrlibrary = new Book[5];
        //arrlibrary[0] = book1;
        //arrlibrary[1] = book2;
        //Book nextBook = new Book(null, null, 0);


        nextAuthor = new Author("Макс", "Фрай");
        nextBook = new Book("Чужак", nextAuthor, 1996);
        getArrlibrary(arrlibrary, nextBook);

        nextAuthor = new Author("Макс", "Фрай");
        nextBook = new Book("Чужак", nextAuthor, 1996);
        nextBook.setYearOfPublication(2019);
        getArrlibrary(arrlibrary, nextBook);

        nextAuthor = new Author("Макс", "Фрай");
        nextBook = new Book("Дворы", nextAuthor, 2022);
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
