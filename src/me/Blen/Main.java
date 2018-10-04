package me.Blen;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    //array list that contains the list of books
    static ArrayList<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here
    //ImageIcon image = new ImageIcon("C:\\Users\\GBTC440017ur\\IdeaProjects\\LibraryApplication");

        Add();
        System.out.println("What do want to do now, take a look the list of the books, borrow books, or return a book. Write, B for borrow, and L for lists and R for return ");
        String userChoice = scan.nextLine();
        if(userChoice.equalsIgnoreCase("b")){
            Borrow();
        }else if(userChoice.equalsIgnoreCase("l")){
            List();
        }else if(userChoice.equalsIgnoreCase("R")){
            Return();
        }

    }

    public static void  Add(){
        //creating a book  instance
        Book singleBook = new Book();

        //prompting the user to add a book
        System.out.println("Hello, please start by adding a book");
        //prompting the user to add the book title
        System.out.println("What is the title of the book");
        //the user adding a title
        String bookTitle= scan.nextLine();

        //prompting the user to add the author
        System.out.println("What is the Author of the book");
        String bookAuthor = scan.nextLine();

        //prompting the user to add a the year
        System.out.println("When was the book published");
        int bookYear = scan.nextInt();
        scan.nextLine();

        //prompting the user to add the ISBM number if he has it
        System.out.println("Enter the ISBN number");
        int bookISBN = scan.nextInt();
        scan.nextLine();

        //setting the initialized book to the object instance single book
        singleBook.setAuthor(bookAuthor);
        singleBook.setTitle(bookTitle);
        singleBook.setYear(bookYear);
        singleBook.setIsbnNum(bookISBN);
        singleBook.setBorrowed(false);

        //adding the instance object to the array list
        bookList.add(singleBook);
    }

    //method to borrow books
    public static void Borrow(){
        for(Book eachBook : bookList) {
            if(eachBook.isBorrowed()){
                eachBook.setBorrowed(true) ;
                System.out.println("You have borrowed the book with the title " + eachBook.getTitle());
            }
            System.out.println("Sorry the book is borrowed to another user");
        }
    }

    //method to show list of Books
    public static void List(){
        for(Book eachBook : bookList){
            System.out.println("The title of the book is " + eachBook.getTitle() + "\n The author of the book is  " + eachBook.getAuthor() + "\n The book was published on " + "and the book's ISBM  number is " + eachBook.getIsbnNum()) ;
        }
    }

    //method book return
    public static void Return(){
        for(Book eachBook : bookList){
            if(!eachBook.isBorrowed()){
                eachBook.setBorrowed(false);
                System.out.println("Thank you for returning the book");
            }else{
                System.out.println("Sorry this book is already returned");
            }
        }
    }
}
