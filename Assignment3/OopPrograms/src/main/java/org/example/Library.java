package org.example;

public class Library {
    static int bookId =1;
    Book[] books =new Book[10];

    public void addBook(String bookAuther,String bookTitle,boolean isAvailable,int count){
        books[bookId-1] =new Book(bookId,bookTitle,bookAuther,isAvailable,count);
        bookId++;
    }

    public void removeBookCount(int bookId,int count){
       // Book book = books[bookId-1];
        if(books[bookId-1].getCount()<count){
            System.out.println("given book count is greater then the actual count");
        }
        else{
            books[bookId-1].setCount(books[bookId-1].getCount()-count);
            if(books[bookId-1].getCount()<=0){
                books[bookId-1].setAvailable(false);
            }
        }
    }

    public void removeBook(int bookId){
        books[bookId-1].setBookId(-1);
        books[bookId-1].setAuthor(null);
        books[bookId-1].setTitle(null);
        books[bookId-1].setCount(0);
        books[bookId-1].setAvailable(false);
    }

    public void searchBook(int id){
        if(id<=0 || id>bookId){
            System.out.println("book is not available");
        }
        else if(books[id-1].getTitle() == null){
            System.out.println("searching book is removed from this library");
        }else{
            System.out.println("Book Id:"+books[id-1].getBookId());
            System.out.println("Book Tittle:"+books[id-1].getTitle());
            System.out.println("Book Author:"+books[id-1].getAuthor());
            System.out.println("Book Count:"+books[id-1].getCount());
            System.out.println("is Available:"+books[id-1].isAvailable());
        }
    }

    public void displayBooks(){
        for(int i=0;i<bookId-1;i++){
            System.out.println("Book Id:"+books[i].getBookId());
            System.out.println("Book Tittle:"+books[i].getTitle());
            System.out.println("Book Author:"+books[i].getAuthor());
            System.out.println("Book Count:"+books[i].getCount());
            System.out.println("is Available:"+books[i].isAvailable());
        }
    }
}
