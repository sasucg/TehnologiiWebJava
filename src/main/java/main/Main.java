package main;

import config.ProjectConfig;
import model.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.BookService;

import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        BookService service = context.getBean(BookService.class);

        service.addBook("The Outsider","Stephan King","Fantasy ",30, true);
        service.addBook("Game of Thrones","George R.R Martin","Fantasy ",45, true);
        service.addBook("You","Barbara Mendez","Drama ",52, true);

        HashMap<String,Book> broughtBooks = new HashMap<String, Book>();
        Book b1 = new Book("The Outsider","Stephan King","Fantasy ",30, true);
        Book b2= new Book("Game of Thrones","George R.R Martin","Fantasy ",45, true);
        Book b3 = new Book("You","Barbara Mendez","Drama ",52, true);
        broughtBooks.put(b1.getTitle(), b1);
        broughtBooks.put(b2.getTitle(), b2);
        broughtBooks.put(b3.getTitle(), b3);

        service.addInvoice("Catalin", broughtBooks);

        service.showBookStore();

        service.checkInvoices();

    }
}
