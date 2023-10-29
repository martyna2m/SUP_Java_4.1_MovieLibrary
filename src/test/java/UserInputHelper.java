import java.util.Scanner;

public class UserInputHelper {

    Scanner scan = new Scanner(System.in);

    public int getIntFromUser() {
        return scan.nextInt();
    }

    public String getTextFromUser() {
        return scan.nextLine();
    }

}
