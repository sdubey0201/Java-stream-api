package com.sd.stream;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book>books;
    public Library() {
       books= new ArrayList<>();
       initializeLibrary();
    }
    public List<Book> getBooks() {
        return books;
    }
    public void addBook(Book book) {
        books.add(book);
    }
    private void initializeLibrary(){
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
        books.add(new Book("Moby-Dick", "Herman Melville", 1851));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813));
        books.add(new Book("War and Peace", "Leo Tolstoy", 1869));
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        books.add(new Book("Jane Eyre", "Charlotte Bronte", 1847));
        books.add(new Book("Brave New World", "Aldous Huxley", 1932));
        books.add(new Book("The Adventures of Huckleberry Finn", "Mark Twain", 1884));
        books.add(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997));
        books.add(new Book("The Hunger Games", "Suzanne Collins", 2008));
        books.add(new Book("The Book Thief", "Markus Zusak", 2005));
    }

    public static class Book {
        private String title;
        private String author;
        private int year;
        private String isbn;
        private String publisher;
        private String genre;
        private String language;
        private String format;
        private String cover;
        private String description;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;

        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getYear() {
            return year;
        }
    }

}
