package Observer;

/**
 * The Subject interface represents the observable entity in the observer pattern.
 * It defines methods for registering, removing, and notifying observers. 
 * Any class that wants to allow other classes (observers) to observe its state 
 * changes should implement this interface.
 */
public interface Subject {

    /**
     * Registers an observer to receive updates when the state of the subject changes.
     *
     * @param observer The observer to be registered.
     */
    void registerObserver(Observer observer);

    /**
     * Removes a registered observer so that it no longer receives updates.
     *
     * @param observer The observer to be removed.
     */
    void removeObserver(Observer observer);

    /**
     * Notifies all registered observers of a change in the subject's state.
     *
     * @param book The new book that has been added, triggering the notification.
     */
    void notifyObservers(Book book);
}
