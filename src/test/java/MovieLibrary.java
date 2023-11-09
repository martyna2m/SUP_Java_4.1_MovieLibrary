import java.util.List;

public class MovieLibrary {

    private List<Movie> movieList;

    public MovieLibrary(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }
}

