package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;


public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        Library library = new Library("Art Books");
        Book book1 = new Book("Pink", "Jan Kowalski", LocalDate.of(2004, 8, 26));
        Book book2 = new Book("Black", "Joseph Nowak", LocalDate.of(2008, 4, 18));
        Book book3 = new Book("Red", "Kate Green", LocalDate.of(2011, 11, 24));

        HashSet<Book> booksList = new HashSet<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);

        for (Book theBooks : booksList) {
            library.getBooks().add(theBooks);

        }

            Library clonedLibrary = null;
            try {
                clonedLibrary = library.shallowCopy();
                clonedLibrary.getName();
            } catch (CloneNotSupportedException e) {
                System.out.println(e);
            }

            Library deepClonedLibrary = null;
            try {
                deepClonedLibrary = library.deepCopy();
                deepClonedLibrary.getName();
            } catch (CloneNotSupportedException e) {
                System.out.println(e);
            }

            //When
            library.getBooks().remove(book1);

            //Then
            System.out.println(library);
            System.out.println(clonedLibrary);
            System.out.println(deepClonedLibrary);
            Assert.assertEquals(2, library.getBooks().size());
            Assert.assertEquals(2, clonedLibrary.getBooks().size());
            Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
            Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
            Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
        }
    }







