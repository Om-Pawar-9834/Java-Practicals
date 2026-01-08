//     Create a class for an online bookstore inventory system featuring
//     attributes for title, author, price, ISBN and current stock level. the
//        program should be able to:

//     a.Present all book's information in a clear, user-friendly format:
//     i. Reduce its price by a specified percentage when a promotional
//     discount is applied.
//     ii. Increase its stock count when new copies arrive.
//     iii. Determine whether the book is available for purchase based
//     on stock.

//     b.Instantiate at least two distinct book examples (for instance, A
//     popular novel and a specialized textbook) and demonstrate each
//     of these capabilities for both instances.



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

