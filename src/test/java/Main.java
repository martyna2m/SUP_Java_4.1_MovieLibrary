import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        MovieLibrary movieLibrary = new MovieLibrary(JsonDeserializer.getMovieLibraryFromJson(new File("src/test/resources/movies_library_1.json")));

        UserInputHelper userInputHelper = new UserInputHelper();
        LibraryService libraryBrowser = new LibraryService(movieLibrary);


        while (true) {
            MenuHelper.displayMenu();
            int option = userInputHelper.getIntFromUser();
            switch (option) {
                case 1 -> {
                    MenuHelper.printInstruction1();
                    libraryBrowser.getMoviesBasedOnDates(userInputHelper.getIntFromUser(), userInputHelper.getIntFromUser());
                }
                case 2 -> System.out.println(libraryBrowser.getRandomMovieInfo());
                case 3 -> {
                    MenuHelper.printInstruction3();
                    userInputHelper.getTextFromUser();
                    String name = userInputHelper.getTextFromUser();
                    libraryBrowser.getMoviesBasedOnActor(name);
                }
                case 4 -> {
                    MenuHelper.printClosingInfo();
                    System.exit(0);
                }
                default -> MenuHelper.printAlert();
            }
        }

    }
}
