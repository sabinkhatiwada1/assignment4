package service;

import model.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    void deleteBook( String isbn);
    void updateBook(Book book,String isbn);

    List<Book> getAllBook();


}
