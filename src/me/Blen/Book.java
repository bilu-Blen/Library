package me.Blen;

public class Book {
    private String title;
    private String author;
    private int year;
    private int isbnNum;
    public boolean borrowed;

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIsbnNum() {
        return isbnNum;
    }

    public void setIsbnNum(int isbnNum) {
        this.isbnNum = isbnNum;
    }
//    private image;

}
