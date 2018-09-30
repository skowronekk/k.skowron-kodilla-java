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

        for (com.kodilla.patterns2.adapter.bookclasifier.librarya.Book bookLyA : bookSet) {
            booksListMap.put(new com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature(bookLyA.getSignature()),
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(bookLyA.getAuthor(), bookLyA.getTitle(),
                            bookLyA.getPublicationYear()));
        }
        return medianPublicationYear(booksListMap);

    }
}
