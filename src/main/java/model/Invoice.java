package model;
import java.util.*;

public class Invoice {
    private String buyer;
    private HashMap<String,Book> broughtBooks;
    private Integer totalPrice;

    public Invoice(String buyer, HashMap<String, Book> broughtBooks, Integer totalPrice) {
        this.buyer = buyer;
        this.broughtBooks = broughtBooks;
        this.totalPrice = totalPrice;
    }

    public Invoice() {
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public HashMap<String, Book> getBroughtBooks() {
        return broughtBooks;
    }

    public void setBroughtBooks(HashMap<String, Book> broughtBooks) {
        this.broughtBooks = broughtBooks;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
}
