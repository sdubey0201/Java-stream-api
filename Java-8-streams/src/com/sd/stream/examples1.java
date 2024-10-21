package com.sd.stream;

import java.util.List;
import java.util.stream.Collectors;

public class examples1 {
    public static void main(String[] args) {
//        Using streams,
//        how would you find the titles of all the books
//        published after 2000?
        Library library=new Library();
        List<String> list = library
                .getBooks()
                .stream()
                .filter(book -> book.getYear() > 2000)
                .map(Library.Book::getTitle)
                .toList();
        System.out.println(list);
    }

}
