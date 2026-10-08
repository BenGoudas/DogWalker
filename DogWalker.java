import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DogWalker {

    public static int Money(String companyNumber, String maxDogs, String startTime, String endTime) throws FileNotFoundException {
        File f = new File("companies.txt");
        java.util.Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            if (s.nextLine().equals(companyNumber)) {
                return 1;
            }
        }

        return 0;
    }
}