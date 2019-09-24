package pl.kopka.patterns.library;

import java.time.LocalDate;
import java.util.Date;

public final class Book {
    final String title;
    final String author;
    final Date publicationDate;

    public Book(final String title, final String author, final Date publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
