package lessonObjectMethods10;

import java.util.Objects;

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


    @Override
    public boolean equals(Object other) {
        if (getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return titleBook.equals(book.titleBook);
    }

    //  @Override
    //public boolean equals(Object other) {
    //  if (this == other) return true;
    // if (other == null || getClass() != other.getClass()) return false;
    //Book book = (Book) other;
    //return titleBook.equals(book.titleBook);
    //}

    @Override
    public int hashCode() {
        return Objects.hash(titleBook);
    }

    @Override
    public String toString() {
        return "" + this.titleBook + this.author + ": " + this.yearOfPublication;
    }
}
