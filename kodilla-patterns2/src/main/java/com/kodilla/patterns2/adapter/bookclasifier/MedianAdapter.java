package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book>
                booksListMap = new HashMap<>();

        for (com.kodilla.patterns2.adapter.bookclasifier.librarya.Book bookLyB : bookSet) {
            booksListMap.put(new com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature(bookLyB.getSignature()),
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(bookLyB.getAuthor(), bookLyB.getTitle(),
                            bookLyB.getPublicationYear()));
        }
        return medianPublicationYear(booksListMap);

    }
}
