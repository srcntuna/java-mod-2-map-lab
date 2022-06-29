import java.util.HashMap;

public class Library {

  private HashMap<String, Book> library;

  public Library() {
    this.library = new HashMap<>();
    var beloved = new Book("Beloved", "Fiction", 300);
    library.put(beloved.getTitle(), beloved);
    var doktorZivago = new Book("DoctorZivago", "Romance", 450);
    library.put(doktorZivago.getTitle(), doktorZivago);

  }

  public void addBook(String title, Book book) {

    library.put(title.toLowerCase(), book);

  }

  public Book getBook(String title) {

    return library.get(title.toLowerCase());

  }

}
