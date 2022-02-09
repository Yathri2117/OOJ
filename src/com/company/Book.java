package com.company;

import java.util.Scanner;
import java.lang.*;

public class Book {
    String name, author;
    float price;
    int num_pages;

    Book(String name, String author, float price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    public Book() {
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the Book: ");
        name = sc.nextLine();
        System.out.println("Enter the Author of the Book: ");
        author = sc.nextLine();
        System.out.println("Enter the Price of the Book:");
        price = sc.nextFloat();
        System.out.println("Enter the no.of pages in the Book: ");
        num_pages = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", num_pages=" + num_pages +
                '}';
    }
}
class main{
    public static void main(String args[]) {
        Book b1 = new Book("Java The Complete reference", "Herbert Schildt", 999, 1123);
        System.out.println("Constructor value is : \n" + b1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of books: ");
        int n = sc.nextInt();
        Book b[] = new Book[n];
        for (int i = 0; i < n; i++) {
            b[i] = new Book();
            System.out.println("Enter BooK Details !!!");
            b[i].accept();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Details of the Book!!!");
            System.out.println(b[i]);
        }
    }
}

