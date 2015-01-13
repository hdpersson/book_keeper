/**
 * Created by Heather on 1/13/2015.
 */
package net.persson.book_keeper;

public class Book {

    //private variables
    int id;			//id number for table
    String isbn;  	//isbn for book
    String title;  	//book title
    String author;  //book author
    int status;		//1 = read, 2 = reading, 3 = wishlist
    int rating;		//1- 5 rating system
    String dateRead;	//date book read
    String comments;//comments on book

    //empty constructor
    public Book(){

    }

    //constructor
    public Book(String isbn, String title, String author, int status, int rating, String dateRead, String comments){
        super();
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.status = status;
        this.rating = rating;
        this.dateRead = dateRead;
        this.comments = comments;

    }

    //get isbn
    public String getIsbn(){
        return this.isbn;
    }

    //set isbn
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    //get id
    public int getId(){
        return this.id;
    }

    //set id
    public void setId(int id){
        this.id = id;
    }

    //get title
    public String getTitle(){
        return this.title;
    }

    //set title
    public void setTitle(String title){
        this.title = title;
    }

    //get author
    public String getAuthor(){
        return this.author;
    }

    //set author
    public void setAuthor(String author){
        this.author = author;
    }

    //get status
    public int getStatus(){
        return this.status;
    }

    //set status
    public void setStatus(int status){
        this.status = status;
    }

    //get rating
    public int getRating(){
        return this.rating;
    }

    //set rating
    public void setRating(int rating){
        this.rating = rating;
    }

    //get dateRead
    public String getDateRead(){
        return this.dateRead;
    }

    //set dateRead
    public void setDateRead(String dateRead){
        this.dateRead = dateRead;
    }

    //get comments
    public String getComments(){
        return this.comments;
    }

    //set comments
    public void setComments(String comments){
        this.comments = comments;
    }

    //to string
    public String toString(){
        return "Book [ID: " + id + ", isbn: " + isbn + ", title: " + title + ", author: "
                + author + ", status: " + status + ", rating: " + rating + ", dateRead: "
                + dateRead + ", comments: " + comments + "]";
    }
}
