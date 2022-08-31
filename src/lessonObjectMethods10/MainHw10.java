package lessonObjectMethods10;

public class MainHw10 {


    public static void main(String[] args) {
        Author author = new Author("Макс", "Фрай");
        Book book = new Book("Чужак", author, 1996);

        Author author1 = new Author("Лев", "Толстой");
        Book book1 = new Book("Война и мир", author1, 2016);

        Author author2 = new Author("Михаил", "Булгаков");
        Book book2 = new Book("Мастер и Маргарита", author2, 2016);
        book.setYearOfPublication(2019);
        System.out.println(book);
        System.out.println(book1);

        book2.setYearOfPublication(2020);
        System.out.println(book2);

    }


}
