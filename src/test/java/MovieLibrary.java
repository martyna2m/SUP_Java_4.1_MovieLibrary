import java.io.File;
import java.io.IOException;
import java.util.List;

public class MovieLibrary {

    private List<Movie> movieLibrary = JsonDeserializer.getMovieListFromJson(new File("src/test/resources/movies_library_1.json"));

    public MovieLibrary() throws IOException {
    }

    public List<Movie> getMovieLibrary() {
        return movieLibrary;
    }


}

