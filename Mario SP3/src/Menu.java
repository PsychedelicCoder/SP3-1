import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {
    /*
@AUTHOR_JENBO
 */

// Der skal være et text document, hvor man skal kunne tilføje flere Pizza'er,
// der er allerede givet de første 14 Pizza'er, vi skal så tilføje resten til vi rammer 30.
// Denne klasse skal kunne læse dette text document.

    public static void readFile() {
        try {
            File myMenu = new File("C:\\Users\\Oliver MARTIN\\IdeaProjects\\SP3\\Ressources\\Menu.csv");
            Scanner myReader = new Scanner(myMenu);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

