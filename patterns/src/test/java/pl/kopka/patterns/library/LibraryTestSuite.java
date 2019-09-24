package pl.kopka.patterns.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        Library library = new Library("Library");

        IntStream.iterate(1, n -> n+1)
                .limit(3)
                .forEach(n -> library.getBooks().add(new Book("Book " + n, "Author", new Date())));


        Library libraryShallowCopy = null;
        try{
            libraryShallowCopy = library.shallowCopy();
        }catch (CloneNotSupportedException e ){
            System.out.println(e);
        }



        Library deepClonedLibrary = null;

        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.name = "Library Deep Cloned";

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Assert.assertEquals(3, library.books.size());
        Assert.assertEquals(3, libraryShallowCopy.books.size());
        Assert.assertEquals(library.books, libraryShallowCopy.books);


        Assert.assertEquals(3, library.books.size());
        Assert.assertEquals(3, deepClonedLibrary.books.size());

        library.getBooks().add(new Book("Test", "test", new Date()));

        Assert.assertEquals(4, library.books.size());
        Assert.assertEquals(3, deepClonedLibrary.books.size());



    }
}
