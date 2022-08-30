public class Book {
    private final String titleBook;
    private final Author author;
    private int yearOfPublication;

    public Book(String titleBook, Author author, int yearOfPublication) {
        this.titleBook = titleBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }


    public String getTitleBook() {
        return this.titleBook;
    }


    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

}
