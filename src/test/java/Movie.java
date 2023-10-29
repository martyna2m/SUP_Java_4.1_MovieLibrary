import java.util.List;

public class Movie {
    private String title;
    private int year;
    private Director director;
    private String genre;
    private List<Actor> actors;


    public Movie() {
    }

    public String getTitle() {
        return title;
    }


    public int getYear() {
        return year;
    }


    public Director getDirector() {
        return director;
    }


    public String getGenre() {
        return genre;
    }


    public List<Actor> getActors() {
        return actors;
    }


    @Override
    public String toString() {
        return "title: " + title + "\n" +
                "year: " + year + "\n" +
                "director: " + director + "\n" +
                "genre: " + genre + "\n" +
                "actors: " + actors.toString();
    }
}
