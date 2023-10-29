public class MenuHelper {

    public static void displayMenu() {
        System.out.println("""
                                
                What do you want to do? Choose an option from 1 to 3:
                1 - Get movie titles produced in given period of time
                2 - Display all information about random movie from the library
                3 - Get movie titles based on the actor
                4 - Close the program""");
    }

    public static void printInstruction1() {
        System.out.println("Please put in the range of dates for which you want to see the movies produced, e.g. 1990 - 1995");
    }

    public static void printInstruction3() {
        System.out.println("Please put in a full name of the actor to see the movie titles they starred in, e.g. Tom Hanks");
    }

    public static void printClosingInfo() {
        System.out.println("Program closed");
    }

    public static void printAlert() {
        System.out.println("No movies that meet conditions were found");
    }
}
