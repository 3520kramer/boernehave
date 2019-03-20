import java.util.*;
import java.io.*;

public class ChildHandler {

    Child child = new Child();

    public void addFromFile () throws Exception {
        Scanner scanread = new Scanner(new File("src/memberFile.txt"));
        scanread.useDelimiter("-");
        int count = 0;


        while (scanread.hasNext()){

            Child kid = new Child();
            count++;

            String text = scanread.next();
            kid.setFirstName(text);

            text = scanread.next();
            kid.setLastName(text);

            text = scanread.next();
            kid.setBirthDate(text);

            text= scanread.next();
            kid.setStreetName(text);

            int num = scanread.nextInt();
            kid.setStreetNumber(num);

            num= scanread.nextInt();
            kid.setPostalCode(num);

            text = scanread.next();
            kid.setCity(text);

            num= scanread.nextInt();
            kid.setContactPerson1(num);

            num = scanread.nextInt();
            kid.setContactPerson2(num);

            kid.getChildList().add(kid);

        }
    }

    public void addToFile() throws FileNotFoundException{
        PrintStream output = new PrintStream(new File("memberFile.txt"));

    }

    public void printTest() {
        System.out.println("Børn");

        for(Child ch : child.getChildList()) {
            System.out.println("First name: " + ch.getFirstName());
            System.out.println("Last name" + ch.getLastName());
        }
    }

    public void registerNewChild() throws FileNotFoundException{
        Scanner input = new Scanner(System.in);

        Child child = new Child();

        System.out.println("Indtast fornavn: ");
        String text = input.nextLine();
        child.setFirstName(text);

        System.out.println("Indtast efternavn:");
        text = input.nextLine();
        child.setLastName(text);

        System.out.println("Indtast fødselsdagsdato: ");
        text = input.nextLine();
        child.setBirthDate(text);

        System.out.println("Indtast vejnavn: ");
        text = input.nextLine();
        child.setStreetName(text);

        System.out.println("Indtast husnummer: ");
        int num = input.nextInt();
        child.setStreetNumber(num);

        System.out.println("Indtast postnummer: ");
        num = input.nextInt();
        child.setPostalCode(num);

        System.out.println("Indtast by: ");
        text = input.nextLine();
        child.setCity(text);

        System.out.println("Indtast kontaktperson nr. 1s telefonnummer: ");
        num = input.nextInt();
        child.setContactPerson1(num);

        System.out.println("Indtast kontaktperson nr. 2s telefonnummer: ");
        num = input.nextInt();
        child.setContactPerson2(num);

    }


}
