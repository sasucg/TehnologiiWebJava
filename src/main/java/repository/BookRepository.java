package repository;

import model.Invoice;
import model.Book;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookRepository {
    private HashMap<String, Book> books = new HashMap<String, Book>();
    private HashMap<String, Invoice> invoices = new HashMap<String, Invoice>();


    public BookRepository() {
        System.out.println("Repo constructed");
    }

    public HashMap<String, Book> getBooks() {
        return books;
    }

    public void setBooks(HashMap<String, Book> books) {
        this.books = books;
    }

    public HashMap<String, Invoice> getInvoices() {
        return invoices;
    }

    public void addBook(Book book) {
        this.books.put(book.getTitle(), book);
        System.out.println("The book was added successfully.");
    }

    public void deleteBook(Book book) {
        if (this.books.get(book.getTitle()) != null) {
            this.books.remove(book);
            System.out.println("The book was deleted.");
        } else {
            throw new IllegalArgumentException("The book: " + book.getTitle() + " doesn't exists.");
        }
    }

    public void addInvoice(Invoice invoice) {
        this.invoices.put(invoice.getBuyer(), invoice);
    }

    public void showBookStore() {
        System.out.println("Available books are: \n\t" + this.books.keySet());
    }

    public void checkInvoices() {
        System.out.println("Administrator only:!");
        for (Invoice i : this.invoices.values()) {
            System.out.println("Buyer: " + i.getBuyer());
            System.out.println("Brought books: \n\t" + i.getBroughtBooks().keySet());
            System.out.println("Total price of invoice: " + i.getTotalPrice());
        }
    }
}
