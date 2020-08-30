/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    public String bookName;
    public String authorName;
    public long ISBNNumber;

    public Book(String bookName, String authorName, long ISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNNumber = ISBNNumber;
    }

    public String getbookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(long ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public String toString(){
        "Book Name:"+ getbookName()+","+
             return "Aurthor Name: "+getAuthorName()+","+
                "ISBN Number:"+getISBNNumber()+","+",";


    }
}




