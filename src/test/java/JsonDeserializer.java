import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JsonDeserializer {

    ObjectMapper mapper = new ObjectMapper();


    public static List<Movie> getMovieListFromJson(File file) throws IOException {
    Movie[] moviesArray = new ObjectMapper().readValue(file, Movie[].class);
    return Arrays.asList(moviesArray);

}

}




