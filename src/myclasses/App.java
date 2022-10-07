/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;
import java.util.Arrays;
import java.util.Scanner;
import tools.Tools;

public class App {
    
    public void run(){
        Scanner scanner = new Scanner(System.in);
     //   Book book2 = new Book();
     //   book2.setTitle("Learning JavaEE7");
     //  book2.addAuthor(createAuthor("Antonio", "Gonsalves"));
     //  System.out.println(book2.toString());
        Tools tools = new Tools();
        Book book = tools.createBook("Book Ivana");
        book.addAuthor(tools.createAuthor("Ivan","Ivanov"));
        System.out.println(book.toString());
        Book[]books = new Book[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Название книги: ") ;
            String title = scanner.nextLine();
            book = new Book();
            book.setTitle(title);
            System.out.println("Сколько авторов в этой книге: ");
            int countAuthorsInBook = scanner.nextInt();
            scanner.nextLine();
            for (int j = 0; j < countAuthorsInBook; j++){      
                System.out.println("Имя автора"+(j+1)+": ");
                String firstname = scanner.nextLine();
                System.out.println("Фамилия автора"+(j+1)+": ");
                String lastname = scanner.nextLine();
                book.addAuthor(tools.createAuthor(firstname, lastname));
            }
            books[i] = book;
        }
        System.out.println(Arrays.toString(books));
 
   }
   
}
