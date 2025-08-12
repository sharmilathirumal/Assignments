package org.example;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner s= new Scanner(System.in);
        System.out.println("----------WELCOME------------\nplease enter your choice\n1.Add Book\n2.Remove Book\n3.reduce count\n4.Search Book\n5.Display Book");
        int choice = s.nextInt();
        while(choice>0 && choice<=5) {
            switch(choice){
                case 1:{
                    System.out.println("only admin allowed to add the book ,are you the admin?");
                    String permission =s.next();
                    s.nextLine();
                    if(permission.equals("yes")) {
                        boolean isAvailable = false;
                        System.out.println("enter the tittle of the book:");
                        String bookTittle = s.nextLine();
                        //s.nextLine();
                        System.out.println("enter the author of the book");
                        String bookAuthor =s.nextLine();
                        ///s.nextLine();
                        System.out.println("enter the count of the book");
                        int count = s.nextInt();
                        if(count>0) {
                            isAvailable = true;
                        }
                        library.addBook(bookTittle,bookAuthor,isAvailable,count);
                    }
                    else {
                        System.out.println("you are not allowd to add the book ");
                    }
                    break;
                }
                case 2:{
                    System.out.println("only admin allowed to replace the book ,are you the admin?");
                    String permission =s.next();
                    if(permission.equals("yes")) {
                        library.displayBooks();
                        System.out.println("enter the book id you wanted to remove from this library");
                        int bookId =s.nextInt();
                        library.removeBook(bookId);
                    }
                    else {
                        System.out.println("you are not allowed to remove the book ");
                    }
                    break;
                }

                case 3:{
                    System.out.println("only admin allowed to replace the book ,are you the admin?");
                    String permission =s.next();
                    if(permission.equals("yes")) {
                        library.displayBooks();
                        System.out.println("enter the book id you wanted to reduce from this library");
                        int bookId =s.nextInt();
                        System.out.println("enter the count, you wanted to reduce :");
                        int count =s.nextInt();
                        library.removeBookCount(bookId,count);
                    }
                    else {
                        System.out.println("you are not allowd to remove the book ");
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("please enter the book id:");
                    int id = s.nextInt();
                    library.searchBook(id);
                    break;
                }
                case 5:
                    library.displayBooks();
                    break;
            }
            System.out.println("do you want to continue");
            choice = s.nextInt();
        }
    }
}
/* OUTPUT
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.2.1\lib\idea_rt.jar=55601:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.2.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\sharm\OneDrive\Desktop\Java Tasks\Assignment3\OopPrograms\target\classes" org.example.BookManagementSystem
----------WELCOME------------
please enter your choice
1.Add Book
2.Remove Book
3.reduce count
4.Search Book
5.Display Book
1
only admin allowed to add the book ,are you the admin?
yes
enter the tittle of the book:
motor cycle diaries
enter the author of the book
che guara
enter the count of the book
50
do you want to continue
1
only admin allowed to add the book ,are you the admin?
yes
enter the tittle of the book:
chokkara
enter the author of the book
unknown
enter the count of the book
100
do you want to continue
1
only admin allowed to add the book ,are you the admin?
yes
enter the tittle of the book:
isai
enter the author of the book
thamizh
enter the count of the book
0
do you want to continue
5
Book Id:1
Book Tittle:che guara
Book Author:motor cycle diaries
Book Count:50
is Available:true
Book Id:2
Book Tittle:unknown
Book Author:chokkara
Book Count:100
is Available:true
Book Id:3
Book Tittle:thamizh
Book Author:isai
Book Count:0
is Available:false
do you want to continue
3
only admin allowed to replace the book ,are you the admin?
yes
Book Id:1
Book Tittle:che guara
Book Author:motor cycle diaries
Book Count:50
is Available:true
Book Id:2
Book Tittle:unknown
Book Author:chokkara
Book Count:100
is Available:true
Book Id:3
Book Tittle:thamizh
Book Author:isai
Book Count:0
is Available:false
enter the book id you wanted to reduce from this library
2
enter the count, you wanted to reduce :
50
do you want to continue
2
only admin allowed to replace the book ,are you the admin?
yes
Book Id:1
Book Tittle:che guara
Book Author:motor cycle diaries
Book Count:50
is Available:true
Book Id:2
Book Tittle:unknown
Book Author:chokkara
Book Count:50
is Available:true
Book Id:3
Book Tittle:thamizh
Book Author:isai
Book Count:0
is Available:false
enter the book id you wanted to remove from this library
2
do you want to continue
5
Book Id:1
Book Tittle:che guara
Book Author:motor cycle diaries
Book Count:50
is Available:true
Book Id:-1
Book Tittle:null
Book Author:null
Book Count:0
is Available:false
Book Id:3
Book Tittle:thamizh
Book Author:isai
Book Count:0
is Available:false
do you want to continue

 */