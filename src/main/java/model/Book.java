package model;

import java.time.LocalDate;

public class Book {
    private Long id;
    private String title;
    private String author;
    private Integer stock;
    private Float price;


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    private LocalDate publishedDate;

    @Override
    public String toString()
    {
        return "Book: Id: " + id + ", Title: " + title +
                ", Author: " + author + ", Published date: "+ publishedDate + ", Stock: " + stock +
                " Price: " + price;
    }

}