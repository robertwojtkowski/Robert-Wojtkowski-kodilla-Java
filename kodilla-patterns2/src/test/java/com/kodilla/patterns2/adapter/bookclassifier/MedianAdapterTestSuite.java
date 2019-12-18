package com.kodilla.patterns2.adapter.bookclassifier;
import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<BookA> books = new HashSet<>();
        books.add(new BookA("a", "b", 2005, "1"));
        books.add(new BookA("a", "b", 2002, "1"));
        books.add(new BookA("a", "b", 2009, "1"));
        books.add(new BookA("a", "b", 2003, "1"));
        books.add(new BookA("a", "b", 2012, "1"));
        books.add(new BookA("a", "b", 2001, "1"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(2005, median);
    }
}
