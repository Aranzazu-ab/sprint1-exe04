package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
   private List<String> books;

    public Library(){
        books = new ArrayList<>();
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }



}
