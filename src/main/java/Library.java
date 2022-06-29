import java.util.HashMap;

public class Library {

  private HashMap<String, Book> library;

  public Library() {
    this.library = new HashMap<>();
    library.put("Beloved", new Book("Beloved", "Fiction", 300));
    library.put("DoctorZivago", new Book("DoctorZivago", "Romance", 450));

  }

  public void addBook(String title, Book book) {

    library.put(title, book);

  }

  public Book getBook(String title) {

    return library.get(title);

  }

}
