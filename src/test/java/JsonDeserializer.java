import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JsonDeserializer {

    static ObjectMapper mapper = new ObjectMapper();


    public static List<Movie> getMovieLibraryFromJson(File file) throws IOException {
        return Arrays.asList(mapper.readValue(file, Movie[].class));

    }
}
