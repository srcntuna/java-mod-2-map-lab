import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Library library = new Library();

        try (Scanner scanner = new Scanner(System.in)) {
            String option = chosenOption(scanner);

            if (option.equals("1")) {
                addBookToLibrary(library, scanner);
            } else if (option.equals("2")) {
                lookupBookFromLibrary(library, scanner);
            } else {
                System.out.println(option);
            }
        }

    }

    public static String chosenOption(Scanner scanner) {
        String input;
        System.out.println("Welcome To the Library!");
        System.out.println(" ----------- Options -------------- ");
        System.out.println("|  1.    Add a book to the Library  |");
        System.out.println("|  2.    Look up an existing book   |");
        System.out.println("|  3.    Exit Library               |");
        System.out.println(" ----------------------------------- ");
        System.out.println("Please choose an option above: ");
        input = scanner.nextLine();

        if (!input.equals("1") && !input.equals("2")) {
            return "Goodbye!";
        }

        return input;

    }

    public static void addBookToLibrary(Library library, Scanner scanner) {

        while (true) {

            System.out.println("Please write the title of the book:");
            String inputTitle = scanner.nextLine();
            System.out.println("Please write the genre of the book:");
            String inputGenre = scanner.nextLine();
            System.out.println("Please write the number of pages of the book:");
            String inputStrNumber = scanner.nextLine();
            int inputNum = Integer.parseInt(inputStrNumber);

            Book newBook = new Book(inputTitle, inputGenre, inputNum);

            library.addBook(inputTitle, newBook);

            System.out.println(inputTitle + " has been added to the Library!");
            System.out.println("Do you want to add more books to the library? (y/n):");
            String answer = scanner.nextLine();

            if (answer.equals("n")) {
                System.out.println("Goodbye!");
                break;
            }

        }

    }

    public static void lookupBookFromLibrary(Library library, Scanner scanner) {

        while (true) {

            System.out.println("Please write the title of the book:");
            String inputTitle = scanner.nextLine();

            Book bookDetails = library.getBook(inputTitle);

            if (bookDetails != null) {
                System.out.println("You lucky! we have that book in the Library!");
                System.out.println("Here is the details of the book: ");
                System.out.println("Title: " + bookDetails.getTitle());
                System.out.println("Genre: " + bookDetails.getGenre());
                System.out.println("NumOfPages: " + bookDetails.getNumOfPages());

            } else {
                System.out.println("Sorry... We  dont have that book in the Library...");

            }

            System.out.println("Do you want to lookup more books to the library? (y/n):");
            String answer = scanner.nextLine();

            if (answer.equals("n")) {
                System.out.println("Goodbye!");
                break;
            }

        }

    }

}
