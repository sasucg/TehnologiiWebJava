package model;

public class Book {
    private String title;
    private String author;
    private String category;
    private Integer price;
    private boolean onStock;

    public Book(String title, String author, String category, Integer price, boolean onStock) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.onStock = onStock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public boolean isOnStock() {
        return onStock;
    }

    public void setOnStock(boolean onStock) {
        this.onStock = onStock;
    }
}
