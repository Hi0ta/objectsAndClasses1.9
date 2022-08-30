public class Book {
    private String titleBook;
    private int yearOfPublication;

    public Book(String titleBook, int yearOfPublication) {
        this.titleBook = titleBook;
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
