package L1Exe1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
   private final List<String> books;

    public Library(){
        books = new ArrayList<>();
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }

    public void addBook (String title){
       validateTitle(title);
       validateContainsTitle(title);
       books.add(title);
    }

    public void addBook (int position, String title){
        validateTitle(title);
        validatePosition(position);
        validateContainsTitle(title);
        books.add(position, title);
    }

    public String getBook (int position){
        if (position < 0 || position >= books.size()) {
            throw new IllegalArgumentException("Position must be within the list.");
        }
        return books.get(position);
    }

    public void deleteBook (String title){
        validateTitle(title);
        if(!books.contains(title)){
            throw new IllegalArgumentException("The title isn't in the library");
        }
        books.remove(title);
    }

    public List<String> getSortedBooksAbc () {
        List<String> sortedBooks = new ArrayList<>(books);
        Collections.sort(sortedBooks);
        return sortedBooks;
    }

    private void validateTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or blank.");
        }
    }

    private void validatePosition(int position){
        if (position < 0 || position > books.size()) {
            throw new IllegalArgumentException("Position must be within the list.");
        }
    }

    private void validateContainsTitle (String title){
        if (books.contains(title)){
            throw new IllegalArgumentException("This title is already in the list");
        }
    }

}
