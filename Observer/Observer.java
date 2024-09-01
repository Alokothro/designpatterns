package Observer;

/**
 * The Observer interface should be implemented by any class that wishes to be notified 
 * when a new book is added to the BestSellers list. The implementing class will define 
 * the behavior that occurs when it is updated with a new book.
 */
public interface Observer {
    
    /**
     * Called when a new book is added to the BestSellers list.
     * 
     * @param book The new book that has been added.
     */
    void update(Book book);
}
