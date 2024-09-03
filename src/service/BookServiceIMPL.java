package service;

import db.Connection;
import model.Book;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BookServiceIMPL implements BookService {
    @Override
    public void addBook(Book book) {
        String sql = "Insert into book(title, author, isbn) Values(?,?,?)";
            try{
                PreparedStatement ppdstmnt = Connection.getConnection().prepareStatement(sql);
                ppdstmnt.setString(1, book.getTitle());
                ppdstmnt.setString(2,book.getAuthor());
                ppdstmnt.setString(3,book.getIsbn());
                ppdstmnt.executeUpdate();

            } catch (SQLException e) {

               e.printStackTrace();
            }

    }

    @Override
    public void deleteBook(String isbn) {

    }

    @Override
    public void updateBook(Book book,String isbn) {

    }

    @Override
    public List<Book> getAllBook() {
        return null;
    }
}
