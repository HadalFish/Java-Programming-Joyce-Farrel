

import java.util.Scanner;

public class BookArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Book[] bookArray = new Book[10];
        boolean isFiction;
        String title;
        
        for(int i = 0; i < bookArray.length; i++) {
            System.out.print("Is the book fiction: ");
            isFiction = sc.nextBoolean();
            sc.nextLine(); 
            
            System.out.print("What is the book called: ");
            title = sc.nextLine();
            
            if(isFiction) {
                bookArray[i] = new Fiction(title);
                
                
            } else {
                bookArray[i] = new NonFiction(title);
            }
        }
        
        System.out.println("books: ");
        
        
        for(int i = 0; i < bookArray.length; i++) {
        	
            if(bookArray[i] instanceof Fiction) {
                System.out.println("Book " + (i+1) + " is Fiction"); 
                System.out.println("Title: " + bookArray[i].getTitle());
                System.out.println("Price: " + bookArray[i].getPrice());
                
            } else {
                System.out.println("Book " + (i+1) + " is Non Fiction");
                System.out.println("Title: " + bookArray[i].getTitle());
                System.out.println("Price: " + bookArray[i].getPrice());
                
                
            }
            System.out.println();
        }
    }
}
