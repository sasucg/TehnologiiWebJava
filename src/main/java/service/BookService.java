package service;

import model.Book;
import model.Invoice;
import org.springframework.stereotype.Service;
import repository.BookRepository;

import java.util.HashMap;


@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title, String author, String category, Integer price, boolean onStock) {
        Book book = new Book(title, author, category, price, onStock);
        bookRepository.addBook(book);
    }

    public void deleteBook(Book book) {
        bookRepository.deleteBook(book);
    }

    public void showBookStore() {
        this.bookRepository.showBookStore();
    }

    public void addInvoice(String buyer, HashMap<String,Book> broughtBooks) {
        Invoice invoice = new Invoice();
        invoice.setBuyer(buyer);
        invoice.setBroughtBooks(broughtBooks);
        Integer totalPrice = 0;

        for(Book b : broughtBooks.values()) {
            totalPrice += b.getPrice();
            if(this.bookRepository.getBooks().get(b.getTitle()) == null) {
                throw new IllegalArgumentException ("The book: "+ b.getTitle() + " doesn't exists. Invoice not created");
            }
        }

        invoice.setTotalPrice(totalPrice);
        this.bookRepository.addInvoice(invoice);
    }
    public void checkInvoices() {
        this.bookRepository.checkInvoices();
    }
}