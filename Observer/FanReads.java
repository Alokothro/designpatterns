package Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * The FanReads class implements the Observer interface and represents a user's personalized
 * book recommendation list based on their preferences.
 */
public class FanReads implements Observer {
    private BestSellers bestSellers;
    private String firstName;
    private String lastName;
    private HashMap<Genre, List<Book>> recommendations;

    /**
     * Constructs a FanReads object with a reference to the BestSellers list and the user's name.
     * Registers this FanReads instance as an observer of the BestSellers list.
     *
     * @param bestSellers The BestSellers list that this FanReads instance will observe.
     * @param firstName   The first name of the FanReads user.
     * @param lastName    The last name of the FanReads user.
     */
    public FanReads(BestSellers bestSellers, String firstName, String lastName) {
        this.bestSellers = bestSellers;
        this.firstName = firstName;
        this.lastName = lastName;
        this.recommendations = new HashMap<>();

        // Register this FanReads instance as an observer of BestSellers
        bestSellers.registerObserver(this);
    }

    /**
     * Updates the user's recommendation list when a new book is added to the BestSellers list.
     * The book is added to the list of recommendations based on its genre.
     *
     * @param book The new book added to the BestSellers list.
     */
    @Override
    public void update(Book book) {
        // Add the book to the recommendations list based on its genre
        Genre genre = book.getGenre();
        if (!recommendations.containsKey(genre)) {
            recommendations.put(genre, new ArrayList<>());
        }
        recommendations.get(genre).add(book);
    }

    /**
     * Returns a list of recommended books based on the specified genre.
     *
     * @param genre The genre for which recommendations are requested.
     * @return A list of books in the specified genre, or an empty list if no books are available.
     */
    public List<Book> getRecommendations(Genre genre) {
        return recommendations.getOrDefault(genre, new ArrayList<>());
    }

    /**
     * Returns a string representation of the FanReads user.
     *
     * @return A string containing the user's first and last name.
     */
    @Override
    public String toString() {
        return "FanReads user: " + firstName + " " + lastName;
    }
}
