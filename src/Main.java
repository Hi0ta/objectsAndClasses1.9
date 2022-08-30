public class Main {

    public static void main(String[] args) {

        Book warAndPeace = new Book("Война и мир", 2016);
        Author authorWarAndPeace = new Author("Лев", "Толстой");
        Book masterAndMargaret = new Book("Мастер и Маргарита", 2016);
        Author authorMasterAndMargaret = new Author("Михаил", "Булгаков");

        System.out.println("название книги: " + warAndPeace.getTitleBook());
        System.out.println("автор: " + authorWarAndPeace.getFirstName() + " " + authorWarAndPeace.getLastName());
        System.out.println("год выпуска: " + warAndPeace.getYearOfPublication());

        System.out.println();

        masterAndMargaret.setYearOfPublication(2020);
        System.out.println("название книги: " + masterAndMargaret.getTitleBook());
        System.out.println("автор: " + authorMasterAndMargaret.getFirstName() + " " + authorMasterAndMargaret.getLastName());
        System.out.println("год выпуска: " + masterAndMargaret.getYearOfPublication());

    }
}