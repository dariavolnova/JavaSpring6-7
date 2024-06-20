package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bookRead")
public class BookReader {
    private Book currentBook;
    private Book previosBook;

    @Autowired
    public BookReader(@Qualifier("firstBook") Book currentBook,
                      @Qualifier("secondBook") Book previosBook,
                      @Qualifier("thirdBook") Book nextBook) {
        this.currentBook = currentBook;
        this.previosBook = previosBook;
        this.nextBook = nextBook;
    }

    private Book nextBook;

}
