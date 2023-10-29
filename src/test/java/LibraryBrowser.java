import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LibraryBrowser {
    UserInputHelper userInputHelper = new UserInputHelper();
    MovieLibrary movieLibrary = new MovieLibrary();
    private List<Movie> library = movieLibrary.getMovieLibrary();


    public LibraryBrowser() throws IOException {
    }

    public void getMoviesBasedOnDates() {
        MenuHelper.printInstruction1();
        int fromDate = userInputHelper.getIntFromUser();
        int toDate = userInputHelper.getIntFromUser();
        List<String> chosenMovies = new ArrayList<>();
        library.stream()
                .filter(movie -> (movie.getYear() >= fromDate) && (movie.getYear() <= toDate))
                .map(Movie::getTitle)
                .forEach(chosenMovies::add);

        if (chosenMovies.isEmpty()) {
            MenuHelper.printAlert();
        } else System.out.println("Movies produced between " + fromDate + " and " + toDate + ": " + chosenMovies);
    }


    public void getRandomMovieInfo() {
        int randomInt = new Random().nextInt(library.size());
        System.out.println(library.get(randomInt));

    }

    public void getMoviesBasedOnActor() {
        MenuHelper.printInstruction3();
        String fullName = userInputHelper.getTextFromUser();
        List<String> chosenMovies = new ArrayList<>();
        library.stream()
                .filter(movie -> movie.getActors().stream().anyMatch(actor -> actor.toString().equals(fullName)))
                .map(Movie::getTitle)
                .forEach(chosenMovies::add);

        if (chosenMovies.isEmpty()) {
            MenuHelper.printAlert();
        } else System.out.println("Movies in which " + fullName + " starred: " + chosenMovies);
    }
}
