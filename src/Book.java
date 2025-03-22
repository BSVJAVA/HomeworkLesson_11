import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int yearOfPublication;

    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return "Название: " + this.title + ", Автор: " + this.getAuthor().toString() + ", Год публикации: " + yearOfPublication;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass()) return false;
        Book book = (Book) other;
        System.out.println("this.yearOfPublication = " + this.yearOfPublication);
        System.out.println("book.yearOfPublication = " + book.yearOfPublication);
        return this.title.equals(book.title) && this.author.equals(book.author) && this.yearOfPublication == book.yearOfPublication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title, this.author, this.yearOfPublication);
    }
}
