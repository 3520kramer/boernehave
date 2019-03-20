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

            String text = scanread.next();
            child.setFirstName(text);

            text = scanread.next();
            child.setLastName(text);

            text = scanread.next();
            child.setBirthDate(text);

            text= scanread.next();
            child.setStreetName(text);

            int num = scanread.nextInt();
            child.setStreetNumber(num);

            num= scanread.nextInt();
            child.setPostalCode(num);

            text = scanread.next();
            child.setCity(text);

            num= scanread.nextInt();
            child.setContactPerson1(num);

            num = scanread.nextInt();
            child.setContactPerson2(num);






        }
    }

    public void addToFile() throws FileNotFoundException{
        PrintStream output = new PrintStream(new File("memberFile.txt"));



    }

    public void registerNewChild() throws FileNotFoundException{
        Scanner input = new Scanner(System.in);

        Child child = new Child();

        System.out.println("Indtast fornavn: ");
        String var = input.nextLine();
        child.setFirstName(var);

        System.out.println("Indtast efternavn:");
        var = input.nextLine();
        child.setLastName(var);

        System.out.println("Indtast fødselsdagsdato: ");
        var = input.nextLine();
        child.setBirthDate(var);

        System.out.println("Indtast vejnavn: ");
        var = input.nextLine();
        child.setStreetName(var);

        System.out.println("Indtast husnummer: ");
        int num = input.nextInt();
        child.setStreetNumber(num);

        System.out.println("Indtast postnummer: ");
        num = input.nextInt();
        child.setPostalCode(num);

        System.out.println("Indtast by: ");
        var = input.nextLine();
        child.setCity(var);

        System.out.println("Indtast kontaktperson nr. 1s telefonnummer: ");
        num = input.nextInt();
        child.setContactPerson1(num);

        System.out.println("Indtast kontaktperson nr. 2s telefonnummer: ");
        int cPerson2 = input.nextInt();
        child.setContactPerson2(num);

    }
}
