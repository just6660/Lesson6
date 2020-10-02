
package library;

public class Book {
    private String title, author;
    
    public Book(String t, String a){
        title = t;
        author = a;
    }
    
    public String toString(){
        String str;
        str = (title + "| By: " + author);
        return str;
    }
    public String getTitle(){
        return title; 
    }
    
}
