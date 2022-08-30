public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Лев", "Толстой");
        Book book1 = new Book("Война и мир", author1,  2016);

        Author author2 = new Author("Михаил", "Булгаков");
        Book book2 = new Book("Мастер и Маргарита", author2, 2016);

        System.out.println("название книги: " + book1.getTitleBook());
        System.out.println("автор: " + author1.getFirstName() + " " + author1.getLastName());
        System.out.println("год выпуска: " + book1.getYearOfPublication());

        System.out.println();
        book2.setYearOfPublication(2020);

        System.out.println("название книги: " + book2.getTitleBook());
        System.out.println("автор: " + author2.getFirstName() + " " + author2.getLastName());
        System.out.println("год выпуска: " + book2.getYearOfPublication());

    }
}