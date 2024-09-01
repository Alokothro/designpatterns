package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The BestSellers class implements the Subject interface.
 * It maintains a list of best-selling books and notifies registered observers when a new book is added.
 */
public class BestSellers implements Subject {
    private List<Observer> observers;
    private List<Book> bestSellers;

    /**
     * Constructs a BestSellers object.
     * Initializes the list of observers and the list of best-selling books.
     */
    public BestSellers() {
        this.observers = new ArrayList<>();
        this.bestSellers = new ArrayList<>();
    }

    /**
     * Registers an observer to receive updates when a new book is added to the bestsellers list.
     *
     * @param observer The observer to be registered.
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes a registered observer from the list.
     *
     * @param observer The observer to be removed.
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all registered observers of a newly added book.
     *
     * @param book The book that was added to the bestsellers list.
     */
    @Override
    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }

    /**
     * Adds a new book to the bestsellers list and notifies all registered observers.
     *
     * @param title The title of the book.
     * @param genre The genre of the book.
     * @param authorFirstName The first name of the author.
     * @param authorLastName The last name of the author.
     * @param description A brief description of the book.
     */
    public void addBook(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        Book book = new Book(title, genre, authorFirstName, authorLastName, description);
        bestSellers.add(book);
        notifyObservers(book);
    }
}
