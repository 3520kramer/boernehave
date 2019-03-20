import java.util.*;
import java.io.*;

public class ChildHandler {

    LinkedList<Child> childList = new LinkedList<Child>();

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

            childList.add(kid);

        }
    }

    public void addToFile() throws FileNotFoundException{
        PrintStream output = new PrintStream(new File("memberList.txt"));
        for (Child ch : childList){
            output.print(ch.getFirstName()+"-"+ch.getLastName()+"-"+ch.getBirthDate()+"-"+ch.getStreetName() +"-"+ch.getStreetNumber()+"-"
                    +ch.getPostalCode()+"-"+ch.getCity()+"-"+ch.getContactPerson1()+"-"+ch.getContactPerson2());
        }
    }

    public void printTest() {
        System.out.println("Børn: ");

        for(Child ch : childList) {
            System.out.println("Fornavn: " + ch.getFirstName());
            System.out.println("Efternavn: " + ch.getLastName());
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
