package com;

class BookStore {

    String title;
    String author;
    int price;
    int ISBN;
    int currentStock;

    public BookStore(String title, String author, int price, int ISBN, int currentStock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.ISBN = ISBN;
        this.currentStock = currentStock;
    }

    void displayDetails() {
        System.out.println("----- BOOK DETAILS -----");
        System.out.println("Title         : " + title);
        System.out.println("Author        : " + author);
        System.out.println("Price         : ₹" + price);
        System.out.println("ISBN          : " + ISBN);
        System.out.println("Current Stock : " + currentStock);
        System.out.println();
    }

    void applyDiscount(int percentage) {
        int discount = (price * percentage) / 100;
        price = price - discount;
    }

    void increaseStock(int newStock) {
        currentStock += newStock;
    }

    boolean isAvailable() {
        return currentStock > 0;
    }
}

public class Practical_1 {

    public static void main(String[] args) {

        BookStore novel = new BookStore("ABC", "Om Pawar", 500, 12345, 5);
        BookStore textbook = new BookStore("XYZ", "Vikram Nimbalkar", 300, 67890, 0);

        System.out.println("BEFORE UPDATE - NOVEL");
        novel.displayDetails();

        System.out.println("BEFORE UPDATE - TEXTBOOK");
        textbook.displayDetails();

        novel.applyDiscount(10);
        textbook.applyDiscount(20);

        novel.increaseStock(10);
        textbook.increaseStock(15);

        System.out.println("AFTER UPDATE - NOVEL");
        novel.displayDetails();

        System.out.println("AFTER UPDATE - TEXTBOOK");
        textbook.displayDetails();

        System.out.println("Novel Available : " + novel.isAvailable());
        System.out.println("Textbook Available : " + textbook.isAvailable());
    }
}
