import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LibraryService {

    MovieLibrary movieLibrary;
    private List<Movie> movies;


    public LibraryService(MovieLibrary movieLibrary) {
        this.movieLibrary = movieLibrary;
        movies = movieLibrary.getMovieList();
    }

    public void getMoviesBasedOnDates(int fromDate, int toDate) {
        List<String> chosenMovies = new ArrayList<>();
        movies.stream()
                .filter(movie -> (movie.getYear() >= fromDate) && (movie.getYear() <= toDate))
                .map(Movie::getTitle)
                .forEach(chosenMovies::add);

        if (chosenMovies.isEmpty()) {
            MenuHelper.printAlert();
            return;
        }
        System.out.println("Movies produced between " + fromDate + " and " + toDate + ": " + chosenMovies);
    }


    public Movie getRandomMovieInfo() {
        int randomInt = new Random().nextInt(movies.size());
       return movies.get(randomInt);
    }

    public void getMoviesBasedOnActor(String fullName) {
        List<String> chosenMovies = new ArrayList<>();
        movies.stream()
                .filter(movie -> movie.getActors().stream().anyMatch(actor -> actor.toString().equals(fullName)))
                .map(Movie::getTitle)
                .forEach(chosenMovies::add);

        if (chosenMovies.isEmpty()) {
            MenuHelper.printAlert();
            return;
        }
        System.out.println("Movies that " + fullName + " starred in: " + chosenMovies);
    }
}
