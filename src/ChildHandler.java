import java.util.*;
import java.io.*;

public class ChildHandler {

    public void addFromFile () throws Exception {
        Scanner scanread = new Scanner(new File("memberFile.txt"));
        scanread.useDelimiter("-");
        int count = 0;


        while (scanread.hasNext()){
            Child child = new Child();
            count++;

            String firstName = scanread.next();
            child.setFirstName(firstName);

            String lastName = scanread.next();
            child.setLastName(lastName);

            int birthDate = scanread.nextInt();




        }
    }
}
