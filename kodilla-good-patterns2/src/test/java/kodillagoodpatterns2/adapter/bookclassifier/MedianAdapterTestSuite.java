package kodillagoodpatterns2.adapter.bookclassifier;

import kodillagoodpatterns2.adapter.bookclasifier.MedianAdapter;
import kodillagoodpatterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book = new Book("karl", "ciekawosc swiata", 2020, "1");
        Book book1 = new Book("arek", "nic ciekawego", 2010, "2");
        Book book2 = new Book("tomek", "kodowanie", 2000, "3");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book);
        bookSet.add(book1);
        bookSet.add(book2);
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2010, median);
    }
}
