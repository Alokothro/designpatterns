package Observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * The Store class implements the Observer interface and represents a store that keeps track of 
 * the best-selling books. It observes the BestSellers list and updates its own list of 
 * bestsellers when new books are added.
 */
public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    /**
     * Constructs a Store object and registers it as an observer of the provided Subject (BestSellers).
     * 
     * @param subject The BestSellers subject that this Store will observe.
     */
    public Store(Subject subject) {
        this.subject = subject;
        this.bestSellers = new LinkedList<>();
        subject.registerObserver(this);
    }

    /**
     * Updates the store's bestseller list when a new book is added to the BestSellers list.
     * The store keeps track of the latest 5 bestsellers.
     *
     * @param book The new book added to the BestSellers list.
     */
    @Override
    public void update(Book book) {
        bestSellers.add(book);
        if (bestSellers.size() > 5) {  // Assuming the store keeps only the latest 5 bestsellers
            bestSellers.poll();
        }
    }

    /**
     * Returns a list of the current bestsellers in the store.
     *
     * @return A list of the latest best-selling books in the store.
     */
    public List<Book> getBestSellers() {
        return new ArrayList<>(bestSellers); // Convert Queue to List
    }
}
