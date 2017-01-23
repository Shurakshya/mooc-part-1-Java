
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shurakshyakharel
 */
public class Library {
    private ArrayList<Book> books;

    
    public Library(){
        this.books = new ArrayList<Book>();
        
    }
    
    public void addBook(Book newBook){
        books.add(newBook);
        
    }
    
    public void printBooks(){
        for(Book book : books){
            System.out.println(book);
        }    
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> result = new ArrayList<Book>();
        for(Book b : books){
            if(StringUtils.included(b.title(), title)){
                result.add(b);            
            }   
        }
        return result;                
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> result = new ArrayList<Book>();
        for(Book b : books){
            if(StringUtils.included(b.publisher(),publisher )){
                result.add(b);
            }         
        }
        return result;   
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> result = new ArrayList<Book>();
        for(Book b : books){
            if(b.year()==year){
                result.add(b);
            }         
        }
        return result;
    }
    
}
    
