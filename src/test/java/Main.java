import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        UserInputHelper userInputHelper = new UserInputHelper();
        LibraryBrowser libraryBrowser = new LibraryBrowser();


        while (true) {
            MenuHelper.displayMenu();
            int option = userInputHelper.getIntFromUser();
            switch (option) {
                case 1 -> libraryBrowser.getMoviesBasedOnDates();
                case 2 -> libraryBrowser.getRandomMovieInfo();
                case 3 -> libraryBrowser.getMoviesBasedOnActor();
                case 4 -> {
                    MenuHelper.printClosingInfo();
                    System.exit(0);
                }
                default -> MenuHelper.printAlert();
            }
        }

    }
}



