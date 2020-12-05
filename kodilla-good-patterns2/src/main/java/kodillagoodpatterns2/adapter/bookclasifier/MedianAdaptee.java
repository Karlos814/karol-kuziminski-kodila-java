package kodillagoodpatterns2.adapter.bookclasifier;

import kodillagoodpatterns2.adapter.bookclasifier.libraryb.Book;
import kodillagoodpatterns2.adapter.bookclasifier.libraryb.BookSignature;
import kodillagoodpatterns2.adapter.bookclasifier.libraryb.BookStatistics;
import kodillagoodpatterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    private Statistics statistics = new Statistics();
    @Override
    public int averagePublication(Map<BookSignature, Book> books) {
        return statistics.averagePublication(books);
    }

    @Override
    public int medianPublication(Map<BookSignature, Book> books) {
        return statistics.medianPublication(books);
    }
}
