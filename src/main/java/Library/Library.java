package Library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
   private List<String> books;

    public Library(){
        books = new ArrayList<>();
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }

    public void addBook (String title){
        if (!books.contains(title)){
            books.add(title);
        }
    }

    public void addBook (int position, String title){
        if (!books.contains(title)){
            books.add(position, title);
        }
    }

    public String getBook (int position){
        return books.get(position);
    }

    public void deleteBook (String title){
        if (books.contains(title)){
            books.remove(title);
        }
    }

    public List<String> getSortedBooksAbc () {
        List<String> sortedBooks = new ArrayList<>(books);
        Collections.sort(sortedBooks);
        return sortedBooks;
    }

}
