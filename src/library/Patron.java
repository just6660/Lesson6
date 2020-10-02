
package library;

public class Patron {
    private String name;
    Book book1,book2,book3;
    
    
    public Patron(String n){
        name = n;
        book1 = null;
        book2 = null;
        book3 = null;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean Borrow(Book b){
        if(book1 == null){
            book1 = b;
            return true;
        }
        else if(book2 == null){
            book2 = b;
            return true;
        }
        else if(book3 == null){
            book3 = b;
            return true;
        }
        else
            return false;
        
    }
    
    public boolean returnBook(Book b){
        if(book1==b){
            book1 = null;
            return true;
        }
        else if(book2 == b){
            book2 = null;
            return true;
        }
        else if(book3 == b){
            book3 = null;
            return true;
        }
        else
            return false;
    }
    
    public boolean hasBook(Book b){
        if(book1 == b || book2 == b || book3 == b)
            return true;
        else
            return false;
    }
    
    
    
}
