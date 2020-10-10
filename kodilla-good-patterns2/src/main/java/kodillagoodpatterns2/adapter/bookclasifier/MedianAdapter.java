package kodillagoodpatterns2.adapter.bookclasifier;

import kodillagoodpatterns2.adapter.bookclasifier.librarya.Book;
import kodillagoodpatterns2.adapter.bookclasifier.librarya.Classifier;
import kodillagoodpatterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, kodillagoodpatterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        for (Book book : bookSet) {
            books.put(new BookSignature(book.getSignature()),
                    new kodillagoodpatterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }
        return medianPublication(books);
    }
}
