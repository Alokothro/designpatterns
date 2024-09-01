package Observer;

/**
 * The Book class represents a book with a title, genre, author information, and a description.
 */
public class Book {
    private String title;
    private Genre genre;
    private String authorFirstName;
    private String authorLastName;
    private String description;

    /**
     * Constructs a Book object with the specified title, genre, author's first name, last name, and description.
     *
     * @param title The title of the book.
     * @param genre The genre of the book.
     * @param authorFirstName The first name of the author.
     * @param authorLastName The last name of the author.
     * @param description A brief description of the book.
     */
    public Book(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        this.title = title;
        this.genre = genre;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.description = description;
    }

    /**
     * Returns the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the genre of the book.
     *
     * @return The genre of the book.
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * Returns the first name of the author.
     *
     * @return The first name of the author.
     */
    public String getAuthorFirstName() {
        return authorFirstName;
    }

    /**
     * Returns the last name of the author.
     *
     * @return The last name of the author.
     */
    public String getAuthorLastName() {
        return authorLastName;
    }

    /**
     * Returns a brief description of the book.
     *
     * @return The description of the book.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns a string representation of the book, including the title, author's full name, and description.
     *
     * @return A string representation of the book.
     */
    @Override
    public String toString() {
        return title + " by: " + authorFirstName + " " + authorLastName + "\n" + description;
    }
}
