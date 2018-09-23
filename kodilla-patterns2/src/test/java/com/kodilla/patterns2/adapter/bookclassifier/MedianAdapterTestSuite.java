package com.kodilla.patterns2.adapter.bookclassifier;


import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedian() {
        //Given
        Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> books = new HashSet();
            com.kodilla.patterns2.adapter.bookclasifier.librarya.Book book1 = new
                    com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("Jhon White", "Red", 1956,
                    "BK4567");
            com.kodilla.patterns2.adapter.bookclasifier.librarya.Book book2 = new
                    com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("Kevin Black", "Blue", 2001,
                    "KJ2345");
            com.kodilla.patterns2.adapter.bookclasifier.librarya.Book book3 = new
                    com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("Veronica Velvet", "Green", 1746,
                    "DE4567");

            books.add(book1);
            books.add(book2);
            books.add(book3);


            MedianAdapter medianAdapter = new MedianAdapter();

            //When
            int publicationYearMedian = medianAdapter.publicationYearMedian(books);
            //Then
            System.out.println(publicationYearMedian);
            assertEquals(publicationYearMedian, 1956, 0);

        }
    }
