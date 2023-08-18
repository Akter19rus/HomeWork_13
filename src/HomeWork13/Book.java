package HomeWork13;

import java.util.Objects;

public class Book {
    private String publisher;
    private Author author;
    private int publicationYear;

    public Book(String publisher, Author author, int publicationYear) {
        this.publisher = publisher;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public Author getAuthor() {
        return  this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return ("Название книги: " + this.publisher + ", автор: " + this.author + ", год издания: " + this.publicationYear);
    }

    public static void delimiter() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Book book = (Book) obj;
        return publicationYear == book.publicationYear && Objects.equals(publisher, book.publisher) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(publisher, author, publicationYear);
    }
}
